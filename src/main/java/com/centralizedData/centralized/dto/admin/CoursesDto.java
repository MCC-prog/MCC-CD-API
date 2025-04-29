package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesDto {

	private Long id;
	
	private String courseName;
	
	private String code;
	
	private Long programId;
	
	private String programName;

	private Long programTypeId;
	
	private String programTypeName;
	
//	private String createdBy;
//	
//	private Instant createdDate;
//	
//	private String modifiedBy;
//	
//	private Instant lastModifiedDate;
//	
//	private Boolean isActive;
	
	private Long currencyId;
	
	private Long workLocationId;//campus
	
	private Boolean isAutonomous;
	
	private String bankNameCourse;
	
	private String bankNameFullCourse;
	
	private Boolean bankIncludeSectionCourse;
	
	private Integer maxIntake;
	
	private String payCode;
	
	private BigDecimal amount;
	
	private Boolean isWorkExperienceRequired;
	
	private Boolean isDetailMarksPrint;
	
	private String courseNameCertificate;
	
	private Boolean isWorkExpMandatory;
	
	private Boolean isAppearInOnline;
	
	private Boolean isApplicationProcessSms;
	
	private Boolean onlyForApplication;
	
	private String courseMarksCard;
	
	private LocalDate courseCommencementDate;
	
	private BigDecimal intapplicationFees;
	
	private Integer noOfAttemptsMidsem;
	
	private String regNoStartPrefix;
	
	private String startRegNo;
	
	private Integer departmentId;
	
	private Integer webProgId;
	
	private Boolean isInterdisciplinary;
	
	private Boolean ciaRubricsApplicable;
	
	private Boolean isSecondLanguage;
	
	private Boolean isDisplaylanguageKnown;
	
	private Boolean isFamilyBackground;
	
	private Boolean isHeightWeight;
	
	private Boolean isEntranceDetails;
	
	private Boolean isLateralDetails;
	
	private Boolean isDisplayTrainingshortCourse;
	
	private Boolean isTransferCourse;
	
	private Boolean isAdditionalInfo;
	
	private Boolean isExtraDetails;
	
	private Boolean isTcDisplay;
	
	private Boolean isOpen;
	
	private Integer academicYear;
	
	private Boolean isExamCenterRequired;
	
	private Boolean isMotherTongue;
	
	private String statusTextSubmissionApplnOnline;
	
	private String statusTextSubmissionApplnOffline;
	
	private String statusTextAcknowledgementOnline;
	
	private String statusTextAcknowledgementOffline;
	
	private Boolean blockMarkEntryQualifyingExam;

	public CoursesDto(Long id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	
}
