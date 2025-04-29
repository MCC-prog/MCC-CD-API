package com.centralizedData.centralized.dto.admin;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantDocumentsDto {

	
	private Integer id;
	private Integer order;
	private String printName;
	private Integer docTypeId;
	private Integer studentOnlineApplicationId;
	private byte[] uploadFile;
	private String currentPath;
	private String contentType;
	private Integer fileSize;
	private Boolean documentPresent;
	private Boolean notMandatory;
}
