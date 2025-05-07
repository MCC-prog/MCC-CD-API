package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.centralizedData.centralized.model.admin.Courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseSettingDto {

	private Long id;

	private Long programTypeId;
	
	private String programTypeName;
	
	private String programName;

	private Long programId;
	
	private List<Long> coursesId;

	private String courseName;
	
	private Long courseId;

	private String amount;

	private String intapplicationFees;

	private String payCode;

	private String courseCommencementDate;

	private Boolean isWorkExperienceRequired;

	private Boolean isWorkExpMandatory;

	private Boolean isApplicationProcessSms;

	private Boolean isTcDisplay;

	private Boolean isMotherTongue;

	private Boolean isSecondLanguage;

	private Boolean isDisplaylanguageKnown;

	private Boolean isHeightWeight;

	private Boolean isFamilyBackground;

	private Boolean isEntranceDetails;

	private Boolean isLateralDetails;

	private Boolean isDisplayTrainingshortCourse;

	private Boolean isTransferCourse;

	private Boolean isDetailMarksPrint;

	private Boolean isExtraDetails;//ExtraCurriculum

	private Boolean isAdditionalInfo;

	private Boolean isAppearInOnline;

	private Integer academicYear;

	private Boolean isExamCenterRequired;//seatNoGenerationRequired

	private Boolean isInterdisciplinary;

	private Boolean blockMarkEntryQualifyingExam;

	private Boolean eAdmitCardGenAcknowledgement;

	private String statusTextSubmissionApplnOnline;

	private String statusTextSubmissionApplnOffline;

	private String statusTextAcknowledgementOnline;

	private String statusTextAcknowledgementOffline;
	
	private String errMsg;

	//CourseApplicationOpenSessions
	
	private List<CourseApplicationOpenSessionDto> courseApplicationOpenSessionDto;
}
