package com.centralizedData.centralized.dto.curriculum;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValueAddedCourseRequestDto implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5919454225768866114L;
	
	
	private Long valueAddedCourseId;
	private Integer academicYear;
	private Long streamId;
	private Long departmentId;
	private String studentName;
	private Integer registerNo;
	private String courseTitle;
	private Integer noOfStudentsEnrolled;	
	private Integer noOfStudentsCompleted;
	private String startDate;
	private String endDate;
	private String resourcePerson;
	private String organization;
	private Integer noOfCredits;
	private MultipartFile excel;

}
