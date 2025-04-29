package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenusDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6152908805303316961L;
	private String id;
	private ModuleDto moduleTO;
	private String name;
	private Integer position;
	private String url;
	private Boolean newtab;
	private Boolean isActive;
	private Boolean isChoosed;
	private Boolean chooseTemp;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String lastModifiedDate;
	private String tempIsActive;

}