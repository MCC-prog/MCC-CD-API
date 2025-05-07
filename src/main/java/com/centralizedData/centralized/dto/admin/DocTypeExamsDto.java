package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocTypeExamsDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7474877363341573681L;
	
	private Long id;
	private String docTypeId;
	private String name;
	private boolean isActive;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private String docTypeName;

}
