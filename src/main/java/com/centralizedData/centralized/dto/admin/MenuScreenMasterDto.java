package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuScreenMasterDto {

	private String method;
	private String module;
	private String screenName;
	private String sequence;
	private String path;
	private String newtab;
	private List<ModuleDto> moduleToList;
	private List<MenusDto> menusList;
	private List<AssignPrivilegeTO> privilegeList;
	private Long moduleId;
	private Long menuId;
	private String menuName;
	private int oldModuleId;
}
