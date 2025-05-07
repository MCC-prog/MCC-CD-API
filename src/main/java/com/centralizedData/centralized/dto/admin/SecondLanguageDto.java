package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

public class SecondLanguageDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6832319598105526398L;
	
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
