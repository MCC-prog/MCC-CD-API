package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import com.centralizedData.centralized.model.admin.EmpEducation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpEducationDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3876341747754416997L;
	private String id;
	private String employee;
	private String empEducationMasterId;
	private String empEducationMasterName;
	private String specialisation;
	private String gpaGrade;
	private String year;
	private String startDate;
	private String endDate;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private boolean isActive;
	private boolean originalPresent;
	private EmpEducation originalEducation;

}
