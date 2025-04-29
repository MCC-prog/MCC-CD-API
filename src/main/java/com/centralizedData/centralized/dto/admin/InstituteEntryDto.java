package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstituteEntryDto {
	
	private Long id;
	
	private String name;
	
	private Long universityId;
	
	private String universityName;
	
	private Boolean isApprovalRequired;

}
