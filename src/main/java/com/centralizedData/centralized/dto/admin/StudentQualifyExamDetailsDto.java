package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentQualifyExamDetailsDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3113857143790910490L;

	private int id;
	private int admApplnId;
	private String optionalSubjects;
	private String secondLanguage;
	private Double totalMarks;
	private Double obtainedMarks;
	private Double percentage;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private Double coreSubjectsPercentage;
	private Double coreSubjectsTotalMarks;
	private Double coreSubjectsObtainedMarks;
	
	
}
