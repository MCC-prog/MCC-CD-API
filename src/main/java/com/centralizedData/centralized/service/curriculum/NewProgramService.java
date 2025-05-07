package com.centralizedData.centralized.service.curriculum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.dto.curriculum.NewProgramRequestDto;
import com.centralizedData.centralized.dto.curriculum.NewProgramResponseDto;
import com.centralizedData.centralized.exception.CustomException;
import com.centralizedData.centralized.exception.ResourceNotFoundException;
import com.centralizedData.centralized.model.curriculum.NewProgram;
import com.centralizedData.centralized.model.curriculum.NewProgramDocuments;
import com.centralizedData.centralized.repository.DepartmentRepository;
import com.centralizedData.centralized.repository.EmpStreamRepository;
import com.centralizedData.centralized.repository.ProgramRepository;
import com.centralizedData.centralized.repository.ProgramTypeRepository;
import com.centralizedData.centralized.repository.UserRepository;
import com.centralizedData.centralized.repository.Curriculum.NewProgramDao;
import com.centralizedData.centralized.repository.Curriculum.NewProgramDocumentsDao;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.utils.CommonUtil;

@Service
@Transactional
public class NewProgramService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NewProgramService.class);

	@Value("${kp.curriculum.newProgtam}")
	private String newProgtamPath;
	
	@Autowired
	private NewProgramDao newProgramDao;
	
	@Autowired
	private EmpStreamRepository streamRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProgramTypeRepository programTypeRepository;

	@Autowired
	private ProgramRepository programRepository;
	
	@Autowired
	private CommonUtil commonUtil;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private NewProgramDocumentsDao newProgramDocumentsDao;

	public NewProgramResponseDto saveNewProgram(NewProgramRequestDto newProgramRequestDto) {
		NewProgram newProgramBO = saveCurriculumNewProgram(newProgramRequestDto);
		newProgramDao.save(newProgramBO);
		LOGGER.info("newProgram saved successfully.");
		return NewProgramResponseDto.fromNewProgram(newProgramBO);
	}

	private NewProgram saveCurriculumNewProgram(NewProgramRequestDto dto) {
		NewProgram newProgram = NewProgram.builder()
				.academicYear(dto.getAcademicYear())
				.semType(dto.getSemType())
				.semesterNo(dto.getSemesterNo())
				.introductionYear(commonUtil.convertStringToLocalDate(dto.getYearOfIntroduction()))
				.ProgramName(dto.getProgramName())
				.stream(streamRepository.findById(dto.getStreamId()).get())
				.department(departmentRepository.findById(dto.getDepartmentId()).get())
				.programType(programTypeRepository.findById(dto.getProgramTypeId()))
				.program(programRepository.findById(dto.getProgramId()).get())
				.createdBy(commonUtil.getLoggedInUserDetails().getUserId().toString())
				.createdDate(LocalDate.now())
				.isActive(true).build();
		newProgram.setNewProgramDocuments(getNewProgramDocuments(dto, newProgram));
		return newProgram;
	}

	private Set<NewProgramDocuments> getNewProgramDocuments(NewProgramRequestDto dto, NewProgram newProgram) {
		Set<NewProgramDocuments> documents = new HashSet<NewProgramDocuments>();
		NewProgramDocuments doc = null;
		if (dto.getMom() != null && !dto.getMom().isEmpty()) {
			doc = saveNewProgramFile(dto.getMom(), "mom", newProgram);
			documents.add(doc);
		}
		if (dto.getSyllabus() != null && !dto.getSyllabus().isEmpty()) {
			doc = saveNewProgramFile(dto.getSyllabus(), "syllabus", newProgram);
			documents.add(doc);
		}
		return documents;
	}
	
	
	private NewProgramDocuments saveNewProgramFile(MultipartFile multiPartFile, String docType, NewProgram newProgram) {
		Map<String, String> file = commonUtil.getFileDetails(multiPartFile, newProgtamPath);
		NewProgramDocuments documents = null;
		if (null != file && !file.isEmpty()) {
			documents = new NewProgramDocuments();
			documents.setNewProgram(newProgram);
			documents.setFileName(file.get("FileName"));
			documents.setFileType(file.get("FileType"));
			documents.setFileSize(Integer.valueOf(file.get("FileSize")));
			documents.setDocType(docType);
			documents.setCreatedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
			documents.setCreatedDate(LocalDate.now());
			documents.setIsActive(true);
		}
		return documents;
	}

	public Optional<NewProgramResponseDto> getNewProgramById(Long newProgramId) {
		NewProgram newProgram = newProgramDao.findByIdAndIsActive(newProgramId, true);
		return null != newProgram ? Optional.of(NewProgramResponseDto.fromNewProgram(newProgram)) : Optional.empty();
	}

	public List<NewProgramResponseDto> getAllActiveNewProgram() {
		List<NewProgram> newProgram = newProgramDao.findByIsActive(true);
		List<NewProgramResponseDto> newProgramResponseDtos = newProgram.stream()
				.map(NewProgramResponseDto::fromNewProgram)
				.collect(Collectors.toList());
		return newProgramResponseDtos;
	}

	public List<NewProgramResponseDto> getDeptWiseNewProgram(Integer userId) {
		Long departmentId = commonUtil.getLoggedInDepartmentId(userId);
		if (null != departmentId) {
			List<Integer> userIds = userRepository.findUserIdsByDeptId(departmentId);
			if (null != userIds && !userIds.isEmpty()) {
				List<String> userIdsAsString = userIds.stream().map(String::valueOf).collect(Collectors.toList());
				List<NewProgram> newProgram = newProgramDao.getByCreatedIds(userIdsAsString);
				List<NewProgramResponseDto> newProgramResponseDto = newProgram.stream()
						.map(NewProgramResponseDto::fromNewProgram)
						.collect(Collectors.toList());
				return newProgramResponseDto;
			}
		}
		return new ArrayList<NewProgramResponseDto>();
	}

	public List<NewProgramResponseDto> getNewProgramByCreatedBy(String userId) {
		List<NewProgram> newProgram = newProgramDao.findByCreatedByAndIsActive(userId, true);
		List<NewProgramResponseDto>  bosResponseDto = newProgram.stream()
				.map(NewProgramResponseDto::fromNewProgram)
				.collect(Collectors.toList());
		return bosResponseDto;
	}

	public NewProgramResponseDto updateNewProgram(NewProgramRequestDto newProgramRequestDto) {
		NewProgram newProgramBO = saveCurriculumNewProgram(newProgramRequestDto);
		newProgramBO.setId(newProgramRequestDto.getNewProgramId());
		newProgramBO.setLastModifiedDate(LocalDateTime.now());
		newProgramBO.setModifiedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
		newProgramDao.save(newProgramBO);
		newProgramBO = newProgramDao.findById(newProgramRequestDto.getNewProgramId()).get();
		return NewProgramResponseDto.fromNewProgram(newProgramBO);
	}

	public void deleteNewProgramById(Long newProgramId) {
		JwtUserDetails details = commonUtil.getLoggedInUserDetails();
		
		NewProgram newProgramBO = newProgramDao.findById(newProgramId)
				.orElseThrow(() -> new ResourceNotFoundException
						("NewProgram record not found with ID: " + newProgramId));

		newProgramBO.setIsActive(false);
		newProgramBO.setModifiedBy(details.getUserId().toString());
		newProgramBO.setLastModifiedDate(LocalDateTime.now());
		newProgramDao.save(newProgramBO);
		
		Set<NewProgramDocuments> newProgramDocuments = newProgramBO.getNewProgramDocuments();

		for (NewProgramDocuments newProgramDoc : newProgramDocuments) {
			String filePath = newProgtamPath + newProgramDoc.getFileName();
			Path path = Paths.get(filePath);
			try {
				if (Files.exists(path)) {
					Files.delete(path);
					LOGGER.info("Deleted file: {}", filePath);
				} else {
					LOGGER.warn("File not found: {}", filePath);
				}
			} catch (IOException e) {
				LOGGER.error("Failed to delete file: {}", filePath, e);
				throw new CustomException("Failed to delete file: " + filePath);
			}
		}
		
		newProgramDocumentsDao.deleteByNewProgramId(newProgramBO.getId());
	}

	public Boolean deleteNewProgramDocument(Long newProgramId) {
		List<NewProgramDocuments> newProgramDocuments = newProgramDocumentsDao.findByNewProgram_Id(newProgramId);

		for (NewProgramDocuments doc : newProgramDocuments) {
			String filePath = newProgtamPath + doc.getFileName();
			Path path = Paths.get(filePath);
			try {
				if (Files.exists(path)) {
					Files.delete(path);
					LOGGER.info("Deleted file: {}", filePath);
				} else {
					LOGGER.warn("File not found: {}", filePath);
				}
			} catch (IOException e) {
				LOGGER.error("Failed to delete file: {}", filePath, e);
				throw new CustomException("Failed to delete file: " + filePath);
			}
		}
		newProgramDocumentsDao.deleteAll(newProgramDocuments);
		return true;
	}
	
	
	
	
	

}
