package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BulkMailDto {

	private String programTypeId;	
	private String programId;
	private String courseId;
	private String appliedYear;	
	private String nationalityId;	
	private String residentCategoryId;		
	private String religionId;	
	private String subReligionId;	
	private String casteCategoryId;	
	private Character belongsTo;
	private String gender;	
	private String bloodGroup;	
	private String marksObtained;
	private String weightage;	
	private String university;	
	private String institute;	
	private String applicantName;	
	private String birthCountry;	
	private String birthState;	
	private String interviewType;	
	private String previousInterViewType;
	private String programTypeName;
	private String programName;	
	private String courseName;
	private String selectedCandidates[];
	private String emailAddresses[];
	private String desc;
	private String subject;
	private String message;

	private List<StudentSearchDto> studentSearch;
	private String mode;


}
