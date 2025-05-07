package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateNewDto implements Serializable,Comparable<StateNewDto>{

	private int id;
	private CountryNewDto countryTo;
	private String name;
	private String createdBy;;
	private String modifiedBy;
	private Date createdDate;
	private Date lastModifiedDate;	
	private String isActive;

	private String cDate;
	private String lDate;
	private String countryName;
	private int countryId;
	private String bankStateId;
	
	
	@Override
	public int compareTo(StateNewDto arg0) {
		if(arg0!=null && this!=null && arg0.getName()!=null && this.getName()!=null){
			return this.getName().compareTo(arg0.getName());
		}
		return 0;
	}

}
