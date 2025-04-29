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

import com.centralizedData.centralized.dto.curriculum.CoursesWithFocusRequestDto;
import com.centralizedData.centralized.dto.curriculum.CoursesWithFocusResponseDto;
import com.centralizedData.centralized.model.enums.McqPrivilegeRoles;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.service.curriculum.CoursesWithFocusService;
import com.centralizedData.centralized.utils.ApiResponse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@Slf4j
@RequestMapping("/CoursesWithFocus")
public class CoursesWithFocusController {
	
	@Autowired
	CoursesWithFocusService coursesWithFocusService; 
	
	@Autowired
	CommonUtil commonUtil;
	
	@Value("${kp.curriculum.course.focus}")
	private String coursesFocusPath;
	
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> saveCoursesWithFocus
	(@ModelAttribute CoursesWithFocusRequestDto coursesWithFocusRequestDto) {
		log.info("Entering saveCoursesWithFocus() in CoursesWithFocusController.");
		try {
			CoursesWithFocusResponseDto coursesWithFocusResponseDto = 
					coursesWithFocusService.saveCoursesWithFocus(coursesWithFocusRequestDto);
			return ResponseEntity.ok(new ApiResponse<>
			("courseWithFocus added successfully.", coursesWithFocusResponseDto));
		} catch (Exception e) {
			log.error("Error saving courseWithFocus", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to save courseWithFocus.", null));
		}
	}
	
	@GetMapping
	public Optional<CoursesWithFocusResponseDto> getCoursesWithFocusById(@RequestParam Long coursesWithFocusId) {
		log.info("Entering getCoursesWithFocusById() in CoursesWithFocusController.");
		return coursesWithFocusService.getCoursesWithFocusById(coursesWithFocusId);
		
	}
	
	@GetMapping("/getAllCoursesWithFocus")
	public List<CoursesWithFocusResponseDto> getAllCoursesWithFocus() {
		JwtUserDetails userDetails = commonUtil.getLoggedInUserDetails();
		if(userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.DEVELOPER.toString()) ||
				userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_ADMIN.toString())) {
		  return coursesWithFocusService.getAllActiveCoursesWithFocus();	
		}else if(userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_HOD.toString())) {
			return coursesWithFocusService.getDeptWiseCoursesWithFocus(userDetails.getUserId());
		}else if(userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_TEACHER.toString())) {
			return coursesWithFocusService.getCoursesWithFocusByCreatedBy(userDetails.getUserId().toString());
		}
		return new ArrayList<CoursesWithFocusResponseDto>();
	}
	
	@PutMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> updateCoursesWithFocus(@ModelAttribute CoursesWithFocusRequestDto coursesWithFocusRequestDto) {
		log.info("Entering updateCoursesWithFocus() in CoursesWithFocusController.");
		try {
			CoursesWithFocusResponseDto responseDto = 
					coursesWithFocusService.updateCoursesWithFocus(coursesWithFocusRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("courseWithFocus updated successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error updating courseWithFocus", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to update courseWithFocus.", null));
		}
	}
	
	@DeleteMapping("/deleteCoursesWithFocus")
	public ResponseEntity<ApiResponse<?>> deleteCoursesWithFocus(Long coursesWithFocusId) {
		coursesWithFocusService.deleteCoursesWithFocus(coursesWithFocusId);
		return ResponseEntity.ok(new ApiResponse<>("courseWithFocus deleted successfully.", null));
	}
	
	@DeleteMapping("/deleteCoursesWithFocusDocument")
	public ResponseEntity<ApiResponse<?>> deleteCoursesWithFocusDocument(Long coursesWithFocusDocumentId) {
		coursesWithFocusService.deleteCoursesWithFocusDocument(coursesWithFocusDocumentId);
		return ResponseEntity.ok(new ApiResponse<>("courseWithFocus-Document deleted successfully.", null));
	}
		
	@GetMapping("/download/{fileName}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws IOException {
        Path filePath = Paths.get(coursesFocusPath).resolve(fileName).normalize();
        Resource resource = new UrlResource(filePath.toUri());

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }

	
}
