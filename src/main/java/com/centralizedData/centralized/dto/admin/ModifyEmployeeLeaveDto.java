package com.centralizedData.centralized.dto.admin;

import java.util.List;

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
public class ModifyEmployeeLeaveDto {
	
	private Long id;
	private String academicYear;
	private String isExemption;
	private String empCode;
	private String fingerPrintId;
	private String leaveTypeId;
	private String startDate;
	private String endDate;
	private String isHalfday;
	private String isAm;
	private String employeeName;
	private String designationName;
	private String departmentName;
	private String employeeId;
	private Boolean halfDayDisplay;
	private Boolean amDisplay;
//	private List<EmpLeaveTypeDto> leaveTypes;
	private String reason;

}
