package com.centralizedData.centralized.dto.admin;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentApplnDetailsDto {

	private Long id;

	private Integer applicationNo;

	private Integer appliedYear;

	private String programType;

	private String program;

	private String courseName;

	private String journalNo;

	private LocalDate date;

	private Integer amount;

	private String bankBranch;

	//StudentInfo
	private String candidateName;

	private Date dateOfBirth;

	private String birthPlace;

	private String stateName;

	private Long stateId;

	private String countryName;

	private Long countryId;

	private String nationality;

	private Long nationalityId;

	private String adhaarNo;

	private String studentDomicile;

	private Long studentDomicileId;

	private String religionName;

	private Long religionId;

	private String subReligion;

	private Long subReligionId;

	private Long casteId;

	private String categoryName;

	private Long categoryId;

	private String ruralUrban;

	private String gender;

	private String sportsPerson;

	private String sportsPersonDescription;

	private String isHandicapped;

	private String bloodGroup;

	private String phnCountryCode;

	private String phnAreaCode;

	private String phoneNo;

	private String studentCountryCode;

	private String studentMobileNo;

	private String email;

	private Long secondLanguageId;

	private String secondLanguage;

	private String motherTongue;

	private Long motherTongueId;

	//PassportDetails
	private String passportNo;

	private String passportIssuingCountryName;

	private Long passportIssuingCountryId;

	private LocalDate passportValidity;

	private String residentPermitNo;

	private LocalDate residentPermitDate;

	//VehicleDetails
	private String vehicleDetails;

	private String vehicleNo;

	//CurrentAddress
	private String currentAddressLine1;

	private String currentAddressLine2;

	private String currentAddressCity;

	private String currentAddressTaluk;

	private String currentAddressDistrict;

	private String currentAddressStateName;

	private Long currentAddressStateId;

	private String currentAddressCountryName;

	private Long currentAddressCountryId;

	private String currentAddressZipCode;

	//PermanentAddress
	private String permanentAddressLine1;

	private String permanentAddressLine2;

	private String permanentAddressCity;

	private String permanentAddressTaluk;

	private String permanentAddressDistrict;

	private String permanentAddressStateName;

	private Long permanentAddressStateId;

	private String permanentAddressCountryName;

	private Long permanentAddressCountryId;

	private String permanentAddressZipCode;

	//EducationalInfo
	private List<ApplicationInfoEducationDto> applicationInfoEducationDto; 

	private Boolean backlogsInPreviousSemToBeCleared;
	
	private List<EdnQualificationDto> ednQualificationDto;

	//ParentInfo
	private String fatherName;

	private String fatherEducation;

	private Long fatherIncomeCurrencyId;
	
	private String fatherIncomeCurrency;
	
	private Long fatherIncomePerAnnumId;

	private String fatherIncomePerAnnum;

	private String fatherOccupation;

	private Long fatherOccupationId;

	private String fatherEmail;

	private String motherName;

	private String motherEducation;

	private Long motherIncomeCurrencyId;
	
	private String motherIncomeCurrency;

	private String motherIncomePerAnnum;
	
	private Long motherIncomePerAnnumId;

	private String motherOccupation;

	private Long motherOccupationId;

	private String motherEmail;

	//ParentAddress
	private String parentAddressLine1;

	private String parentAddressLine2;

	private String parentAddressLine3;

	private String parentAddressCity;

	private String parentAddressStateName;

	private Long parentAddressStateId;

	private String parentAddressCountryName;

	private Long parentAddressCountryId;

	private String parentAddressZipCode;

	private String parentPhone1;
	
	private String parentPhone2;
	
	private String parentPhone3;

	private String parentMobile1;
	
	private String parentMobile2;


	//GuardianAddress
	private String guardianName;

	private String guardianAddressLine1;

	private String guardianAddressLine2;

	private String guardianAddressLine3;

	private String guardianAddressCity;

	private String guardianAddressStateName;

	private Long guardianAddressStateId;

	private String guardianAddressCountryName;

	private Long guardianAddressCountryId;

	private String guardianAddressZipCode;

	private String guardianPhone1;
	
	private String guardianPhone2;
	
	private String guardianPhone3;

	private String guardianMobile1;
	
	private String guardianMobile2;

	//RecommendedBy
	private String recommendedBy;

	//Documents
	private String Photo;

	private String signature;

	private LocalDate submissionDate;

	private String remarks;






}
