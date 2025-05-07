package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationInfoEducationDto {
	
	private Long ednId;
	
	private Long docChecklistId;
	
	private String docName;

	private String qualification;

	private String examName;

	private String universityName;
	
	private String universityNameOther;
	
	private String ugCourseStudied;
	
	private Long universityId;

	private String instituteName;
	
	private String otherNameofInstitute;
	
	private Long idOfInstitute;
	
	private BigDecimal ObtainedMarks;
	
	private String nameOfState;
	
	private Long stateId;

	private Integer year;

	private Integer monthOfPassing;

	private Integer marksObtained;

	private Integer noOfAttempts;
	
	private String previousExamRegNo;
	
	private BigDecimal TotalMarks;
	
	private String month;
	
	private String secondLanguageStudied;
	
	private String secondLanguageList;
	
	//Detailed subject marks
	private DetailedMarksDto candidateMarksDto;
	
	//Semester wise marks
	private List<ApplicantMarksDetailsDto> applicantMarksDetailsDto;

	
}
