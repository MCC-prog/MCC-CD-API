package com.centralizedData.centralized.dto.admin;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeInfoFormNewDto {
	
	private String mobPhone1;
	private String mobPhone2;
	private String mobPhone3;
	private String panno;
	private String religion;
	private String bloodGroup;
	
	private byte[] photo;
	private String mobile;
	
	private String telNo;
	private String expectedSalaryLack;
	private String passportCountryId;
	private String visaCountryId;
	private String payScaleId;
	private String nationalityId;
	private String religionId;
	private String religionName;
	private String countryId;
	private String empJobTypeId;
	private String departmentId;
	private String stateId;
	private String empEducationDetailsId;
	private String empAcheivementId;
	private String emptypeId;
	private String streamId;
	private String workLocationId;
	private String reportToId;
	
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String code;
	private String gender;
	private String maritalStatus;
	private String city;
	private String dateOfBirth;
	private String homePhone1;
	private String homePhone2;
	private String homePhone3;
	private String workPhNo1;
	private String workPhNo2;
	private String workPhNo3;
	private String age;
	private String mobileNo1;
	private String mobileNo2;
	private String mobileNo3;
	private String email;
	private String employmentStatus;
	private String expectedSalaryLakhs;
	private String expectedSalaryThousands;
	private String desiredPost;
	private String dateOfJoining;
	private String informationKnown;
	private String recommendedBy;
	private MultipartFile empPhoto;
	
	private String bankAccNo;
	private String pfNo;
	private String vehicleNo;
	private String twoWheelerNo;
	private String fourWheelerNo;
	

	private String status;
	
	private String vacancyInformation;
	private String designationId;
	private String jobCode;
	private String currentAddressLine1;
	private String currentAddressLine2;
	private String currentAddressLine3;
	private String currentCity;
	private String currentState;
	private String currentCountryId;
	private String permanentZipCode;
	private String currentZipCode;
	private String reservationCategory;
	private String empQualificationLevelId;
	private String emJobTypeId;
	private String[] eligibilityTest;
	private String noOfPublicationsRefered;
	private String noOfPublicationsNotRefered;
	private String books;
	private String otherInfo; 
	private String applicationNO;
	private String empSubjectAreaId;
	private String empRetirementAge;
	private String deputationDepartmentId;
	private String empTypeIdOld;
	
	
	
	
	
	
	//private Map<String,String> designationMap;
	//private DesignationDto designationDto;
	
	   private String designationIds;
		
		private String designatioName;
	//private Map<String,String> departmentMap;
	//private DepartmentEntryDto departmentEntryDto;
		 private String deptId;
			
		private String deptName;
	//private Map<String,String> countryMap;
	//private CountryDto countryDto;

		private String countryIds;
		
		private String countryName;	
	//private Map<String,String> stateMap;
	
	//private StateDto stateDto;
		private String stateIds;
		private String stateName;
	//private Map<String,String> nationalityMap;
	//private NationalityDto nationalityDto;
		private String nationId;
		
		private String nationalityName;
	//private Map<String,String> qualificationLevelMap;
//	private QualificationLevelDto qualificationLevelDto;
		
		private String qualificationIds;
		private String qualificationName;		
	//private Map<String,String> qualificationFixedMap;
	private QualificationLevelDto qualificationLevelFixDto;
	//private Map<String,String> qualificationMap;
	private QualificationLevelDto qualificationLevelFixedDto;
	//private Map<String,String> subjectAreaMap;
	//private SubjectAreaDto subjectAreaDto;
	
	
	private String subjId;
	private String subName;
	private Map<String,String> lakhsAndThousands;
	
	//private Map<String,String> religionMap;
	
	//private RegionDto regionDto;
	private String regionId;
	private String regionName;
	//private Map<String,String> empTypeMap;
	//private EmpTypeDto empTypeDto;
	//private String empTypeId;
	private String EmptypeName;
	//private Map<String,String> streamMap;
	//private StreamDto streamDto;
	private String streamIds;
	private String streamName;
	//private Map<String,String> workLocationMap;
	
	//private WorkLocationDto workLocationDto;
	
    private String workLocId;
	
	private String workLocName;
//	private Map<String,String> reportToMap;
	
	//private EmployeeDto employeeDto;
	private String employeeId;
	private String firstName;
	//private Map<String,String> payScaleMap;
	
	//private EmpAllowanceDto empAllowanceDto;
	private String empId;
	private String allowanceName;
	private Map<String,String> passportCountryMap;
	private Map<String,String> visaCountryMap;
	
	
	//private Map<String,String> titleMap;
	
	//private EmpJobTypeDto empJobTypeDto;
	
	private String empJobTypeIds;
	private String empJobTypeName;
	private String sameAddress;
	
	private String currentlyWorking;
	private String designationPfId;
	private String orgAddress;
	
	private boolean adminUser;
	private String mode;
	private String jobType;
	private String yearComp;
	private String appliedYear;
	private MultipartFile file;
	private Map<String,String> postAppliedMap;
	private Map<String,String> currentCountryMap;
	private Map<String,String> currentStateMap;
	private String teachingExpLength;
	private String industryExpLength;
	private String currentStateOthers;
	private String tempState;
	private String tempPermanentState;
	private Map<String,String> jobTypeMap;
	private String qualificationId;
	private String expYears;
	private String expMonths;
	private EmployeeInfoTONewDto employeeInfoTONew;
	private String teachingStaff;
	private String officialEmail;
	
	private List<EmpLeaveTypeDto> leaveTypeTOs;
	private List<EmpLeaveDto> leaveTOs;
	private List<EmpAcheivementDto> achievementTOs;
	private List<EmpAcheivementDto> newAchievementTOs;
	
	private List<EmpTypeDto> empTypeTo;
	private List<EmpLeaveAllotDto> empLeaveAllotTo;
	
	private List<EmployeeDto> reportingTos;
	private List<EmployeeStreamDto> streamTO;

	private boolean employeeFound;
	
	private EmployeeDto employeeDetail;
	private String rejoinDate;
	private String retirementDate;
	private String superAnnuationDate;
	private String active;
	private String grade;
	private String scale;
	private String hra;
	private String da;
	private String grossPay; 
	private String basicPay;
	private String dependantName;
	private String dependantRelationShip;
	private String dependantDOB;
	private String emContactRelationship;
	private String emContactName;
	private String emContactHomeTel;
	private String emContactWorkTel;
	private String emContactMobile;
	private String passportNo;
	private String passportIssueDate;
	private String passportStatus;
	private String passportExpiryDate;
	private String passportReviewStatus;
	private String passportComments;
	
	private String visaNo;
	private String visaIssueDate;
	private String visaStatus;
	private String visaExpiryDate;
	private String visaReviewStatus;
	private String visaComments;
	private String startingTimeHours;
	private String startingTimeMins;
	private String endingTimeHours;
	private String endingTimeMins;
	private String satEndingTimeMins;
	private String satEndingTimeHours;
	private String startTimeInEndsHours;
	private String startTimeInEndsMins;
	private String reasonOfLeaving;
	private String dateOfResignation;
	private String dateOfLeaving;
	private String acheivementName;
	private String details;
	private String loanDate;
	private String loanAmount;
	private String loanDetails;
	private String financialDate;
	private String financialAmount;
	private String financialDetails;
	private String incentivesDate;
	private String incentivesAmount;
	private String incentivesDetails;
	private String feeConcessionDate;
	private String feeConcessionAmount;
	private String feeConcessionDetails;
	private String remarkDate;
	private String enteredBy;
	private String remarkDetails;
	private String timeIn;
	private String timeInEnds;
	private String timeOut;
	private String saturdayTimeOut;
	private String halfDayStartTime;
	private String halfDayEndTime;
	private String timeInMin;
	private String timeInEndMIn;
	private String timeOutMin;
	private String saturdayTimeOutMin;
	private String halfDayStartTimeMin;
	private String halfDayEndTimeMin;
	private String uId;
	private String fingerPrintId;
	private String loanListSize;
	private String remarksListSize;
	private String feeListSize;
	private String financialListSize;
	private String dependantsListSize;
	private String immigrationListSize;
	private String incentivesListSize;
	private String achievementListSize;
	private String levelSize;
	private String designation;
	private String highQualifForAlbum;
	private String relevantExpMonths;
	private String relevantExpYears;
	private String otherPermanentState;
	private String otherCurrentState;
	private String flag;
	private String titleId;
	private String forwardFlag;
	private String smartCardNo;
	private String isPunchingExcemption;
	private String eligibilityTestNET;
	private String focusValue;
	private String otherEligibilityTestValue;
	private String eligibilityTestOther;
	private String eligibilityCheckboxOther;
	private String industryFunctionalArea;
	private String handicappedDescription;
	private Boolean isCjc;
	private String empImageId;
	private byte[] photoBytes;
	private String albumDesignation;
	//added by sudhir
	private String teaching;
	private String industry;
	private String extensionNumber;
	private String licGratuityNo;
    private String licGratuityDate;
    private String nomineePfNo;
    private String nomineePfDate;
	private String eligibilityTestSLET;
	private String eligibilityTestSET;
	private String eligibilityTestNone;
	private String emContactAddress;
	private List<EmpEligibilityTestDto> eligibilityList;
	private String nameAdressNominee;
	private String memberRelationship;
	private String dobMember;
	private String share;
	private String nameAdressGuardian;
	private String pfGratuityListSize;
	private String researchPapersRefereed;
	private String researchPapersNonRefereed;
	private String researchPapersProceedings;
	private String nationalPublications;
	private String internationalPublications;
	private String localPublications;
	private String international;
	private String national;
	private String majorProjects;
	private String minorProjects;
	private String consultancyPrjects1;
	private String consultancyProjects2;
	private String phdResearchGuidance;
	private String mphilResearchGuidance;
	private String fdp1Training;
	private String fdp2Training;
	private String regionalConference;
	private String internationalConference;
	private String nationalConference;
	private String localConference;
	private String fatherName;
	private String motherName;
	private String deputaionToDepartmentId;
	private String appointmentLetterDate;
	private String referenceNumber;
	private String releavingOrderDate;
	private String referenceNumberForReleaving;
	private Map<String,String> deputaionToDepartmentMap;
	private String additionalRemarks;
	private String isSendSms;
	private String isSmartCardDataGenerated;
	private String isSmartCardDataDelivered;
	private String displayInWebsite;
     private String referenceNumberForAppointment;
     private Integer currentExpYears;
		private Integer currentExpMonths;
		private Integer totalCurrentExpYears;

}
