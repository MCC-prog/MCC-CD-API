package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationInfoDto {
	private String docCheckListId;
	private String docName;
	private String otherUniversityName;
	private String universityName;
	private String universityId;
	
	private String otherNameofInstitute;
	private String idOfInstitute;
	private String nameOfInstitute;
	private String stateId;
	private String stateName;
	private String stateOthernameEdn;
	private String noOfAttempts;
	private MultipartFile document;
	private String year;
	private String yearName;
	private String month;
	private Boolean isLanguage;
	private BigDecimal obtainedMarks;
	private BigDecimal totalMarks;
	private String percentage;
	private Boolean isDetailMarkPrint;
	private DetailedMarksDto detailedMarksEntryDto;
	private List<ApplicantMarksDetailsDto> applicantMarksDetailsDto;
	private String secondLanguageStudied;
	private Boolean backLogs;
	private String  secondLanguageList;
	private String previousExamRegistrationNo;
	

}
