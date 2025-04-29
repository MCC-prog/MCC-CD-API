package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpApproverDto implements Serializable{
	
	 private String departmentId;
	 private String approverId;
	 private List<EmployeeDto> employeeToList;

}
