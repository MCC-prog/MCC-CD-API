package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentSearchFormDto {
	
	
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
	
	private String percentageFrom;
	
	private String percentageTo;
	
	private String weightage;
	
	private String university;
	
	private String institute;
	
	private String applicantName;
	
	private String birthCountry;
	
	private String birthState;
	
	private String[] interviewType;
	private String searchedIntrvwType;
	
	private String previousInterViewType;

	private String programTypeName;
	
	private String programName;
	
	private String courseName;
	private String admissionYear;
	private Boolean sportsPerson;
	
	private Boolean handicapped;
	private boolean needApproval;
	private Boolean orderBy;
	private String selectedCandidates[];
	private String rejectedCandidates[];
	private String removeRejectedCandidates[];
	private String status;
	private String shortStatus;
	
	private String applicationNumber;
	private String applicationYear;
	private String appliedDateFrom;
	private String appliedDateTo;
	

	private List<StudentSearchDto> studentSearch;
	private List<CasteDto> casteList;
	private List<ReligionDto> religionList;
	private List<NationalityDto> nationTOs;
	private List<UniversityDto> universities;
	private List<CountryDto> countries;
	private String interviewDate;
	private List<ResidentCategoryDto> residentCategory;
	
	private List<StudentSearchDto> rejectedStudList;
	private List<StudentSearchDto> selectedStudList;
	private List<StudentSearchDto> admittedStudList;
    
	private Integer studentSearchCount;
	private Integer rejectedStudentCount;
	private Boolean callForInterview;
	private Boolean ugCourse;
	private String interviewTypeId;
	private Integer selectedAdmApplnId;
	private Integer selectedInterviewTypeId;

}
