package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntranceDetailsDto {
	
	private Long id;
	
	private String name;
	
	private Long programId;
	
	private Long programTypeId;
	
	private String programName;
	
	private String programTypeName;
	

}
