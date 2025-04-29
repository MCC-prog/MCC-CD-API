package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpAllowanceDto {

	
	private Integer id;
	private String name;
	private String amount;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private Boolean isActive;
	private String allowanceName;
	private Integer empPayAllowanceId;
	private Integer displayOrder;
}
