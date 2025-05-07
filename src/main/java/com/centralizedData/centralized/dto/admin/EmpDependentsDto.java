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
public class EmpDependentsDto {

	
	private String id;
	private String employeeId;
	private String dependantName;
	
	private String dependentRelationship;
	private String dependantDOB;
	
	
	private String child1Name;
	private String child2Name;
	private String child1DateOfBirth;
	private String child2DateOfBirth;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private Boolean isActive;
	
	private Boolean originalPresent;
	
	//private EmpDependents originalDependent;
	//private EmpDependents empDependentses;
	
}
