package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendedByDto {

	private Long  id;
	
	private String code;
	
	private String name;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private Long stateId;
	
	private Long countryId;
	
	private String stateName;
	
	private String countryName;
	
	private String phone;
	
	private String comments;
	
	private String createdBy;
	
	private Instant createdDate;
	
	private String modifiedBy;
	
	private Instant lastModifiedDate;
	
	private Boolean isActive;
	
}
