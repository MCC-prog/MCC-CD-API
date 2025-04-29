package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpApplyLeavesDto implements Serializable{
	
	private String id;
	private String empLeaveType;
	private String fromDate;
	private String toDate;
	private String reason;
	private String noOfDays;
	private String isHalfDay;
	private String isAm;
	private String status;
	private String employeeName;
	private String employeeId;
	private String checked;
//	private Employee employee;
	private String empLeaveTypeId;
	private String empFingureId;
	private String year;
	//private EmpOnlineLeave onlineLeave;
	private String empId;
	private String empTypeId;
	private String approvedBy;
	private String rejectedReason;
	private String referenceNumber;
	private String startDate;
	private String endDate;

}
