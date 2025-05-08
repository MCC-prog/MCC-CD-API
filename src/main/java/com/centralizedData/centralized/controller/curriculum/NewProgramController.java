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

import com.centralizedData.centralized.dto.curriculum.NewProgramRequestDto;
import com.centralizedData.centralized.dto.curriculum.NewProgramResponseDto;
import com.centralizedData.centralized.model.enums.McqPrivilegeRoles;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.service.curriculum.NewProgramService;
import com.centralizedData.centralized.utils.ApiResponse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/newProgram")
@Slf4j
public class NewProgramController {

	@Autowired
	NewProgramService newProgramService;

	@Autowired
	CommonUtil commonUtil;

	@Value("${kp.curriculum.newProgtam}")
	private String newProgtamPath;

	@PostMapping(value = "/saveProgram", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> saveNewProgram(@ModelAttribute NewProgramRequestDto newProgramRequestDto) {
		log.info("Entering saveNewProgram() in NewProgramController.");
		try {
			NewProgramResponseDto responseDto = newProgramService.saveNewProgram(newProgramRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("New-Program added successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving New-Program", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to save New-Program.", null));
		}
	}

	@GetMapping("/edit")
	public Optional<NewProgramResponseDto> getById(@RequestParam Long newProgramId) {
		log.info("Entering getById() in NewProgramController.");
		return newProgramService.getNewProgramById(newProgramId);

	}

	@GetMapping("/getAllNewProgram")
	public List<NewProgramResponseDto> getAll() {
		log.info("Entering getAll() in NewProgramController.");
		JwtUserDetails userDetails = commonUtil.getLoggedInUserDetails();
		if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.DEVELOPER.toString())
				|| userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_ADMIN.toString())) {
			return newProgramService.getAllActiveNewProgram();
		} else if (userDetails.getMcqPrivilegeRole().contains(McqPrivilegeRoles.MCQ_HOD.toString())) {
			return newProgramService.getDeptWiseNewProgram(userDetails.getUserId());
		} else if (userDetails.getMcqPrivilegeRole()
				.contains(McqPrivilegeRoles.MCQ_EXAM_AUTHOR_AS_TEACHER.toString())) {
			return newProgramService.getNewProgramByCreatedBy(userDetails.getUserId().toString());
		}
		return new ArrayList<NewProgramResponseDto>();
	}

	@PutMapping(value = "/updateCurriculumBos", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> update(@ModelAttribute NewProgramRequestDto newProgramRequestDto) {
		log.info("Entering update() in NewProgramController.");
		try {
			NewProgramResponseDto responseDto = newProgramService.updateNewProgram(newProgramRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("NewProgram updated successfully.", responseDto));
		} catch (Exception e) {
			log.error("Error saving NewProgram", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to update NewProgram.", null));
		}
	}

	@DeleteMapping("/deleteNewProgram")
	public ResponseEntity<ApiResponse<?>> delete(@RequestParam Long newProgramId) {
		log.info("Entering delete() in NewProgramController.");
		newProgramService.deleteNewProgramById(newProgramId);
		return ResponseEntity.ok(new ApiResponse<>("NewProgram deleted successfully.", null));
	}

	@DeleteMapping("/deleteNewProgramDocument")
	public ResponseEntity<ApiResponse<?>> deleteNewProgramDocument(@RequestParam Long newProgramId) {
		log.info("Entering deleteNewProgramDocument() in NewProgramController.");
		newProgramService.deleteNewProgramDocument(newProgramId);
		return ResponseEntity.ok(new ApiResponse<>("NewProgram-Document deleted successfully.", null));
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws IOException {
		log.info("Entering downloadFile() in NewProgramController.");
		Path filePath = Paths.get(newProgtamPath).resolve(fileName).normalize();
		Resource resource = new UrlResource(filePath.toUri());

		return ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"").body(resource);
	}

}
