package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	
	
	private String studentName;
	private boolean tempChecked;
	private boolean checked;
	private String applicationNo;
	private String subjectId;
	private String subjectName;
	private String parentNo;
	private String cardType;
	private String smartCardNo;
	private String appliedDate;
	private String remarks;
	private String reasonForRejection;
	private String approvedDate;
	private String religion;
	private String motherTongue;
	private String birthPlace;
	private String passportNo;
	private String passportValidity;
	private String universityEmail;
	private String nationality;
	private String errorValue;
	
	

}
