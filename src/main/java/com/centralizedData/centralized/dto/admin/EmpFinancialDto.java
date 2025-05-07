package com.centralizedData.centralized.dto.admin;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpFinancialDto {

	
	private Integer id;
	private String employeeId;
	private String financialDate;
	private String financialDetails;
	private String financialAmount;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private Boolean isActive;
}
