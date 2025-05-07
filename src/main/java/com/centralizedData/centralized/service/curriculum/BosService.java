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

import com.centralizedData.centralized.dto.curriculum.BosRequestDto;
import com.centralizedData.centralized.dto.curriculum.BosResponseDto;
import com.centralizedData.centralized.exception.CustomException;
import com.centralizedData.centralized.exception.ResourceNotFoundException;
import com.centralizedData.centralized.model.admin.Courses;
import com.centralizedData.centralized.model.curriculum.BosData;
import com.centralizedData.centralized.model.curriculum.BosDataAssignedCourses;
import com.centralizedData.centralized.model.curriculum.BosDataDocuments;
import com.centralizedData.centralized.repository.CourseRepository;
import com.centralizedData.centralized.repository.DepartmentRepository;
import com.centralizedData.centralized.repository.EmpStreamRepository;
import com.centralizedData.centralized.repository.ProgramRepository;
import com.centralizedData.centralized.repository.ProgramTypeRepository;
import com.centralizedData.centralized.repository.UserRepository;
import com.centralizedData.centralized.repository.Curriculum.BosDataAssignedCoursesDao;
import com.centralizedData.centralized.repository.Curriculum.BosDataDao;
import com.centralizedData.centralized.repository.Curriculum.BosDataDocumentDao;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.utils.CommonUtil;

@Service
@Transactional
public class BosService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BosService.class);

	@Value("${kp.curriculum.bos}")
	private String bosPath;

	@Autowired
	private BosDataDao bosDataDao;
	
	@Autowired
	private BosDataAssignedCoursesDao bosDataAssignedCoursesDao;
	
	@Autowired
	private BosDataDocumentDao bosDataDocumentDao;

	@Autowired
	private EmpStreamRepository streamRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProgramTypeRepository programTypeRepository;

	@Autowired
	private ProgramRepository programRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CommonUtil commonUtil;

	@Autowired
	private CoursesWithFocusService CoursesWithFocusService;

	@Autowired
	private UserRepository userRepository;

	public BosResponseDto saveCurriculumBos(BosRequestDto bosRequestDto) {
		BosData bosBO = saveCurriculumBosData(bosRequestDto);
		bosDataDao.save(bosBO);
		LOGGER.info("BosData saved successfully.");
		return BosResponseDto.fromBosData(bosBO);
	}

	private BosData saveCurriculumBosData(BosRequestDto dto) {
		BosData bosData = BosData.builder()
				.academicYear(dto.getAcademicYear())
				.semType(dto.getSemType())
				.semesterNo(dto.getSemesterNo())
				.revisionPerc(Double.valueOf(dto.getPercentage()))
				.dateOfConduct(commonUtil.convertToLocalDate(dto.getYearOfIntroduction()))
				.user(userRepository.findById(Integer.parseInt
						(commonUtil.getLoggedInUserDetails().getUserId().toString())).get())
				.stream(streamRepository.findById(dto.getStreamId()).get())
				.department(departmentRepository.findById(dto.getDepartmentId()).get())
				.programType(programTypeRepository.findById(dto.getProgramTypeId()))
				.program(programRepository.findById(dto.getProgramId()).get())
				.createdBy(commonUtil.getLoggedInUserDetails().getUserId().toString())
				.createdDate(LocalDate.now())
				.isActive(true).build();
		Set<BosDataAssignedCourses> c = getAssignedCourses(dto.getCourseIds(), bosData);
		bosData.setBosDataAssignedCourses(c);
		bosData.setBosDataDocuments(getBosDocuments(dto, bosData));
		return bosData;
	}

	private Set<BosDataDocuments> getBosDocuments(BosRequestDto dto, BosData bosData) {
		Set<BosDataDocuments> documents = new HashSet<BosDataDocuments>();
		BosDataDocuments doc = null;
		if (dto.getMom() != null && !dto.getMom().isEmpty()) {
			doc = saveBosFile(dto.getMom(), "mom", bosData);
			documents.add(doc);
		}
		return documents;
	}

	private BosDataDocuments saveBosFile(MultipartFile multiPartFile, String docType, BosData bosData) {
		Map<String, String> file = CoursesWithFocusService.getFileDetails(multiPartFile, bosPath);
		BosDataDocuments documents = null;
		if (null != file && !file.isEmpty()) {
			documents = new BosDataDocuments();
			documents.setBosData(bosData);
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

	private Set<BosDataAssignedCourses> getAssignedCourses(List<Long> courseIds, BosData bosData) {
		Set<BosDataAssignedCourses> bosDataAssignedCourses = new HashSet<BosDataAssignedCourses>();
		if (courseIds != null && courseIds.size() > 0) {
			for (Long cou : courseIds) {
				BosDataAssignedCourses entity = new BosDataAssignedCourses();
				Courses course = courseRepository.findById(cou).get();
				entity.setCourse(course);
				entity.setBosData(bosData);
				bosDataAssignedCourses.add(entity);
			}
		}
		return bosDataAssignedCourses;
	}

	public Optional<BosResponseDto> getBosDataById(Long bosId) {
		BosData bosData = bosDataDao.findByIdAndIsActive(bosId, true);
		return null != bosData ? Optional.of(BosResponseDto.fromBosData(bosData)) : Optional.empty();
	}

	public List<BosResponseDto> getAllActiveBos() {
		List<BosData> bosData = bosDataDao.findByIsActive(true);
		List<BosResponseDto> coursesWithFocusDtos = bosData.stream().map(BosResponseDto::fromBosData).collect(Collectors.toList());
		return coursesWithFocusDtos;
	}

	public List<BosResponseDto> getDeptWiseBos(Integer userId) {
		Long departmentId = commonUtil.getLoggedInDepartmentId(userId);
		if (null != departmentId) {
			List<Integer> userIds = userRepository.findUserIdsByDeptId(departmentId);
			if (null != userIds && !userIds.isEmpty()) {
				List<String> userIdsAsString = userIds.stream().map(String::valueOf).collect(Collectors.toList());
				List<BosData> coursesWithFocus = bosDataDao.getByCreatedIds(userIdsAsString);
				List<BosResponseDto> bosResponseDto = coursesWithFocus.stream().map(BosResponseDto::fromBosData)
						.collect(Collectors.toList());
				return bosResponseDto;
			}
		}
		return new ArrayList<BosResponseDto>();
	}

	public List<BosResponseDto> getBosWithFocusByCreatedBy(String userId) {
		List<BosData> coursesWithFocus = bosDataDao.findByCreatedByAndIsActive(userId, true);
		List<BosResponseDto>  bosResponseDto = coursesWithFocus.stream().map(BosResponseDto::fromBosData).collect(Collectors.toList());
		return bosResponseDto;
	}

	public BosResponseDto updateBos(BosRequestDto bosRequestDto) {
		bosDataAssignedCoursesDao.deleteByBosId(bosRequestDto.getBosId());
		BosData bosDataBO = saveCurriculumBosData(bosRequestDto);
		bosDataBO.setId(bosRequestDto.getBosId());
		bosDataBO.setLastModifiedDate(LocalDateTime.now());
		bosDataBO.setModifiedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
		bosDataDao.save(bosDataBO);
		bosDataBO = bosDataDao.findById(bosRequestDto.getBosId()).get();
		return BosResponseDto.fromBosData(bosDataBO);
	}

	public void deleteBosDataById(Long bosId) {
		JwtUserDetails details = commonUtil.getLoggedInUserDetails();
		
		BosData bosDataBO = bosDataDao.findById(bosId)
				.orElseThrow(() -> new ResourceNotFoundException("Curriculum BOS record not found with ID: " + bosId));

		bosDataBO.setIsActive(false);
		bosDataBO.setModifiedBy(details.getUserId().toString());
		bosDataBO.setLastModifiedDate(LocalDateTime.now());
		bosDataDao.save(bosDataBO);

		bosDataAssignedCoursesDao.deleteByBosId(bosDataBO.getId());
		
		Set<BosDataDocuments> bosDataDocuments = bosDataBO.getBosDataDocuments();

		for (BosDataDocuments bosDoc : bosDataDocuments) {
			String filePath = bosPath + bosDoc.getFileName();
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
		
		bosDataDocumentDao.deleteByBosId(bosDataBO.getId());
	}

	public Boolean deleteBosDocument(Long bosDocumentId) {
		BosDataDocuments bosDataDocuments = bosDataDocumentDao.findByBosDataId_Id(bosDocumentId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"Curriculum BOS Document record not found with ID: " + bosDocumentId));

		String filePath = bosPath + bosDataDocuments.getFileName();
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

		bosDataDocumentDao.delete(bosDataDocuments);
		return true;
	}

	
	
	
	
	
}
