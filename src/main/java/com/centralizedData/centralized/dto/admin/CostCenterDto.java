package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostCenterDto {

	private Long Id;

	private String centerName;
	
	private Long feeCostCategoryId;
	
	private String feeCostCategoryName;
}
