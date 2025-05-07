package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import com.centralizedData.centralized.model.admin.EmpSkills;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpSkillsDto implements Serializable{
	
	private String id;
	private String employeeId;
	private String name;
	private String yearOfExperience;
	private String comments;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private boolean isActive;
	private boolean originalPresent;
	private EmpSkills originalSkill;

}
