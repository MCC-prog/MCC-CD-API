package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationInfoDto {
	
	private Long docChecklistId;
	
	private String docName;

	private Integer applicationNo;
	
	private String programType;
	
	private String program;
	
	private String challanRefNo;
	
	private Integer amount;
	
	private String journalNo;
	
	private String bankBranch;
	
	private LocalDate date;
	
	private Boolean isMarksCard;
	private Boolean isSemesterWise;
	
	private List<DetailedMarksDto> detailedMarksEntryDto;
	private List<ApplicantMarksDetailsDto> applicantMarksDetailsDto;
	
	
	//StudentInfo
	private String candidateName;
	
	private Date dateOfBirth;
	
	private String birthPlace;
	
	private String stateName;
	
	private String countryName;
	
	private String nationality;
	
	private String studentDomicile;
	
	private String religionName;
	
	private String subReligion;
	
	private String categoryName;
	
	private String ruralUrban;
	
	private String gender;
	
	private String isSportsPerson;
	
	private String sportsPersonDescription;
	
	private String isHandicapped;
	
	private String bloodGroup;
	
	private String secondLanguage;
	
	private String phNo3;
	
	private String mobileNo2;
	
	private String email;
	
	
	//PassportDetails(For Foreign Students only)
	private String passportNo;
	
	private String passportIssuingCountryName;
	
	private LocalDate passportValidity;
	
	private String residentPermitNo;
	
	private LocalDate residentPermitDate;
	
	
	//PermanentAddress
	private String permanentAddressLine1;
	
	private String permanentAddressLine2;
	
	private String permanentAddressCity;
	
	private String permanentAddressStateName;
	
	private String permanentAddressCountryName;
	
	private String permanentAddressZipCode;
	
	
	//CurrentAddress
	private String currentAddressLine1;
	
	private String currentAddressLine2;
	
	private String currentAddressCity;
	
	private String currentAddressStateName;
	
	private String currentAddressCountryName;
	
	private String currentAddressZipCode;
	private String universityName;
	
	private List<ApplicationInfoEducationDto> applicationInfoEducationDto; 
	
	//EducationalInfo
//	private String qualification;
//	
//	private String examName;
//	
//	private String universityName;
//	
	private String instituteName;
//	
	private Integer year;
//	
//	private Integer monthOfPassing;
//	
//	private Integer marksObtained;
//	
	private Integer noOfAttempts;
//	
	private String previousExamRegNo;
	
	
	//ParentInfo
	private String fatherName;
	
	private String fatherEducation;
	
	private String fatherIncome;
	
	private String fatherOccupation;
	
	private String fatherEmail;
	
	private String motherName;
	
	private String motherEducation;
	
	private String motherIncome;
	
	private String motherOccupation;
	
	private String motherEmail;
	
	
	//ParentAddress
	private String parentAddressLine1;
	
	private String parentAddressLine2;
	
	private String parentAddressLine3;
	
	private String parentAddressCity;
	
	private String parentAddressStateName;
	
	private String parentAddressCountryName;
	
	private String parentAddressZipCode;
	
	private String parentPh3;
	
	private String parentMob2;
	
	
	//GuardianAddress
	private String guardianAddressLine1;
	
	private String guardianAddressLine2;
	
	private String guardianAddressLine3;
	
	private String guardianAddressCity;
	
	private String guardianAddressStateName;
	
	private String guardianAddressCountryName;
	
	private String guardianAddressZipCode;
	
	private String guardianPh3;
	
	private String guardianMob2;
	
	private BigDecimal ObtainedMarks;
	private BigDecimal TotalMarks;
	
}
