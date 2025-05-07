package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.model.admin.Organisation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrganizationFormDto {


	private String organizationName;
	private MultipartFile organizationLogo;
	private MultipartFile organizationtopBar;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String method;
	private boolean needApproval;
	private List<OrganizationDto> organizationList;
	private int id;
	private int value;
	private boolean sameUseridPassword;
	private boolean changePassword;
	private Organisation organisation;
	private boolean finalMeritListApproval;
	private MultipartFile organizationLogo1;
	private MultipartFile organizationtopBar1;
	private String timeLimit;
	private boolean openHonoursCourseLink;
	private boolean convocationRegistration;
	private boolean studentPhotoUpload;;
}
