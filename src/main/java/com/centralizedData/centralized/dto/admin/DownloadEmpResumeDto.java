package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DownloadEmpResumeDto implements Serializable {

	private String startDate;
	private String endDate;
	private String employeeName;
	private String departmentName;
	private String employeeId;
	private Integer[] employeeIds;
	//private List<Department> departmentList;
	//private List<Designation> designationList;
	private String departmentId;
	private String designationId;
	//private List<EmpQualificationLevel> qualificationList;
	private String qualificationId;
	private List<DownloadEmployeeResumeDto> downloadEmployeeResumeTOs; 
	private String printPage;
	private String method;
	private String emailIds;
	//to resume print
	private List<DownloadEmployeeResumeDto> tos;
	private List<EmpOnlineEducationalDetailsDto> empEducationalDetails;
	private List<EmpOnlinePreviousExperienceDto> teachingExperience;
	private List<EmpOnlinePreviousExperienceDto> industryExperience;
	private List<EmpOnlineEducationalDetailsDto> additionalQualification;
	private String applicationNo;
	private Boolean publicationDetailsPresent;
	private String name;
	private String applnNo;
	private String mailBody;
	private String status;
	private String statusDate; 
	private List<String> appNosList;
	private Map<Integer,String> usersMap;
	private Map<Integer,String> usersMapWithEmails;
	private String[] selectedUserIdsArray;
	private String[] userIdsArray;
	private boolean clear;
	private Boolean isCjc;
	private Map<Integer,String> empSubjects;
	private String empSubjectId;
}
