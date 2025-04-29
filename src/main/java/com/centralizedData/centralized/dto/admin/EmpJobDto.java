package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import com.centralizedData.centralized.model.admin.EmpJob;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpJobDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3465198826774377743L;

	private String id;
	private String employeeId;
	private String jobTitle;
	private String jobSpecification;
	private String employmentStatus;
	private String jobDuties;
	private String joiningDate;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private boolean isActive;
	
	private String departmentType;
	private String dateOfRetirement;
	private String basicPay;
	private String grossPay;
	private String dateOfResign;
	private String resignationReason;
	private String dateOfLeaving;
	private String financialAssisstance;
	private EmpJob originalJob;
	private String dateOfRejoin;
	private String employeeType;
}
