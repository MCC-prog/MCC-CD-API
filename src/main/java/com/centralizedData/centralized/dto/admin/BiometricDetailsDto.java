package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BiometricDetailsDto implements Serializable{
	
	private Long id;
	private String machineId;
	private String machineIp;
	private String machinName;
	private String workLocation;
	private String hostelName;
	private String blockName;
	private String unitName;

}
