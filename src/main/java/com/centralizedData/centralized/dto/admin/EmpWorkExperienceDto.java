package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import com.centralizedData.centralized.model.admin.EmpJob;
import com.centralizedData.centralized.model.admin.EmpWorkExperience;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpWorkExperienceDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3644665629847878691L;

	private String id;
	private String employeeId;
	private String jobTitle;
	private String employer;
	private String comments;
	private String startDate;
	private String endDate;
	private boolean internal;
	private boolean tempInternal;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private boolean isActive;
	private boolean originalPresent;
	private EmpWorkExperience originalExperience;
}
