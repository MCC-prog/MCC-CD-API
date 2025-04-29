package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupTemplateDto {

	private Long  id;

	private Long courseId;
	
	private String courseName;
	
	private Long programId;

	private Long programTypeId;
	
	private String programName;
	
	private String programTypeName;

	private String templateName;
	
	private String templateDescription;
}
