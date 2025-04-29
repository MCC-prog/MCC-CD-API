package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CasteNewDto implements Serializable{
	
	private int casteId;
	private String casteName;
	private String createdBy;;
	private String modifiedBy;
	private Date createdDate;
	private Date lastModifiedDate;
	private String isActive;
	private String cDate;
	private String lDate;
	private String isFeeExcemption;

}
