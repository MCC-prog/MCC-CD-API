package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDocumentsDto {
	
	private Long id;
	private MultipartFile uploadFile;
	private String fileName;
	private String fileType;
	private Boolean isVerified;
	private Boolean isRejected;
	private Boolean isPending;
	private Integer studentId;
	private String createdBy;;
	private String modifiedBy;
	private String verifiedBy;
	private Instant createdDate;
	private Instant lastModifiedDate;
	private Integer docTypeId;
	private String rejectReason;
	private String status;
	private String doctypeName;
	private String doctypeShortName;
	private String fileSize;
	private String fileSizeToPrint;
	private Boolean isActive;
	private String uploadedDate;
	private String instruction;
	private String documentPath;
	private Instant verifiedDate;


	
}
