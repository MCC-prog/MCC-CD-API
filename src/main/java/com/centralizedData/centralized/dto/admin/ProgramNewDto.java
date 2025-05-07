package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramNewDto {

	private Long id;
	private ProgramTypeNewDto programTypeTo;
	private String code;
	private String name;
//	private Boolean isActive;
//	private Integer createdBy;
//	private Date createdDate;
//	private Integer modifiedBy;
//	private Date lastModifiedDate;
	private Set courses = new HashSet(0);
	private List<CourseNewDto> courseList;
	private Boolean isMotherTongue;
	private Boolean isDisplayLanguageKnown;
	private Boolean isHeightWeight;
	private Boolean isDisplayTrainingCourse;
	private Boolean isAdditionalInfo;
	private Boolean isExtraDetails;
	private Boolean isSecondLanguage;
	private Boolean isFamilyBackground;
	private Boolean isLateralDetails;
	private Boolean isEntranceDetails;
	private Boolean isTransferCourse;
	private Boolean isTCDetails;
	private Boolean isExamCenterRequired;
	private Boolean isRegistrationNo;
	private Boolean isOpen;
	
	
	private String created;
	private String modified;
	private String active;
	private String motherTongue;
	private String secondLanguage;
	private String displayLanguageKnown;
	private String familyBackground;
	private String heightWeight;
	private String entranceDetails;
	private String lateralDetails;
	private String displayTrainingCourse;
	private String transferCourse;
	private String additionalInfo;
	private String extraDetails;
	private String tcDetails;
	private String registrationNo;
	private String cDate;
	private String lDate;
	private String certificateProgramName;
	private String stream;
	private int streamId;
	private String academicYear;
	
}
