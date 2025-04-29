package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeOnlineLeaveDto implements Serializable{
	
	private String startDate;
	private String endDate;
	private String isHalfday;
	private String leaveTypeId;
	private String reason;
	private String isAm;
	private String approverMailId;
	private String employeeEmailId;
	private String employeeName;
	private String fingerPrintId;
	private Integer empTypeId;
	private Integer employeeId;
	private String departmentName;
	private String designationName;

}
