package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1397765029336301860L;

	private int id;
	private String roomNo;
	private String blockName;
	private String name;
	private String status;
	
}
