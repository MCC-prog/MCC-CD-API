package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewBreakTimeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4139798864219582434L;

	private int id;
	//private EmployeeTO employeeByCreatedBy;
	private InterviewScheduleDto interviewSchedule;
	//private EmployeeTO employeeByModifiedBy;
	private String startTime;
	private String endTime;
	private Date createdDate;
	private Date lastModifiedDate;
}
