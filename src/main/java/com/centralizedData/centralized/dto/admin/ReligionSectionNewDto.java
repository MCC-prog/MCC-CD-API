package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReligionSectionNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2591004936413271629L;
	
	private int id;
	private ReligionNewDto religionTO;
	private String name;
	private Integer createdBy;
	private Date createdDate;
	private Integer modifiedBy;
	
	private String created;;
	private String modified;
	private String isActive;
	private String cDate;
	private String lDate;

}
