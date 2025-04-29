package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModifiyEmpLeaveDto  implements Serializable{
	
	
	private String fingerPrintId;
	private String isExemption;
	
	private String empCode;
	
	private String acadamicYear;
	
	private String id;
	
	private String employeeName;
	
	private String employeeId;
	private String designationId;
	
	private String designationName;
	
	private String departmentName;
	private String departmentId;
	
	private String reason;
	
	private String leaveTypeId;
	private String leaveTypeName;
	
	private String status;
	
	private String referenceNumber;
	
	private String startDate;
	
	private String endDate;
	
	private String noOfDays;
	
	private String fromAM;
	
	private String toAM;
	
	private String isAm;
	
	private String isHalfday;
	
	private Boolean halfDayDisplay;
	
	private Boolean amDisplay;
	
	private String cancelReason;
	
	private String empTypeId;
	private String empTypeName;
	
	private String oldLeaveTypeId;
	
	private String approvedDate;
	private String authorizedDate;
	private String approverName;
	private String authorizerName;
	private String checked;
	private String workEmail;
	private String otherEmail;
	
	private LeaveTypeDto leaveTypeDto;

}
