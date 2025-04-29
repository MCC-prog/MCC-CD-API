package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignPrivilegeDto implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7329844429839312737L;
	private String id;
	private Long roleId;
	private String roleName;
	private String moduleId;
	private String oldRoleId;
	private List<RolesDto>roleList;
	private List<ModuleDto>moduleList;
	private List<ReportModulesDto> reportModuleList;
	private List<AssignPrevillageSinleDto>privilegeList;
	private Map<String, Set<String>> moduleMenuMap;
	private Boolean isActive;
	private String menuId;
	//Used while edit button is clicked
	private List<AssignPrivilegeDto>assignPrivilegeTOList;

}
