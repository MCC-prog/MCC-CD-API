package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CollegeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5546696157304319563L;

	private int id;
	private UniversityNewDto universityTO;
	private String name;
	private Integer addressId;
	private byte[] logo;
	private Set weightageDefinitions = new HashSet(0);
	
	private String createdBy;;
	private String modifiedBy;
	private Date createdDate;
	private Date lastModifiedDate;
	private String isActive;
	private String cDate;
	private String lDate;
}
