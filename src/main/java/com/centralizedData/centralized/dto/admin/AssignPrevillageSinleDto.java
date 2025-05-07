package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignPrevillageSinleDto implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4104392352763567605L;
	private Integer id;
	private Long roleId;
	private String roleName;
	private Integer moduleId;
	private Integer menuId;
	private Boolean isActive;
	//private MenusTO menusTO;
	private String tempChecked;
	private String checked;
	private String privilegeId;

}
