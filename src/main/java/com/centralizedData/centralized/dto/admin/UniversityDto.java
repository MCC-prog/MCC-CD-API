package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UniversityDto {

	private Long id;
	
	private String name;
	
	private Long documentTypeId;
	
	private String documentTypeName;
}
