package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandidatePrerequisiteMarksDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 980979783071824758L;
	
	private int id;
	private int admApplnId;
	private int prerequisiteId;
	private String prerequisiteName; 
	private String prerequisiteMarksObtained;
	private String prerequisiteTotalMarks;
	private String weightageAdjustedMarks;
	private String rollNo;
	private String examMonth;
	private String examYear;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String lastModifiedDate;
	private boolean isActive;
}
