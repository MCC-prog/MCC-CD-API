package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseSchemeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4040373427921960818L;
	
	private Long courseSchemeId;
	private String courseSchemeName;
	private String isActive;
	private String createdBy;;
	private String modifiedBy;
	private String createdDate;
	private String lastModifiedDate;

}
