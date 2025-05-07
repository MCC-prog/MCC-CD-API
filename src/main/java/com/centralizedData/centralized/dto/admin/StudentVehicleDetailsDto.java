package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentVehicleDetailsDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4318644618899535583L;
	private Long id;
	private String vehicleType;
	private String vehicleNo;

}
