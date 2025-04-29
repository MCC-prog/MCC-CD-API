package com.centralizedData.centralized.dto.admin;

import java.util.Date;

import com.centralizedData.centralized.utils.CommonUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyMasterDto {
	
	private Long id;
	private String createdBy;
	private String modifiedBy;
	private String name;
	private String currencySubdivision;
	private String currencyCode;
	private Date createdDate;
	private Date lastModifiedDate;
	private Boolean isActive;
	private String symbol;
	private String active;
	private String cDate;
	private String lDate;

}
