package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateDto {
	
	private Long id;

	private Long countryId;
	
	private String countryName;
	
	private String name;
	
	private String bankStateId;
}
