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
public class EmpImmigrationDto {
	
	private String id;
	private String employeeId;
	private String passportNo;
	private String passportCountryId;
	private String passportCountryName;
	private String passportStatus;
	private String passportReviewStatus;
	private String passportIssueDate;
	private String passportExpiryDate;
	private String passportComments;
	private String visaNo;
	private String visaCountryId;
	private String visaCountryName;
	private String visaStatus;
	private String visaReviewStatus;
	private String visaIssueDate;
	private String visaExpiryDate;
	private String visaComments;
	
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private boolean isActive;
	private boolean originalPresent;
	private String dataPresent;
	//private EmpImmigration originalimmigration;

}
