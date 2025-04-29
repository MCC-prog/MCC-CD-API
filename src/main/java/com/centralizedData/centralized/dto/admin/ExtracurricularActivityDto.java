package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtracurricularActivityDto {

	private Long id;
	private String organisationId;
	private String name;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String lastModifiedDate;
	private boolean isActive;
	private OrganizationDto organizationTO;
	
	private Date extraCurricularCreatedDate;
	private Date extraCurricularLastModifiedDate;
	private String tempActive;
}
