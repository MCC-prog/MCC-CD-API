package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto  implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 8909375051048522156L;
	private String employeeId;
	
	private String firstName;
	private String[] empTypeIds;
	private String empTypeId;
	private String departmentId;
	private String tempActive;
	private String dummyUid;

	private String dummyCode;
	private String dummyFingerPrintId;
	private String dummyDesignationName;
	private String designationId;
	private String dummyDepartmentName;
	private String currentAddressMobile1;
	private String dummyEmployeeType;
	private String employeeType;
	private Boolean dummyActive;
	private String mobileNo;
	private String approverName;
	private String approverId;
	private String checked1;
}
