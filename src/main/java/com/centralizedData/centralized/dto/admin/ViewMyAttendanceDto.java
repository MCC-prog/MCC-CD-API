package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ViewMyAttendanceDto implements Serializable{
	
	
	private String empCode;
	private String empName;
	private String fingerPrintId;
	private String userId;
	private List<EmpAttendanceDto> empPreviousAttTo;
	private Boolean viewEmpAttendance;
	//private List<EmpApplyLeaveTO> empPreviousLeaveTo;
	private boolean previous;
	private String departmentId;
	private String teachingStaff;
	private String months;
	private String depName;
	private String depInTime;
	private String depOutTime;
	private String inTime;
	private String outTime;
	private String attendanceDate;
	private String year;

}
