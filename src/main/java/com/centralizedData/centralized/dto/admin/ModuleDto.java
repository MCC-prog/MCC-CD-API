package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuleDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4547426514554761479L;
	
	private String modulename;
	private Boolean isActive;
	private String toolTip;
	private String position;
	private String id;
	private Boolean choosed;
	private String menuCount;
	private Boolean chooseTemp;
	private String createdBy;
	private String modifiedBy;
	private String createdDate;
	private String lastModifiedDate;
	private String tempIsActive;
	private List<MenusDto> menusTO;

}

