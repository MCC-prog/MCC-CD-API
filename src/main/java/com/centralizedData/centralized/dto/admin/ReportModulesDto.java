package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportModulesDto implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 7911343185022244914L;
	
	
	private String name;
//	private Boolean isActive;
//	private String toolTip;
	private String position;
	private String id;
//	private Boolean choosed;
//	private Integer menuCount;
//	private Boolean chooseTemp;
//	private String createdBy;
//	private String modifiedBy;
//	private String createdDate;
//	private String lastModifiedDate;
//	private String tempIsActive;

}