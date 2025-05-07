package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantWorkExperienceDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3571482727679836465L;
	private long id;
	private long admApplnId;
	private String organization;
	private String fromDate;
	private String toDate;
	private String position;
	private String reportingTo;
	private Boolean isCurrent;
	private String salary;
	private String organizationPhNo;
	private String occupationId;
	private String phoneNo;
	private String address;

}
