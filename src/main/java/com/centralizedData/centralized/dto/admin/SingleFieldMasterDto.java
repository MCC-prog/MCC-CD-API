package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleFieldMasterDto implements Serializable,Comparable<SingleFieldMasterDto> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7900744072922195899L;

	private int id;
	private String name;
	private Date createdDate;
	
	private Date lastModifiedDate;
	
	@Override
	public int compareTo(SingleFieldMasterDto arg0) {
		if(arg0.getName()!=null && this.getName()!=null){
			return this.getName().compareTo(arg0.getName());
		}else
		return 0;
	}
}
