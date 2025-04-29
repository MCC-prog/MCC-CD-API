package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSearchDto {
	
	private String applicationId;
	private String applicantName;
	private String applicantDOB;	
	private String applicantTotalWeightage;	
	private String admApplnId;	
	private String interviewSelectedId ;	
	private String email;	
    private String preRequisiteType;	
	private String prerequisiteMarks;	
	private int inWaitingList;	
	private String applicantGender;	
	private String interviewProgCrsId;
	
	private String selectedCrsId;
	private String selectedCrsName;
	private String examCenterName;
	private String journalNo;
	private String status;
	private String shortStatus;
	private Boolean photoAvaialble;
	private String mobileNo;
	private String previousCourse;
	private String previousSchoolOrCollege;
	private String percentage;
	private String category;
	private String interviewCardGenDate;
	private String interviewRejectOrSelectId;
	private String interviewRejectOrSelectDate;
	private String religion;
	private String passedYear;
	private String previousBoard;
	private String birthCountry;
	
	private String class10Precentage;
	private String class11Precentage;
	private String class10Institution;
	private String class11Institution;
	private String class10Board;
	private String class11Board;
	
	private String feeStatus;
	private String docVerRemarks;
	private String docVerAdmittedThrough;
	private String docVerSecondLanguage;
	private String assignedFeeAmount;
	private String avgPercOf10And11;

	private String admissionNo;
	private String admittedDate;
	private String regNo;
	private String className;
	private String combinedEntranceDetails;
	private String studentId;
	private String password;
	private String courseCode;

}
