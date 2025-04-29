package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuDto {
	
	private Long id;
	
	private Long moduleId;
	
	private String moduleName;
	
	private String screenName;
	
	private String path;
	
	private Integer sequence;
	
	private Boolean newTab;
	
	private Boolean isMenuLink;

	private String errorMessage;
	
	public MenuDto(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
