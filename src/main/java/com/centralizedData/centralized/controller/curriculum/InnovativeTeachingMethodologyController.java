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

import com.centralizedData.centralized.dto.curriculum.InnovativeMethodologyRequestDto;
import com.centralizedData.centralized.dto.curriculum.InnovativeMethodologyResponseDto;
import com.centralizedData.centralized.model.enums.McqPrivilegeRoles;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.service.curriculum.InnovativeTeachingMethodologyService;
import com.centralizedData.centralized.utils.ApiResponse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RequestMapping("/innovativeTeachingMethodology")
@RestController
@Slf4j
public class InnovativeTeachingMethodologyController {

	@Autowired
	InnovativeTeachingMethodologyService innovativeTeachingMethodologyService;

	@Autowired
	CommonUtil commonUtil;

	@Value("${kp.curriculum.InnovativeTeachingMethodology}")
	private String innoTeachMethodologyPath;

	@PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> save(@ModelAttribute InnovativeMethodologyRequestDto requestDto) {
		log.info("Entering save () in InnovativeTeachingMethodologyController.");
		try {
			InnovativeMethodologyResponseDto responseDto = 
					innovativeTeachingMethodologyService.saveInnovativeTeachingMethodology(requestDto);
			return ResponseEntity.ok(new ApiResponse<>("InnovativeTeachingMethodology added successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving InnovativeTeachingMethodology", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to save InnovativeTeachingMethodology.", null));
		}
	}

	@GetMapping("/edit")
	public Optional<InnovativeMethodologyResponseDto> getById(@RequestParam Long innovativeMethodologyId) {
		log.info("Entering getById() in InnovativeTeachingMethodologyController.");
		return innovativeTeachingMethodologyService.getInnovativeMethodologyById(innovativeMethodologyId);

	}

	@GetMapping("/getAll")
	public List<InnovativeMethodologyResponseDto> getAll() {
		JwtUserDetails userDetails = commonUtil.getLoggedInUserDetails();
		if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.DEVELOPER.toString())
				|| userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_ADMIN.toString())) {
			return innovativeTeachingMethodologyService.getAllActiveInnovativeMeth();
		} else if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_HOD.toString())) {
			return innovativeTeachingMethodologyService.getDeptWiseInnovativeMeth(userDetails.getUserId());
		} else if (userDetails.getMcqPrivilegeRole()
				.contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_TEACHER.toString())) {
			return innovativeTeachingMethodologyService.getInnovativeMethByCreatedBy(userDetails.getUserId().toString());
		}
		return new ArrayList<InnovativeMethodologyResponseDto>();
	}

	@PutMapping(value = "/update", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> update(@ModelAttribute InnovativeMethodologyRequestDto requestDto) {
		log.info("Entering updateCoursesWithFocus() in InnovativeTeachingMethodologyController.");
		try {
			InnovativeMethodologyResponseDto responseDto = 
					innovativeTeachingMethodologyService.updateInnovativeMeth(requestDto);
			return ResponseEntity.ok(new ApiResponse<>("InnovativeTeachingMethodology updated successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving InnovativeTeachingMethodology", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to update InnovativeTeachingMethodology.", null));
		}
	}

	@DeleteMapping("/deleteInnovativeMethod")
	public ResponseEntity<ApiResponse<?>> delete(@RequestParam Long innovativeMethodologyId) {
		innovativeTeachingMethodologyService.deleteInnovativeMethodById(innovativeMethodologyId);
		return ResponseEntity.ok(new ApiResponse<>("InnovativeTeachingMethodology deleted successfully.", null));
	}

	@DeleteMapping("/deleteInnovativeMethodDocument")
	public ResponseEntity<ApiResponse<?>> deleteInnoMethDocument(@RequestParam Long innovativeMethodologyDocumentId) {
		innovativeTeachingMethodologyService.deleteInnoMethDocument(innovativeMethodologyDocumentId);
		return ResponseEntity.ok(new ApiResponse<>("InnovativeTeachingMethodology Document deleted successfully.", null));
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws IOException {
		Path filePath = Paths.get(innoTeachMethodologyPath).resolve(fileName).normalize();
		Resource resource = new UrlResource(filePath.toUri());

		return ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"").body(resource);
	}

}
