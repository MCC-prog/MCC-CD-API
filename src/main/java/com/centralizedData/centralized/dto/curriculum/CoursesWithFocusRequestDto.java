package com.centralizedData.centralized.dto.curriculum;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class CoursesWithFocusRequestDto extends CoursesWithFocusDto {
	
	private List<Long> courseId;
	private MultipartFile ecoEntreC; 
	private MultipartFile ecoEmployC;
	private MultipartFile ecoSkillC;
	private MultipartFile ecoGenderC;
	private MultipartFile ecoEnvironmentalC;
	private MultipartFile ecoIKSC;
	
}
