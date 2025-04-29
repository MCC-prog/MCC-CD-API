package com.centralizedData.centralized.dto.admin;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignPrivilegeTO {

	private Long id;
	private Long roleId;
	private Long moduleId;
	private Long menuId;
	private Boolean isActive;
	private MenusDto menusDto;
	private String tempChecked;
	private String checked;
	private String privilegeId;
	private String roleName;
}
