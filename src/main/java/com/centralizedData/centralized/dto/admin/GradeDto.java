package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GradeDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 864325164212711659L;
	private Integer id;
	private String grade;
	private Integer mark;

	private String marks;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private String isActive;
	private String cDate;
	private String lDate;

}
