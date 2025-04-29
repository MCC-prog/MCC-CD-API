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
public class EmpAttendanceDto implements Serializable {

	
	private Integer id;
	private Integer employee;
	private String inTime;
	private String outTime;
	private String attendanceDate;
	private String empCode;
	private String fingerPrintId;
	private String empName;
	private String totalWorkingHours;
}
