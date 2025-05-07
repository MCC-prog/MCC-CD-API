package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewSelectedDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6259272439405107363L;

	private int id;
	//private EmployeeTO employeeByCreatedBy;
	//private EmployeeTO employeeByModifiedBy;
	private InterviewProgramCourseNewDto interviewProgramCourse;
	private AdmApplnDto admAppln;
	private Boolean isCardGenerated;
	private Date createdDate;
	private Date lastModifiedDate;
	private Boolean isActive;

}
