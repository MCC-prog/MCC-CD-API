package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LeaveAllotmentDto implements Serializable {
	
	private Long id;
	private String empTypeId;
	private String leaveTypeId;
	private String empType;
	private String leaveType;
	private String allottedLeave;
	private String initializeRequired;
	private String origAccumulatedLeave;

}
