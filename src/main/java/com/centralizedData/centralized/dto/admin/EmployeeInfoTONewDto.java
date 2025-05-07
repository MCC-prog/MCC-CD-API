package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeInfoTONewDto {
	
	
	private List<EmpPreviousOrgDto> experiences;
	private List<EmpPreviousOrgDto> teachingExperience;
	private List<EmpQualificationLevelDto> empQualificationLevelTos;
	private List<EmpQualificationLevelDto> empQualificationFixedTo;
	private List<EmpLeaveDto> empLeaveTo;
	private List<EmpTypeDto> empTypeToList;
	private List<EmpAcheivementDto> empAcheivements;
	
	private List<EmpLoanDto> empLoan;
	private List<EmpFinancialDto> empFinancial;
	private List<EmpFeeConcessionDto> empFeeConcession;
	private List<EmpRemarksDto> empRemarks;
	private List<EmpIncentivesDto> empIncentives;
	private List<EmpImmigrationDto> empImmigration;
	private List<EmpLeaveAllotDto> empLeaveToList;
	private List<EmpDependentsDto> empDependentses;
	private List<EmpAllowanceDto> payscaleFixedTo;	
	private List<EmpPayAllowanceDto> payAllowanceTo;	
	private List<PfGratuityNomineesDto> pfGratuityNominee;

}
