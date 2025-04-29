package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdmApplnDto {
	
	private Long id; 
	
	private Integer applnNo;
	
	private String name;
	
	private String appliedCourse;
	
	private Long appliedCourseId;
	
	private Integer appliedYear;
	
	private String selectedCourse;
	
	private Long selectedCourseId;
	
	private Long programId;
	
	private Long programTypeId;
	
	private Long changeToCourseId;
	
	private String documents;
	
	private String mobileNo;
	
	private String category;
	
	private BigDecimal percentage;
	
	private String university;
	
	private boolean select;
	
	private Instant rejectedDate;
	
	private Long interviewTypeId;
	
	private String message;
	
//	private boolean reject;
	
}
