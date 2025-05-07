package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpPayAllowanceDto {

	
	private Integer id;
	private String allowanceValue;
	private Boolean isActive;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant modifiedDate;
	//private PayScaleBO payscale;
	private Employee employee;
//	private EmpAllowance empAllowance;
}
