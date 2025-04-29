package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeDto {

	
	private Long id;
	private String incomeRange;
	private long currencyId;
	private String currencyName;
	
}
