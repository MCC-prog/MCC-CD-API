package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4829470808328742256L;
	
	private String userName;
	private String password;
	private Boolean isAddRemarks;
	private Boolean isViewRemarks;
	private Boolean restrictedUser;
	private String confirmPassword;
	private Boolean teachingStaff;
    private String[]  roleId;
	private String employeeId;
	private String guestId;
	private String departmentId;
	private String pwd;
	private List<UserRolesDto> userRolesDto;
//	private Map<Integer, String> roles;
//	private Map<Integer, String> employeeMap;
//	private Map<Integer, String> guestMap;
//	private Map<Integer, String> departmentMap;
	private int id;
	private String dob;
	private String employeeFirstName;
	private Boolean enableAttendance;
	private Boolean active;
	private String staffType;
	private Boolean multipleLoginAllow;
	private String tillDate;
	private Boolean isLocked;
	private String searchEmployeeId;
	private String searchRoleId;
	private String searchUserName;
	private String searchGuestId;

}
