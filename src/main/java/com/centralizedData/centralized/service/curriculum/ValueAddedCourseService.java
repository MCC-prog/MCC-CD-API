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

import com.centralizedData.centralized.dto.curriculum.ValueAddedCourseRequestDto;
import com.centralizedData.centralized.dto.curriculum.ValueAddedCourseResponseDto;
import com.centralizedData.centralized.exception.CustomException;
import com.centralizedData.centralized.exception.ResourceNotFoundException;
import com.centralizedData.centralized.model.curriculum.ValueAddedCourse;
import com.centralizedData.centralized.model.curriculum.ValueAddedCourseDocuments;
import com.centralizedData.centralized.repository.DepartmentRepository;
import com.centralizedData.centralized.repository.EmpStreamRepository;
import com.centralizedData.centralized.repository.UserRepository;
import com.centralizedData.centralized.repository.Curriculum.ValueAddedCourseDao;
import com.centralizedData.centralized.repository.Curriculum.ValueAddedCourseDocumentDao;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.utils.CommonUtil;

@Service
@Transactional
public class ValueAddedCourseService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ValueAddedCourseService.class);

	@Value("${kp.curriculum.valueAddedCourse}")
	private String valueAddedCoursePath;
	
	@Autowired
	private EmpStreamRepository streamRepository;

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private UserRepository userRepository;
		
	@Autowired
	private ValueAddedCourseDao valueAddedCourseDao;
		
	@Autowired
	private ValueAddedCourseDocumentDao valueAddedCourseDocumentDao;
		
	@Autowired
	private CommonUtil commonUtil;

	public ValueAddedCourseResponseDto saveValueAddedCourse(ValueAddedCourseRequestDto valueAddedCourseRequestDto) {
		ValueAddedCourse valueAddedCourseBO = saveCurriculumValueAddedCourse(valueAddedCourseRequestDto);
		valueAddedCourseDao.save(valueAddedCourseBO);
		LOGGER.info("ValueAddedCourse saved successfully.");
		return ValueAddedCourseResponseDto.fromValueAddedCourse(valueAddedCourseBO);
	}

	private ValueAddedCourse saveCurriculumValueAddedCourse(ValueAddedCourseRequestDto dto) {
		ValueAddedCourse bo = new ValueAddedCourse();
		
		bo.setAcademicYear(dto.getAcademicYear());		
		bo.setStream(streamRepository.findById(dto.getStreamId()).get());
		bo.setDepartment(departmentRepository.findById(dto.getDepartmentId()).get());
		bo.setRegisterNo(dto.getRegisterNo().toString());
		bo.setStudentName(dto.getStudentName());
		bo.setCourseTitle(dto.getCourseTitle());
		bo.setStudentsEnrolled(dto.getNoOfStudentsEnrolled());
		bo.setStudentsCompleted(dto.getNoOfStudentsCompleted());
		bo.setStartDate(commonUtil.convertStringToLocalDate(dto.getStartDate()));
		bo.setEndDate(commonUtil.convertStringToLocalDate(dto.getEndDate()));
		bo.setResoursePerson(dto.getResourcePerson());
		bo.setOrganization(dto.getOrganization());
		bo.setNoOfCredits(dto.getNoOfCredits());
		bo.setCreatedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
		bo.setCreatedDate(LocalDate.now());
		bo.setIsActive(true);
		bo.setValueAddedCourseDocuments(uplodingExcel(dto, bo));
		return bo;
	}
	
	
	private Set<ValueAddedCourseDocuments> uplodingExcel(ValueAddedCourseRequestDto dto,
			ValueAddedCourse bo) {
		Set<ValueAddedCourseDocuments> documents = new HashSet<ValueAddedCourseDocuments>();
		ValueAddedCourseDocuments doc = null;
		if (dto.getExcel() != null && !dto.getExcel().isEmpty()) {
			doc = saveFile(dto.getExcel(), "valueAddedCourse", bo);
			documents.add(doc);
		}
		return documents;
	}
	
	
	private ValueAddedCourseDocuments saveFile(MultipartFile multiPartFile, String docType,
			ValueAddedCourse bo) {
		Map<String, String> file = commonUtil.getFileDetails(multiPartFile, valueAddedCoursePath);
		ValueAddedCourseDocuments documents = null;
		if (null != file && !file.isEmpty()) {
			documents = new ValueAddedCourseDocuments();
			documents.setValueAddedCourse(bo);
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

	public Optional<ValueAddedCourseResponseDto> getvalueAddedCourseId(Long valueAddedCourseId) {
		ValueAddedCourse bo = valueAddedCourseDao.findByIdAndIsActive
				(valueAddedCourseId, true);
		return null != bo ? Optional.of(ValueAddedCourseResponseDto.fromValueAddedCourse(bo))
				: Optional.empty();
	}

	public List<ValueAddedCourseResponseDto> getAllActiveValueAddedCourse() {
		List<ValueAddedCourse> boList = valueAddedCourseDao.findByIsActive(true);
		List<ValueAddedCourseResponseDto> innovativeMethDtos = boList.stream()
				.map(ValueAddedCourseResponseDto::fromValueAddedCourse).collect(Collectors.toList());
		return innovativeMethDtos;
	}

	public List<ValueAddedCourseResponseDto> getDeptWiseValueAddedCourse(Integer userId) {
		Long departmentId = commonUtil.getLoggedInDepartmentId(userId);
		if (null != departmentId) {
			List<Integer> userIds = userRepository.findUserIdsByDeptId(departmentId);
			if (null != userIds && !userIds.isEmpty()) {
				List<String> userIdsAsString = userIds.stream().map(String::valueOf).collect(Collectors.toList());
				List<ValueAddedCourse> boList = valueAddedCourseDao.getByCreatedIds(userIdsAsString);
				List<ValueAddedCourseResponseDto> valueAddedCourseDtos = boList.stream()
						.map(ValueAddedCourseResponseDto::fromValueAddedCourse).collect(Collectors.toList());
				return valueAddedCourseDtos;
			}
		}
		return new ArrayList<ValueAddedCourseResponseDto>();
	}

	public List<ValueAddedCourseResponseDto> getValueAddedCourseByCreatedBy(String userId) {
		List<ValueAddedCourse> boList = valueAddedCourseDao.findByCreatedByAndIsActive(userId,
				true);
		List<ValueAddedCourseResponseDto> valueAddedCourseDtos = boList.stream()
				.map(ValueAddedCourseResponseDto::fromValueAddedCourse).collect(Collectors.toList());
		return valueAddedCourseDtos;
	}

	public ValueAddedCourseResponseDto updateValueAddedCourse(ValueAddedCourseRequestDto requestDto) {
		ValueAddedCourse bo = saveCurriculumValueAddedCourse(requestDto);
		bo.setId(requestDto.getValueAddedCourseId());
		bo.setLastModifiedDate(LocalDateTime.now());
		bo.setModifiedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
		valueAddedCourseDao.save(bo);
		bo = valueAddedCourseDao.findById(requestDto.getValueAddedCourseId()).get();
		return ValueAddedCourseResponseDto.fromValueAddedCourse(bo);
	}

	public void deleteValueAddedCourseById(Long valueAddedCourseId) {
		JwtUserDetails details = commonUtil.getLoggedInUserDetails();

		ValueAddedCourse bo = valueAddedCourseDao.findById(valueAddedCourseId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"ValueAddedCourse record not found with ID: " + valueAddedCourseId));

		bo.setIsActive(false);
		bo.setModifiedBy(details.getUserId().toString());
		bo.setLastModifiedDate(LocalDateTime.now());
		valueAddedCourseDao.save(bo);

		Set<ValueAddedCourseDocuments> valueAddedCourseDocuments = bo.getValueAddedCourseDocuments();

		for (ValueAddedCourseDocuments valueAddedCourseDoc : valueAddedCourseDocuments) {
			String filePath = valueAddedCoursePath + valueAddedCourseDoc.getFileName();
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

		valueAddedCourseDocumentDao.deleteByvalueAddedCourseId(bo.getId());
	}

	public boolean deletevalueAddedCourseDocument(Long valueAddedCourseId) {
		ValueAddedCourseDocuments bo = valueAddedCourseDocumentDao.
				findByValueAddedCourse_Id(valueAddedCourseId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"InnovativeTeachingMethodology Document record not found with ID: " + valueAddedCourseId));

		String filePath = valueAddedCoursePath + bo.getFileName();
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

		valueAddedCourseDocumentDao.delete(bo);
		return true;
	}
	
	
	
	
	

}
