package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5107108009997395786L;
	
	private int id;
	private String name;
	private String isActive;
	private String created;
	private String modified;
	private Integer createdBy;
	private Date createdDate;
	private Integer modifiedBy;
	private Date lastModifiedDate;
	private Set states = new HashSet(0);
	private List<StateNewDto> stateList;
	private String cDate;
	private String lDate;

}
