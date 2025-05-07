package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessPrivilegeDto {

	private Long privilegeId;
	
	private List<Long> rolesId;
	
	private Long roleId;
	
	private String roleName;
	
	private Long menuId;
	
	private String moduleName;
	
	private Long moduleId;
	
//	private int id;
////	private int roleId;
////	private int moduleId;
////	private int menuId;
//	private boolean isActive;
//	private MenusDto menusDto;
//	private String tempChecked;
//	private String checked;
////	private String privilegeId;
	
	
}
