package com.centralizedData.centralized.dto.admin;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDocumentVerificationDto {
	
	private List<StudentDocumentsDto> docToList;
	private String studRegNo;
	private Map<String,String> docTypeMap;
	private String selectedDocumentType;
	private String selectedDocId;
	private String selectedMode;
	private String appliedYear;
	private String secondLanguageId;
	private String admittedThroughId;
	private String interviewTypeId;
	private Boolean docVerified;
	private Boolean docRejected;
	private Boolean assignFee;
	
	private String applicationNumber;
	private List<ApplicantDocumentsDto> applicantDocList;
	private String studOnlineApplnId;
	private List<ApplicationForwardToFeeDto> applicationForwardToFeeToList;
	private String remarks;
	private ApplicationForwardToFeeDto selectedFeeTo = new ApplicationForwardToFeeDto();
	private String selectedFeeForwardId;
	private Map<Long,String> admittedThroughMap;
	private Map<Integer,String> secondLanguageMap;
	private String operationMode;
	
	private String nameOfStudent;
	private String className;
	private String courseName;
	private String studentId;
	

}
