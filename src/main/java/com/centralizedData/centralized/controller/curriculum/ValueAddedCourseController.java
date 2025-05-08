package com.centralizedData.centralized.controller.curriculum;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.centralizedData.centralized.dto.curriculum.ValueAddedCourseRequestDto;
import com.centralizedData.centralized.dto.curriculum.ValueAddedCourseResponseDto;
import com.centralizedData.centralized.model.enums.McqPrivilegeRoles;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.service.curriculum.ValueAddedCourseService;
import com.centralizedData.centralized.utils.ApiResponse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/valueAddedCourse")
@Slf4j
public class ValueAddedCourseController {

	@Autowired
	ValueAddedCourseService valueAddedCourseService;

	@Autowired
	CommonUtil commonUtil;

	@Value("${kp.curriculum.valueAddedCourse}")
	private String valueAddedCoursePath;

	@PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> save(@ModelAttribute ValueAddedCourseRequestDto valueAddedCourseRequestDto) {
		log.info("Entering save() in ValueAddedCourseController.");
		try {
			ValueAddedCourseResponseDto responseDto = valueAddedCourseService.saveValueAddedCourse(valueAddedCourseRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("ValueAddedCourse added successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving ValueAddedCourse", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to save ValueAddedCourse.", null));
		}
	}

	@GetMapping("/edit")
	public Optional<ValueAddedCourseResponseDto> getById(@RequestParam Long valueAddedCourseId) {
		log.info("Entering getById() in ValueAddedCourseController.");
		return valueAddedCourseService.getvalueAddedCourseId(valueAddedCourseId);

	}

	@GetMapping("/getAllValueAddedCourse")
	public List<ValueAddedCourseResponseDto> getAll() {
		log.info("Entering getAll() in ValueAddedCourseController.");
		JwtUserDetails userDetails = commonUtil.getLoggedInUserDetails();
		if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.DEVELOPER.toString())
				|| userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_ADMIN.toString())) {
			return valueAddedCourseService.getAllActiveValueAddedCourse();
		} else if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_HOD.toString())) {
			return valueAddedCourseService.getDeptWiseValueAddedCourse(userDetails.getUserId());
		} else if (userDetails.getMcqPrivilegeRole()
				.contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_TEACHER.toString())) {
			return valueAddedCourseService.getValueAddedCourseByCreatedBy(userDetails.getUserId().toString());
		}
		return new ArrayList<ValueAddedCourseResponseDto>();
	}

	@PutMapping(value = "/updateValueAddedCourse", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> update(@ModelAttribute ValueAddedCourseRequestDto valueAddedCourseRequestDto) {
		log.info("Entering update() in ValueAddedCourseController.");
		try {
			ValueAddedCourseResponseDto responseDto = valueAddedCourseService
					.updateValueAddedCourse(valueAddedCourseRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("ValueAddedCourse updated successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving ValueAddedCourse", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to update ValueAddedCourse.", null));
		}
	}

	@DeleteMapping("/deleteValueAddedCourse")
	public ResponseEntity<ApiResponse<?>> delete(@RequestParam Long valueAddedCourseId) {
		log.info("Entering delete() in ValueAddedCourseController.");
		valueAddedCourseService.deleteValueAddedCourseById(valueAddedCourseId);
		return ResponseEntity.ok(new ApiResponse<>("ValueAddedCourse deleted successfully.", null));
	}

	@DeleteMapping("/deleteNewProgramDocument")
	public ResponseEntity<ApiResponse<?>> deletevalueAddedCourseDocument(@RequestParam Long valueAddedCourseId) {
		log.info("Entering deletevalueAddedCourseDocument() in ValueAddedCourseController.");
		valueAddedCourseService.deletevalueAddedCourseDocument(valueAddedCourseId);
		return ResponseEntity.ok(new ApiResponse<>("ValueAddedCourse-Excel deleted successfully.", null));
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws IOException {
		log.info("Entering downloadFile() in ValueAddedCourseController.");
		Path filePath = Paths.get(valueAddedCoursePath).resolve(fileName).normalize();
		Resource resource = new UrlResource(filePath.toUri());

		return ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"").body(resource);
	}

}
