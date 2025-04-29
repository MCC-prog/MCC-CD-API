package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramDto {

	private Long  id;
	
	private Long  programTypeId;
	
	private String programTypeName;
	
	private String  code;
	
	private String name;
	
	private String stream;
	
	private String certificateProgramName;
	
	private Boolean isMotherTongue;
	
	private Boolean isSecondLanguage;
	
	private Boolean isDisplaylanguageKnown;
	
	private Boolean isHeightWeight;
	
	private Boolean isFamilyBackground;
	
	private Boolean isEntranceDetails;
	
	private Boolean isLateralDetails;
	
	private Boolean isDisplayTrainingshortCourse;
	
	private Boolean isTransferCourse;
	
	private Boolean isAdditionalInfo;
	
	private Boolean isExtraDetails;
	
	private Boolean isTcDisplay ;
	
	private Boolean isOpen ;
	
	private Integer academic_year;
	
	private Boolean isExamCenterRequired;
	
	private Boolean isRegistrationNo;

	
	
}
