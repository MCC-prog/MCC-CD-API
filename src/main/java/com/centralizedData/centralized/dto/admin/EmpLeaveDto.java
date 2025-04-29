package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpLeaveDto {
	
	private Integer id;
	private String empLeaveTypeId;
	private String empLeaveTypeName;
	private String employeeId;
	private String leavesAllocated;
	private String leavesSanctioned;
	private String leavesRemaining;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private Boolean isActive;
	private String name;

}
