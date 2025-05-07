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
public class EmpLeaveTypeDto {
	
	
	private Integer id;
	private String name;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private Boolean isActive;
	private String sanctionedLeave;
	private String code;
	private Boolean isExcemption;
	private Boolean continuousDays;
	private Boolean isLeave;
private Boolean canApplyOnline;
}
