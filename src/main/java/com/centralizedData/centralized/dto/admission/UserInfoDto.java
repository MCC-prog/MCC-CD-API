package com.centralizedData.centralized.dto.admission;

import java.io.Serializable;

public class UserInfoDto implements Serializable{
	
	private static final long serialVersionUID = -8396519616861883645L;

	private String empName;
	
	private String department;
	
	private String mobile;
	
	private String address;
	
	private String workEmail;
	
	public UserInfoDto() {
		
	}

	public UserInfoDto(String empName, String department, String mobile, String address, String workEmail) {
		super();
		this.empName = empName;
		this.department = department;
		this.mobile = mobile;
		this.address = address;
		this.workEmail = workEmail;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWorkEmail() {
		return workEmail;
	}

	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	
}
