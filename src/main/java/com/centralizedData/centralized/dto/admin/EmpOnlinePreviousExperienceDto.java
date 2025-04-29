package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpOnlinePreviousExperienceDto implements Serializable {
	
	private int id;
	private String empOrganization;
	private String empDesignation;
	private String totalTeachingExperience;
	
	// to print Total Experience in online resume print
	
	private String totalExp;
	private String qualificationLevel;
	private String subjectArea;
	private String jobType;
	private String empStatus;
	private String expectedSalary;
	private String eligibilityTest;
	
	// to print Industry Experience in online resume print
	
	private String organization;
	private String designation;
	private String experience;
	
	//code added by venu
	private String teachingExpYears;
	private String teachingExpMonths;
	private String industryExpYears;
	private String industryExpMonths;
	private String fromDate;
	private String toDate;

}
