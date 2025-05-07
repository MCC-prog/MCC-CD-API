package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsEventDto {
	
	private Long id; 
	
	private String description;
	
	private String requiredFor;

}
