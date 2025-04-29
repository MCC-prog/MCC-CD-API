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

import com.centralizedData.centralized.dto.curriculum.BosRequestDto;
import com.centralizedData.centralized.dto.curriculum.BosResponseDto;
import com.centralizedData.centralized.model.enums.McqPrivilegeRoles;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.service.curriculum.BosService;
import com.centralizedData.centralized.utils.ApiResponse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RequestMapping("/bos")
@RestController
@Slf4j
public class BosController {

	@Autowired
	BosService bosService;

	@Autowired
	CommonUtil commonUtil;

	@Value("${kp.curriculum.bos}")
	private String bosPath;

	@PostMapping(value = "/saveCurriculumBos", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> saveCurriculumBos(@ModelAttribute BosRequestDto bosRequestDto) {
		log.info("Entering saveCurriculumBos() in BosController.");
		try {
			BosResponseDto responseDto = bosService.saveCurriculumBos(bosRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("CurriculumBos added successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving CurriculumBos", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to save CurriculumBos.", null));
		}
	}

	@GetMapping("/edit")
	public Optional<BosResponseDto> getBosById(@RequestParam Long bosId) {
		log.info("Entering getBosById() in CoursesWithFocusController.");
		return bosService.getBosDataById(bosId);

	}

	@GetMapping("/getAllBos")
	public List<BosResponseDto> getAll() {
		JwtUserDetails userDetails = commonUtil.getLoggedInUserDetails();
		if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.DEVELOPER.toString())
				|| userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_ADMIN.toString())) {
			return bosService.getAllActiveBos();
		} else if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_HOD.toString())) {
			return bosService.getDeptWiseBos(userDetails.getUserId());
		} else if (userDetails.getMcqPrivilegeRole()
				.contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_TEACHER.toString())) {
			return bosService.getBosWithFocusByCreatedBy(userDetails.getUserId().toString());
		}
		return new ArrayList<BosResponseDto>();
	}

	@PutMapping(value = "/updateCurriculumBos", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> updateBos(@ModelAttribute BosRequestDto bosRequestDto) {
		log.info("Entering updateCoursesWithFocus() in CoursesWithFocusController.");
		try {
			BosResponseDto responseDto = bosService.updateBos(bosRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("CurriculumBos updated successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving CurriculumBos", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to update CurriculumBos.", null));
		}
	}

	@DeleteMapping("/deleteBos")
	public ResponseEntity<ApiResponse<?>> deleteBosData(@RequestParam Long bosId) {
		bosService.deleteBosDataById(bosId);
		return ResponseEntity.ok(new ApiResponse<>("Curriculum BOS deleted successfully.", null));
	}

	@DeleteMapping("/deleteBosDocument")
	public ResponseEntity<ApiResponse<?>> deleteBosDocument(@RequestParam Long bosDocumentId) {
		bosService.deleteBosDocument(bosDocumentId);
		return ResponseEntity.ok(new ApiResponse<>("Curriculum BOS Document deleted successfully.", null));
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws IOException {
		Path filePath = Paths.get(bosPath).resolve(fileName).normalize();
		Resource resource = new UrlResource(filePath.toUri());

		return ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"").body(resource);
	}

}
