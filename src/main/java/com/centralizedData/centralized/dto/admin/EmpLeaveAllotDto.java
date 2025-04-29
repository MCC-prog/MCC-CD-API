package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import com.centralizedData.centralized.model.admin.EmpLeaveType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpLeaveAllotDto {

	
	
	private Integer id;
	private String empType;
	private String leaveType;
	private String allottedLeave;
	private String sanctionedLeave;
	private String remainingLeave;
	private EmpLeaveType empLeaveType;
	private int empLeaveId;
	private String month;
	private Integer year;
}
