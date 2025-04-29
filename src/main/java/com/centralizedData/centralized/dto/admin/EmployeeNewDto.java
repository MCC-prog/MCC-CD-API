package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.model.admin.Country;
import com.centralizedData.centralized.model.employee.Employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeNewDto implements Serializable,Comparable<EmployeeNewDto>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5223717379794391097L;
	
	private Integer id;
	private Integer userId;
	private StateNewDto stateByCommunicationAddressStateId;
	private StateNewDto stateByPermanentAddressStateId;
	private CountryNewDto countryByPermanentAddressCountryId;
	private CountryNewDto countryByCommunicationAddressCountryId;
	private SingleFieldMasterDto departmentTO;
	private DepartmentEntryDto departmentTo;
	private SingleFieldMasterDto designationTO;
	private String firstName;
	private String middleName;
	private String lastName;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModifiedDate;
	private String dob;
	private Date doj;
	private String permanentAddressLine1;
	private String permanentAddressLine2;
	private String permanentAddressCity;
	private String permanentAddressZip;
	private String communicationAddressLine1;
	private String communicationAddressLine2;
	private String communicationAddressCity;
	private String communicationAddressZip;
	private String communicationCountryId;
	private String communicationCountryName;
	private String communicationStateId;
	private String communicationStateName;
	
	private String permanentCountryId;
	private String permanentCountryName;
	private String permanentStateId;
	private String permanentStateName;
	
	
	private String phone1;
	private String phone2;
	private String email;
	private String fatherName;
	private String bloodGroup;
	private String communicationAddressStateOthers;
	private String permanentAddressStateOthers;
	private String name;
	private String dateOfJoining;
	private byte[] empPhoto;
	private String empImmigrationId;
	private String empWorkTimeId;
	private String nationalityId;
	private String nationalityName;
	private String code;
	private String nickName;
	private String uid;
	private String panNo;
	private boolean smoker;
	private boolean tempsmoker;
	private String maritalStatus;
	private String gender;
	private String drivingLicenseNo;
	private String licenseExpDate;
	private String militaryService;
	private String ethinicRace;
	private String toTime;
	private String city;
	private boolean passport;
	private String currentAddressHomeTelephone1;
	private String currentAddressHomeTelephone2;
	private String currentAddressHomeTelephone3;
	private String currentAddressWorkTelephone1;
	private String currentAddressWorkTelephone2;
	private String currentAddressWorkTelephone3;
	private String permanentAddressHomeTelephone1;
	private String permanentAddressHomeTelephone2;
	private String permanentAddressHomeTelephone3;
	private String currentAddressMobile1;
	private String currentAddressMobile2;
	private String currentAddressMobile3;
	private String permanentAddressMobile1;
	private String permanentAddressMobile2;
	private String permanentAddressMobile3;
	private String reportToId;
	private String reportToName;
	private String finalAuthorityId;
	private String finalAuthorityName;
	
	private String emergencyContName;
	private String relationship;
	private String emergencyMobile1;
	private String emergencyMobile2;
	private String emergencyMobile;
	private String emergencyHomeTelephone1;
	private String emergencyHomeTelephone2;
	private String emergencyHomeTelephone;
	private String emergencyWorkTelephone1;
	private String emergencyWorkTelephone2;
	private String emergencyWorkTelephone;
	private String workEmail;
	private String otherEmail;
	private String approvalRemarks;
	
	private List<EmpDependentsDto> dependents;
	private List<EmpImmigrationDto> immigrations;
	private List<EmpJobDto> jobs;
	private List<EmpWorkExperienceDto> experiences;
	private List<EmpEducationDto> educations;
	private List<EmpSkillsDto> skills;
	private List<EmpLanguagesDto> languages;
	
	private Employee originalEmployee;
	private String stream;
	private String active;
	private String workLocationId;
	private String employeeType;
	private String activeDummy;
	private String departmentId;
	private String designationId;
	private String fingerPrintId;
	
	private String motherName;
	private String emailId;
	private String password;
	private boolean isAddRemarks;
	private String roleId;
	private String userName;
	private boolean isViewRemarks;

	private MultipartFile empPhotoName;
	
	private String dummyCode;
	private String dummyFirstName;
	private String dummyDepartmentId;
	private String dummyDesignationId;
	private String dummyFingerPrintId;
	private String dummyUid;
	private String dummyDesignationName;
	private String dummyDepartmentName;
	private String dummyEmployeeType;
	private Boolean dummyActive;
	
	private String dummyMiddleName;
	private String dummyLastName;
	private String dummyNickName;
	private Boolean isTeachingStaff;
	private String newFirstName;
	private String newMiddleName;
	private String newLastName;
	private String newNickName;
	private String newCode;
// Employee Smart Card Generationb
	private boolean photoAvailable;
	private String bankAccNo;
	private String departmentName;
	private String mobile;
	private String permanantBankStateId;
	private String permanentAddressCountry;
	private String currentBankStateId;
	private String pbankCCode;
	private String currentCityCode;
	private String designationName;
	private String departmentCode;
	private String checked1;
	private boolean isPhoto;
	private Boolean isPunchingExcemption;
	//
	private String workLocationName;
	private String religion;
	private String reservationCatagory;
	private String smartCardNo;
	private String fourWheelerNo;
	
	private String twoWheelerNo;
	private String homeTelephone;
	private String workTelephone;
	private String rejoinDate;
	private String retirementDate;
	private String grade;
	private String title;
	private String subjectArea;
	private String qualificationLevel;
	private String highestQualification;
	private String scale;
	private String passPortNo;
	private String passPortIssuedDate;
	private String passPortStatus;
	private String passPortDOE;
	private String passPortReviewComments;
	private String passPortComments;
	private String passPortCItizenShip;
	private String visaNo;
	private String visaIssuedDate;
	private String visaStatus;
	private String visaDoe;
	private String visaReviewComments;
	private String visaComments;
	private String visaCitizenShip;
	private String dateOfLeaving;
	private String dateOfResignation;
	private String reasonOfLeaving;
	private String teachingStaff;
	private String totalExpYears;
	private String totalExpMonths;
	private String relevantExpYears;
	private String relevantExpMonths;
	private String photo;
	private String age;
	private String approverName;
	private String noOfPublicationsRefered;
	private String noOfPublicationsNotRefered;
	private String books;
	private String payScaleId;
	private String extensionNumber;
	private String photoEmp;
	private String deptName;
	private String experienceInYearsAndMonths;
	private String totalCurrentExpYearsAndMonths;
	private String appliedDate;
	private String cardType;
	private String remarks;
	private String deputaionToDepartment;
	private String appointmentLetterDate;
	private String referenceNumberForAppointment;
	private String releavingOrderDate;
	private String referenceNumberForReleaving;

	@Override
	public int compareTo(EmployeeNewDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
