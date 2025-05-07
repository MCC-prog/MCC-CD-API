package com.centralizedData.centralized.controller.teachingandlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centralizedData.centralized.dto.teachingandlearning.RemidialClassesRequestDto;
import com.centralizedData.centralized.dto.teachingandlearning.RemidialClassesResponseDto;
import com.centralizedData.centralized.service.teachingandlearning.RemidialClassesService;
import com.centralizedData.centralized.utils.ApiResponse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/remidialClasses")
@Slf4j
public class RemidialClassesController {

	@Autowired
	RemidialClassesService remidialClassesService;

	@Autowired
	CommonUtil commonUtil;

	@Value("${kp.teachingAndLearning.remidialClasses}")
	private String remidialClassesUploadPath;
	
	@Value("${kp.teachingAndLearning.download.remidialClasses}")
	private String remidialClassesDownloadTempPath;

	@PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponse<?>> saveRemidialClasses(
			@ModelAttribute RemidialClassesRequestDto remidialClassesRequestDto) {
		log.info("Entering saveRemidialClasses() in BosController.");
		try {
			RemidialClassesResponseDto responseDto = remidialClassesService.saveCurriculumBos(remidialClassesRequestDto);
			return ResponseEntity.ok(new ApiResponse<>("CurriculumBos added successfully.", responseDto));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(new ApiResponse<>(e.getMessage(), null));
		} catch (Exception e) {
			log.error("Error saving CurriculumBos", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ApiResponse<>("Failed to save CurriculumBos.", null));
		}
	}

	

}
