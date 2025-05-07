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
import com.centralizedData.centralized.dto.curriculum.CoursesWithFocusRequestDto;
import com.centralizedData.centralized.dto.curriculum.CoursesWithFocusResponseDto;
import com.centralizedData.centralized.exception.CustomException;
import com.centralizedData.centralized.exception.ResourceNotFoundException;

import com.centralizedData.centralized.model.curriculum.CoursesWithFocus;
import com.centralizedData.centralized.model.curriculum.CoursesWithFocusAssignedCourses;
import com.centralizedData.centralized.model.curriculum.CoursesWithFocusDocuments;
import com.centralizedData.centralized.repository.CourseRepository;
import com.centralizedData.centralized.repository.DepartmentRepository;
import com.centralizedData.centralized.repository.EmpStreamRepository;
import com.centralizedData.centralized.repository.ProgramRepository;
import com.centralizedData.centralized.repository.ProgramTypeRepository;
import com.centralizedData.centralized.repository.UserRepository;
import com.centralizedData.centralized.repository.Curriculum.CoursesWithFocusAssignedCoursesDao;
import com.centralizedData.centralized.repository.Curriculum.CoursesWithFocusDao;
import com.centralizedData.centralized.repository.Curriculum.CoursesWithFocusDocumentsDao;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.utils.CommonUtil;

@Service
@Transactional
public class CoursesWithFocusService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoursesWithFocusService.class);

	@Value("${kp.curriculum.course.focus}")
	private String coursesFocusPath;

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
	private CourseRepository courseRepository;

	@Autowired
	private CoursesWithFocusDao coursesWithFocusDao;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CoursesWithFocusAssignedCoursesDao coursesWithFocusAssignedCoursesDao;

	@Autowired
	private CoursesWithFocusDocumentsDao coursesWithFocusDocumentsDao;

	

	public CoursesWithFocusResponseDto saveCoursesWithFocus(CoursesWithFocusRequestDto dto) {
		CoursesWithFocus coursesWithFocus = fromCoursesWithFocusRequestDto(dto);
		coursesWithFocusDao.save(coursesWithFocus);
		return CoursesWithFocusResponseDto.fromCoursesWithFocus(coursesWithFocus);

	}

	public CoursesWithFocus fromCoursesWithFocusRequestDto(CoursesWithFocusRequestDto dto) {
		CoursesWithFocus coursesWithFocus = CoursesWithFocus.builder().academicYear(dto.getAcademicYear())
				.semType(dto.getSemType()).semNumber(dto.getSemNumber())
				.empStream(streamRepository.findById(dto.getStreamId()).get())
				.department(departmentRepository.findById(dto.getDepartmentId()).get())
				.programType(programTypeRepository.findById(dto.getProgramTypeId()))
				.program(programRepository.findById(dto.getProgramId()).get()).focusArea(dto.getFocusArea())
				.subjectTittle(dto.getSubjectTittle()).courseType(dto.getCourseType())
				.createdBy(commonUtil.getLoggedInUserDetails().getUserId().toString()).createdDate(LocalDate.now())
				.isActive(true).build();
		Set<CoursesWithFocusAssignedCourses> c = getAssignedCourses(dto.getCourseId(), coursesWithFocus);
		coursesWithFocus.setCoursesWithFocusAssignedCourses(c);
		coursesWithFocus.setCoursesWithFocusDocuments(getCoursesWithFocusDocuments(dto, coursesWithFocus));
		return coursesWithFocus;
	}

	public CoursesWithFocus updateCoursesWithFocusRequestDto(CoursesWithFocusRequestDto dto) {
		CoursesWithFocus coursesWithFocus = CoursesWithFocus.builder().id(dto.getCoursesWithFocusId())
				.academicYear(dto.getAcademicYear()).semType(dto.getSemType()).semNumber(dto.getSemNumber())
				.empStream(streamRepository.findById(dto.getStreamId()).get())
				.department(departmentRepository.findById(dto.getDepartmentId()).get())
				.programType(programTypeRepository.findById(dto.getProgramTypeId()))
				.program(programRepository.findById(dto.getProgramId()).get()).focusArea(dto.getFocusArea())
				.subjectTittle(dto.getSubjectTittle()).courseType(dto.getCourseType())
				.modifiedBy(commonUtil.getLoggedInUserDetails().getUserId().toString())
				.lastModifiedDate(LocalDateTime.now()).isActive(true).build();
		Set<CoursesWithFocusAssignedCourses> c = getAssignedCourses(dto.getCourseId(), coursesWithFocus);
		coursesWithFocus.setCoursesWithFocusAssignedCourses(c);
		coursesWithFocus.setCoursesWithFocusDocuments(getCoursesWithFocusDocuments(dto, coursesWithFocus));
		return coursesWithFocus;
	}

	private Set<CoursesWithFocusAssignedCourses> getAssignedCourses(List<Long> courseIds,
			CoursesWithFocus coursesWithFocus) {
		Set<CoursesWithFocusAssignedCourses> assignedCourses = new HashSet<CoursesWithFocusAssignedCourses>();
		for (Long id : courseIds) {
			CoursesWithFocusAssignedCourses assignedCourse = CoursesWithFocusAssignedCourses.builder()
					.coursesWithFocus(coursesWithFocus).course(courseRepository.findById(id).get()).build();
			assignedCourses.add(assignedCourse);
		}
		return assignedCourses;
	}

	public Set<CoursesWithFocusDocuments> getCoursesWithFocusDocuments(CoursesWithFocusRequestDto dto,
			CoursesWithFocus coursesWithFocus) {
		Set<CoursesWithFocusDocuments> documents = new HashSet<CoursesWithFocusDocuments>();
		CoursesWithFocusDocuments doc = null;
		if (dto.getEcoEmployC() != null && !dto.getEcoEmployC().isEmpty()) {
			doc = saveCoursesWithFocusFile(dto.getEcoEmployC(), "EcoEmployC", coursesWithFocus);
			documents.add(doc);
		}
		if (dto.getEcoEntreC() != null && !dto.getEcoEntreC().isEmpty()) {
			doc = saveCoursesWithFocusFile(dto.getEcoEntreC(), "EcoEntreC", coursesWithFocus);
			documents.add(doc);
		}
		if (dto.getEcoEnvironmentalC() != null && !dto.getEcoEnvironmentalC().isEmpty()) {
			doc = saveCoursesWithFocusFile(dto.getEcoEnvironmentalC(), "EcoEnvironmentalC", coursesWithFocus);
			documents.add(doc);
		}
		if (dto.getEcoGenderC() != null && !dto.getEcoGenderC().isEmpty()) {
			doc = saveCoursesWithFocusFile(dto.getEcoGenderC(), "EcoGenderC", coursesWithFocus);
			documents.add(doc);
		}
		if (dto.getEcoIKSC() != null && !dto.getEcoIKSC().isEmpty()) {
			doc = saveCoursesWithFocusFile(dto.getEcoIKSC(), "EcoIKSC", coursesWithFocus);
			documents.add(doc);
		}
		if (dto.getEcoSkillC() != null && !dto.getEcoSkillC().isEmpty()) {
			doc = saveCoursesWithFocusFile(dto.getEcoSkillC(), "EcoSkillC", coursesWithFocus);
			documents.add(doc);
		}
		return documents;
	}

	private CoursesWithFocusDocuments saveCoursesWithFocusFile(MultipartFile multiPartFile, String docType,
			CoursesWithFocus coursesWithFocus) {
		Map<String, String> file = commonUtil.getFileDetails(multiPartFile, coursesFocusPath);
		CoursesWithFocusDocuments documents = null;
		if (null != file && !file.isEmpty()) {
			documents = new CoursesWithFocusDocuments();
			documents.setCoursesWithFocus(coursesWithFocus);
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

	

	public Optional<CoursesWithFocusResponseDto> getCoursesWithFocusById(Long coursesWithFocusId) {
		CoursesWithFocus coursesWithFocus = coursesWithFocusDao.findByIdAndIsActive(coursesWithFocusId, true);
		return null != coursesWithFocus
				? Optional.of(CoursesWithFocusResponseDto.fromCoursesWithFocus(coursesWithFocus))
				: Optional.empty();
	}

	public List<CoursesWithFocusResponseDto> getAllActiveCoursesWithFocus() {
		List<CoursesWithFocus> coursesWithFocus = coursesWithFocusDao.findByIsActive(true);
		List<CoursesWithFocusResponseDto> coursesWithFocusDtos = coursesWithFocus.stream()
				.map(CoursesWithFocusResponseDto::fromCoursesWithFocus).collect(Collectors.toList());
		return coursesWithFocusDtos;
	}

	public List<CoursesWithFocusResponseDto> getCoursesWithFocusByCreatedBy(String string) {
		List<CoursesWithFocus> coursesWithFocus = coursesWithFocusDao.findByCreatedByAndIsActive(string, true);
		List<CoursesWithFocusResponseDto> coursesWithFocusDtos = coursesWithFocus.stream()
				.map(CoursesWithFocusResponseDto::fromCoursesWithFocus).collect(Collectors.toList());
		return coursesWithFocusDtos;
	}

	public List<CoursesWithFocusResponseDto> getDeptWiseCoursesWithFocus(Integer userId) {
		Long departmentId = commonUtil.getLoggedInDepartmentId(userId);
		if (null != departmentId) {
			List<Integer> userIds = userRepository.findUserIdsByDeptId(departmentId);
			if (null != userIds && !userIds.isEmpty()) {
				List<String> userIdsAsString = userIds.stream().map(String::valueOf).collect(Collectors.toList());
				List<CoursesWithFocus> coursesWithFocus = coursesWithFocusDao.getByCreatedIds(userIdsAsString);
				List<CoursesWithFocusResponseDto> coursesWithFocusDtos = coursesWithFocus.stream()
						.map(CoursesWithFocusResponseDto::fromCoursesWithFocus).collect(Collectors.toList());
				return coursesWithFocusDtos;
			}
		}
		return new ArrayList<CoursesWithFocusResponseDto>();
	}

	public CoursesWithFocusResponseDto updateCoursesWithFocus(CoursesWithFocusRequestDto coursesWithFocusRequestDto) {
		coursesWithFocusAssignedCoursesDao
				.deleteByCoursesWithFocusId(coursesWithFocusRequestDto.getCoursesWithFocusId());
		CoursesWithFocus coursesWithFocus = updateCoursesWithFocusRequestDto(coursesWithFocusRequestDto);
		coursesWithFocus.setId(coursesWithFocusRequestDto.getCoursesWithFocusId());
		coursesWithFocusDao.save(coursesWithFocus);
		coursesWithFocus = coursesWithFocusDao.findById(coursesWithFocusRequestDto.getCoursesWithFocusId()).get();
		return CoursesWithFocusResponseDto.fromCoursesWithFocus(coursesWithFocus);
	}

	public void deleteCoursesWithFocus(Long coursesWithFocusId) {
		CoursesWithFocus coursesWithFocus = coursesWithFocusDao.findById(coursesWithFocusId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"CoursesWithFocus record not found with ID: " + coursesWithFocusId));
		JwtUserDetails details = commonUtil.getLoggedInUserDetails();
		if (coursesWithFocus != null) {
			coursesWithFocus.setIsActive(false);
			coursesWithFocus.setModifiedBy(details.getUserId().toString());
			coursesWithFocus.setLastModifiedDate(LocalDateTime.now());
			coursesWithFocusDao.save(coursesWithFocus);
		}
		
		coursesWithFocusAssignedCoursesDao.deleteByCoursesWithFocusId(coursesWithFocusId);
		
		Set<CoursesWithFocusDocuments> coursesWithFocusDocuments = coursesWithFocus.getCoursesWithFocusDocuments();
		
		for (CoursesWithFocusDocuments coursesWithFocusDocument : coursesWithFocusDocuments) {
			String filePath = coursesFocusPath + coursesWithFocusDocument.getFileName();
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
		coursesWithFocusDocumentsDao.deleteByCoursesWithFocusId(coursesWithFocusId);
	}

	public Boolean deleteCoursesWithFocusDocument(Long coursesWithFocusDocumentsId) {
		CoursesWithFocusDocuments coursesWithFocusDocuments = coursesWithFocusDocumentsDao
				.findById(coursesWithFocusDocumentsId).orElseThrow(() -> new ResourceNotFoundException(
						"CoursesWithFocus Document record not found with ID: " + coursesWithFocusDocumentsId));

		String filePath = coursesFocusPath + coursesWithFocusDocuments.getFileName();
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

		coursesWithFocusDocumentsDao.delete(coursesWithFocusDocuments);
		return true;
	}
	
	

}
