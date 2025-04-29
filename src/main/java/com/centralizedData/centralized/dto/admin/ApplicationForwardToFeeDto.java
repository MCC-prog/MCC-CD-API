package com.centralizedData.centralized.dto.admin;

import java.time.Instant;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationForwardToFeeDto {
	
	
	private Long id;
	private Long admApplnId;
	private Integer interviewTypeId;
	private Boolean cancelled;
	private Boolean verified;
	private String verifiedBy;
	private String verifiedByUserName;
	private String verifiedDate;
	private List<StudentDocumentsDto> docToList;
	private String secondLanguageId;
	private String admittedThroughId;
	
	private String studentName;
	private String applicationNumber;
	private String baseStudentId;
	private String courseName;
	private String uniqueId;
	private String remarks;
	private Boolean rejected;

}
