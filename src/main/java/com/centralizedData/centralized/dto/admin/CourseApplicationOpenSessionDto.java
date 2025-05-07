package com.centralizedData.centralized.dto.admin;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseApplicationOpenSessionDto {
	
	private Long courseApplicationOpenSessionId;

	private Long courseId;

	private Integer sessionNo;

	private String openFrom;

	private String openTo;

	private String messageBeforeFromDate;

	private String messageAfterToDate;
	
	private String deleted;
	
	
	
}
