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

import com.centralizedData.centralized.dto.curriculum.InnovativeMethodologyRequestDto;
import com.centralizedData.centralized.dto.curriculum.InnovativeMethodologyResponseDto;
import com.centralizedData.centralized.exception.CustomException;
import com.centralizedData.centralized.exception.ResourceNotFoundException;
import com.centralizedData.centralized.model.admin.Courses;
import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodology;
import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodologyCourses;
import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodologyDocument;
import com.centralizedData.centralized.repository.CourseRepository;
import com.centralizedData.centralized.repository.UserRepository;
import com.centralizedData.centralized.repository.Curriculum.InnovativeTeachingMethodologyCoursesDao;
import com.centralizedData.centralized.repository.Curriculum.InnovativeTeachingMethodologyDao;
import com.centralizedData.centralized.repository.Curriculum.InnovativeTeachingMethodologyDocumentDao;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.utils.CommonUtil;

@Service
@Transactional
public class InnovativeTeachingMethodologyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(InnovativeTeachingMethodologyService.class);

	@Value("${kp.curriculum.InnovativeTeachingMethodology}")
	private String innoTeachMethodologyPath;

	@Autowired
	private CommonUtil commonUtil;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private InnovativeTeachingMethodologyDao innovativeTeachingMethodologydao;

	@Autowired
	private InnovativeTeachingMethodologyCoursesDao innovativeTeachingMethodologyCoursesDao;

	@Autowired
	private InnovativeTeachingMethodologyDocumentDao innovativeTeachingMethodologyDocumentDao;

	public InnovativeMethodologyResponseDto saveInnovativeTeachingMethodology(
			InnovativeMethodologyRequestDto requestDto) {
		InnovativeTeachingMethodology bo = save(requestDto);
		innovativeTeachingMethodologydao.save(bo);
		LOGGER.info("BosData saved successfully.");
		return InnovativeMethodologyResponseDto.fromInnovativeMethodologyData(bo);
	}

	public InnovativeTeachingMethodology save(InnovativeMethodologyRequestDto dto) {
		InnovativeTeachingMethodology bo = new InnovativeTeachingMethodology();
		bo.setAcademicYear(dto.getAcademicYear());
		bo.setSemType(dto.getSemType());
		bo.setSemesterNo(dto.getSemesterNo());
		bo.setCourseTitle(dto.getCourseTitle());
		bo.setCreatedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
		bo.setCreatedDate(LocalDate.now());
		bo.setIsActive(true);
		Set<InnovativeTeachingMethodologyCourses> c = getAssignedCourses(dto.getCourseIds(), bo);
		bo.setInnovativeTeachingMethodologyCourses(c);
		bo.setInnovativeTeachingMethodologyDocument(getUplodingDocuments(dto, bo));
		return bo;
	}

	private Set<InnovativeTeachingMethodologyDocument> getUplodingDocuments(InnovativeMethodologyRequestDto dto,
			InnovativeTeachingMethodology bo) {
		Set<InnovativeTeachingMethodologyDocument> documents = new HashSet<InnovativeTeachingMethodologyDocument>();
		InnovativeTeachingMethodologyDocument doc = null;
		if (dto.getInnovativePedagogy() != null && !dto.getInnovativePedagogy().isEmpty()) {
			doc = saveFile(dto.getInnovativePedagogy(), "innovativePedagogy", bo);
			documents.add(doc);
		}
		return documents;
	}

	private InnovativeTeachingMethodologyDocument saveFile(MultipartFile multiPartFile, String docType,
			InnovativeTeachingMethodology bo) {
		Map<String, String> file = commonUtil.getFileDetails(multiPartFile, innoTeachMethodologyPath);
		InnovativeTeachingMethodologyDocument documents = null;
		if (null != file && !file.isEmpty()) {
			documents = new InnovativeTeachingMethodologyDocument();
			documents.setInnovativeTeachingMethodology(bo);
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

	private Set<InnovativeTeachingMethodologyCourses> getAssignedCourses(List<Long> courseIds,
			InnovativeTeachingMethodology bo) {
		Set<InnovativeTeachingMethodologyCourses> innovativeTeachingMethodologyCourses = new HashSet<InnovativeTeachingMethodologyCourses>();
		if (courseIds != null && courseIds.size() > 0) {
			for (Long cou : courseIds) {
				InnovativeTeachingMethodologyCourses entity = new InnovativeTeachingMethodologyCourses();
				Courses course = courseRepository.findById(cou).get();
				entity.setCourse(course);
				entity.setInnovativeTeachingMethodology(bo);
				innovativeTeachingMethodologyCourses.add(entity);
			}
		}
		return innovativeTeachingMethodologyCourses;
	}

	public Optional<InnovativeMethodologyResponseDto> getInnovativeMethodologyById(Long innovativeMethodologyId) {
		InnovativeTeachingMethodology bo = innovativeTeachingMethodologydao.findByIdAndIsActive(innovativeMethodologyId,
				true);
		return null != bo ? Optional.of(InnovativeMethodologyResponseDto.fromInnovativeMethodologyData(bo))
				: Optional.empty();
	}

	public List<InnovativeMethodologyResponseDto> getAllActiveInnovativeMeth() {
		List<InnovativeTeachingMethodology> boList = innovativeTeachingMethodologydao.findByIsActive(true);
		List<InnovativeMethodologyResponseDto> innovativeMethDtos = boList.stream()
				.map(InnovativeMethodologyResponseDto::fromInnovativeMethodologyData).collect(Collectors.toList());
		return innovativeMethDtos;
	}

	public List<InnovativeMethodologyResponseDto> getDeptWiseInnovativeMeth(Integer userId) {
		Long departmentId = commonUtil.getLoggedInDepartmentId(userId);
		if (null != departmentId) {
			List<Integer> userIds = userRepository.findUserIdsByDeptId(departmentId);
			if (null != userIds && !userIds.isEmpty()) {
				List<String> userIdsAsString = userIds.stream().map(String::valueOf).collect(Collectors.toList());
				List<InnovativeTeachingMethodology> boList = innovativeTeachingMethodologydao
						.getByCreatedIds(userIdsAsString);
				List<InnovativeMethodologyResponseDto> innovativeMethDtos = boList.stream()
						.map(InnovativeMethodologyResponseDto::fromInnovativeMethodologyData).collect(Collectors.toList());
				return innovativeMethDtos;
			}
		}
		return new ArrayList<InnovativeMethodologyResponseDto>();
	}

	public List<InnovativeMethodologyResponseDto> getInnovativeMethByCreatedBy(String userId) {
		List<InnovativeTeachingMethodology> boList = innovativeTeachingMethodologydao.findByCreatedByAndIsActive(userId,
				true);
		List<InnovativeMethodologyResponseDto> innovativeMethDtos = boList.stream()
				.map(InnovativeMethodologyResponseDto::fromInnovativeMethodologyData).collect(Collectors.toList());
		return innovativeMethDtos;
	}

	public InnovativeMethodologyResponseDto updateInnovativeMeth(InnovativeMethodologyRequestDto requestDto) {
		innovativeTeachingMethodologyCoursesDao.deleteByInnvovativeMethId(requestDto.getInnovativeMethodologyId());
		InnovativeTeachingMethodology bo = save(requestDto);
		bo.setId(requestDto.getInnovativeMethodologyId());
		bo.setLastModifiedDate(LocalDateTime.now());
		bo.setModifiedBy(commonUtil.getLoggedInUserDetails().getUserId().toString());
		innovativeTeachingMethodologydao.save(bo);
		bo = innovativeTeachingMethodologydao.findById(requestDto.getInnovativeMethodologyId()).get();
		return InnovativeMethodologyResponseDto.fromInnovativeMethodologyData(bo);
	}

	public void deleteInnovativeMethodById(Long innovativeMethodologyId) {
		JwtUserDetails details = commonUtil.getLoggedInUserDetails();

		InnovativeTeachingMethodology bo = innovativeTeachingMethodologydao.findById(innovativeMethodologyId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"InnovativeTeachingMethodology record not found with ID: " + innovativeMethodologyId));

		bo.setIsActive(false);
		bo.setModifiedBy(details.getUserId().toString());
		bo.setLastModifiedDate(LocalDateTime.now());
		innovativeTeachingMethodologydao.save(bo);

		innovativeTeachingMethodologyCoursesDao.deleteByInnvovativeMethId(bo.getId());

		Set<InnovativeTeachingMethodologyDocument> innoMethDocuments = bo.getInnovativeTeachingMethodologyDocument();

		for (InnovativeTeachingMethodologyDocument innoMethDoc : innoMethDocuments) {
			String filePath = innoTeachMethodologyPath + innoMethDoc.getFileName();
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

		innovativeTeachingMethodologyDocumentDao.deleteByInnovativeMethId(bo.getId());
	}

	public boolean deleteInnoMethDocument(Long innovativeMethodologyId) {
		InnovativeTeachingMethodologyDocument bo = innovativeTeachingMethodologyDocumentDao.
				findByInnovativeTeachingMethodology_Id(innovativeMethodologyId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"InnovativeTeachingMethodology Document record not found with ID: " + innovativeMethodologyId));

		String filePath = innoTeachMethodologyPath + bo.getFileName();
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

		innovativeTeachingMethodologyDocumentDao.delete(bo);
		return true;
	}

	
	
	
	
}
