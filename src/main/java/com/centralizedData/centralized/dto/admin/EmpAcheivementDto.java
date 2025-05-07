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
public class EmpAcheivementDto {

	
	private Integer id;
	private String employeeId;
	private String achievementLevel;
	private String acheivementName;
	private String details;
	private String status;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private boolean isActive;
	private String awardOrAchievement;
}
