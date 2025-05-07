package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailedSubjectsDto implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -418773937228792148L;
	
	private Integer id;
	private String createdBy;;
	private String modifiedBy;
	private CourseNewDto courseTo;
	private String subjectName;
	private Boolean isActive;
	private Date createdDate;
	private Date lastModifiedDate;
	private String cDate;
	private String lDate;
}
