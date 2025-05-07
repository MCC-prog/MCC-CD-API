package com.centralizedData.centralized.dto.admin;

import java.time.Instant;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.model.admin.Organisation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {
	
	private Long id;
	
	private String organizationName;
	private MultipartFile organizationLogo;
	private MultipartFile organizationtopBar;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
//	private int id;
	private String organizationTopBarName;
	private String organizationLogoName;
	private boolean logoPresent;
	private boolean topbarPresent;
	private boolean needApproval;
	private String createdBy;
	private String modifiedBy;
	private Boolean sameUseridPassword;
	private boolean changePassword;
	private String name;
	private Instant createdDate;
	private Instant lastModifiedDate;
	private String logoName;
	private String topbarName;
	private String logoContentType;
	private String topbarContentType;
	private String isActive;
	private String needFinalApprival;
	private String useridPassword;
	private String enableChangePassword;
	private boolean finalMeritListApproval;
	private String dispFinalMeritApproval;
	private MultipartFile organizationLogo1;
	private MultipartFile organizationtopBar1;
	private String organizationTopBarName1;
	private String organizationLogoName1;
	private boolean logoPresent1;
	private boolean topbarPresent1;
	private List<ExtracurricularActivityDto> extracurriculars;
	private byte[] logo;
	private int timeLimit;
	private boolean openHonoursCourseLink;
	private boolean convocationRegistration;
	private boolean studentPhotoUpload;
	

}
