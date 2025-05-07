package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewProgramCourseDto {
	

	private Long id;
	
	private Long courseId;
	
	private String courseName;
	
	private Long programId;
	
	private String programName;
	
	private Long programTypeId;
	
	private String programTypeName;
	
	private Long weightageId;
	
	private String sequence;
	
	private Integer year;
	
	private String interviewType;
	
	private String noOfInterviewsPerPanel;

}
