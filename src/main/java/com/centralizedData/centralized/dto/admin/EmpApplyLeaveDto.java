package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpApplyLeaveDto implements Serializable{

	
	private Long id;
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
	private String empFingureId;
	//private Employee employee;
	private String empLeaveTypeId;
	private String year;
	//private EmpOnlineLeave onlineLeave;
	private String empId;
	private String empTypeId;
	private String approvedBy;
	private String rejectedReason;
	private String referenceNumber;
	private String employeeEmailId;
	private String mailBody;
	private String approverMailId;
	private List<ModifiyEmpLeaveDto>  applyLeaveTo;
	private List<Long> approvedList;
	private String userId;
	private String leavesAllocated;
	private String leavesRemaining;
	private String leavesSanctioned;
	private String empCode;
	private List<EmpLeaveDto> empLeaveTO;
	private List<EmpApplyLeavesDto> empOnlineLeave; 
}
