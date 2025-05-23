package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReligionSectionDto {

	private Long id;
	
	private String name;
	
	private Long religionId;
	
	private String religionName;
}

