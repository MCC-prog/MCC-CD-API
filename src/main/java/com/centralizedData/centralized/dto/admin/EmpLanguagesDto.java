package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import com.centralizedData.centralized.model.admin.EmpLanguage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpLanguagesDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6398677442047791251L;
	private String id;
	private String employeeId;
	private String name;
	private String fluency;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private boolean isActive;
	private boolean originalPresent;
	private EmpLanguage originalLanguage;
}
