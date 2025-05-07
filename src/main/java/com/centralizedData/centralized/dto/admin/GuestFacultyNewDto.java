package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.model.employee.Employee;

public class GuestFacultyNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3874380778194043764L;
	
	private Long id;
	private Long userId;
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
	private String totalTeachingExperience;
	private String industryExperience;
	private String totalExp;
	private String industryFunctionalArea;
	private String otherInfo;
	private String eligibilityTest;
	private String subjectSpecilization;
	private String startDate;
	private String endDate;
	private String semester;
	private Boolean isCurrentWorkingDates;
	private String workingHoursPerWeek;
	private String honorariumPerHours;
	private String referredBy;
	private byte[] photoBytes;
	private String staffId;
	private String commuContryName;
	private String commuStateName;
	private String eligibilityTestForOther;
	private String noOfPubNotReffered;
	private String noOfPubReffered;
	private String books;
//	List<GuestPreviousChristWorkDetailsDto> guestPreviousChristWorkDetailsTOs;
	private String bankBranch;
	private String bankIfscCode;
	private String communicationAddress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public StateNewDto getStateByCommunicationAddressStateId() {
		return stateByCommunicationAddressStateId;
	}
	public void setStateByCommunicationAddressStateId(StateNewDto stateByCommunicationAddressStateId) {
		this.stateByCommunicationAddressStateId = stateByCommunicationAddressStateId;
	}
	public StateNewDto getStateByPermanentAddressStateId() {
		return stateByPermanentAddressStateId;
	}
	public void setStateByPermanentAddressStateId(StateNewDto stateByPermanentAddressStateId) {
		this.stateByPermanentAddressStateId = stateByPermanentAddressStateId;
	}
	public CountryNewDto getCountryByPermanentAddressCountryId() {
		return countryByPermanentAddressCountryId;
	}
	public void setCountryByPermanentAddressCountryId(CountryNewDto countryByPermanentAddressCountryId) {
		this.countryByPermanentAddressCountryId = countryByPermanentAddressCountryId;
	}
	public CountryNewDto getCountryByCommunicationAddressCountryId() {
		return countryByCommunicationAddressCountryId;
	}
	public void setCountryByCommunicationAddressCountryId(CountryNewDto countryByCommunicationAddressCountryId) {
		this.countryByCommunicationAddressCountryId = countryByCommunicationAddressCountryId;
	}
	public SingleFieldMasterDto getDepartmentTO() {
		return departmentTO;
	}
	public void setDepartmentTO(SingleFieldMasterDto departmentTO) {
		this.departmentTO = departmentTO;
	}
	public DepartmentEntryDto getDepartmentTo() {
		return departmentTo;
	}
	public void setDepartmentTo(DepartmentEntryDto departmentTo) {
		this.departmentTo = departmentTo;
	}
	public SingleFieldMasterDto getDesignationTO() {
		return designationTO;
	}
	public void setDesignationTO(SingleFieldMasterDto designationTO) {
		this.designationTO = designationTO;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getPermanentAddressLine1() {
		return permanentAddressLine1;
	}
	public void setPermanentAddressLine1(String permanentAddressLine1) {
		this.permanentAddressLine1 = permanentAddressLine1;
	}
	public String getPermanentAddressLine2() {
		return permanentAddressLine2;
	}
	public void setPermanentAddressLine2(String permanentAddressLine2) {
		this.permanentAddressLine2 = permanentAddressLine2;
	}
	public String getPermanentAddressCity() {
		return permanentAddressCity;
	}
	public void setPermanentAddressCity(String permanentAddressCity) {
		this.permanentAddressCity = permanentAddressCity;
	}
	public String getPermanentAddressZip() {
		return permanentAddressZip;
	}
	public void setPermanentAddressZip(String permanentAddressZip) {
		this.permanentAddressZip = permanentAddressZip;
	}
	public String getCommunicationAddressLine1() {
		return communicationAddressLine1;
	}
	public void setCommunicationAddressLine1(String communicationAddressLine1) {
		this.communicationAddressLine1 = communicationAddressLine1;
	}
	public String getCommunicationAddressLine2() {
		return communicationAddressLine2;
	}
	public void setCommunicationAddressLine2(String communicationAddressLine2) {
		this.communicationAddressLine2 = communicationAddressLine2;
	}
	public String getCommunicationAddressCity() {
		return communicationAddressCity;
	}
	public void setCommunicationAddressCity(String communicationAddressCity) {
		this.communicationAddressCity = communicationAddressCity;
	}
	public String getCommunicationAddressZip() {
		return communicationAddressZip;
	}
	public void setCommunicationAddressZip(String communicationAddressZip) {
		this.communicationAddressZip = communicationAddressZip;
	}
	public String getCommunicationCountryId() {
		return communicationCountryId;
	}
	public void setCommunicationCountryId(String communicationCountryId) {
		this.communicationCountryId = communicationCountryId;
	}
	public String getCommunicationCountryName() {
		return communicationCountryName;
	}
	public void setCommunicationCountryName(String communicationCountryName) {
		this.communicationCountryName = communicationCountryName;
	}
	public String getCommunicationStateId() {
		return communicationStateId;
	}
	public void setCommunicationStateId(String communicationStateId) {
		this.communicationStateId = communicationStateId;
	}
	public String getCommunicationStateName() {
		return communicationStateName;
	}
	public void setCommunicationStateName(String communicationStateName) {
		this.communicationStateName = communicationStateName;
	}
	public String getPermanentCountryId() {
		return permanentCountryId;
	}
	public void setPermanentCountryId(String permanentCountryId) {
		this.permanentCountryId = permanentCountryId;
	}
	public String getPermanentCountryName() {
		return permanentCountryName;
	}
	public void setPermanentCountryName(String permanentCountryName) {
		this.permanentCountryName = permanentCountryName;
	}
	public String getPermanentStateId() {
		return permanentStateId;
	}
	public void setPermanentStateId(String permanentStateId) {
		this.permanentStateId = permanentStateId;
	}
	public String getPermanentStateName() {
		return permanentStateName;
	}
	public void setPermanentStateName(String permanentStateName) {
		this.permanentStateName = permanentStateName;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getCommunicationAddressStateOthers() {
		return communicationAddressStateOthers;
	}
	public void setCommunicationAddressStateOthers(String communicationAddressStateOthers) {
		this.communicationAddressStateOthers = communicationAddressStateOthers;
	}
	public String getPermanentAddressStateOthers() {
		return permanentAddressStateOthers;
	}
	public void setPermanentAddressStateOthers(String permanentAddressStateOthers) {
		this.permanentAddressStateOthers = permanentAddressStateOthers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public byte[] getEmpPhoto() {
		return empPhoto;
	}
	public void setEmpPhoto(byte[] empPhoto) {
		this.empPhoto = empPhoto;
	}
	public String getEmpImmigrationId() {
		return empImmigrationId;
	}
	public void setEmpImmigrationId(String empImmigrationId) {
		this.empImmigrationId = empImmigrationId;
	}
	public String getEmpWorkTimeId() {
		return empWorkTimeId;
	}
	public void setEmpWorkTimeId(String empWorkTimeId) {
		this.empWorkTimeId = empWorkTimeId;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getNationalityName() {
		return nationalityName;
	}
	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public boolean isSmoker() {
		return smoker;
	}
	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}
	public boolean isTempsmoker() {
		return tempsmoker;
	}
	public void setTempsmoker(boolean tempsmoker) {
		this.tempsmoker = tempsmoker;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}
	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}
	public String getLicenseExpDate() {
		return licenseExpDate;
	}
	public void setLicenseExpDate(String licenseExpDate) {
		this.licenseExpDate = licenseExpDate;
	}
	public String getMilitaryService() {
		return militaryService;
	}
	public void setMilitaryService(String militaryService) {
		this.militaryService = militaryService;
	}
	public String getEthinicRace() {
		return ethinicRace;
	}
	public void setEthinicRace(String ethinicRace) {
		this.ethinicRace = ethinicRace;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isPassport() {
		return passport;
	}
	public void setPassport(boolean passport) {
		this.passport = passport;
	}
	public String getCurrentAddressHomeTelephone1() {
		return currentAddressHomeTelephone1;
	}
	public void setCurrentAddressHomeTelephone1(String currentAddressHomeTelephone1) {
		this.currentAddressHomeTelephone1 = currentAddressHomeTelephone1;
	}
	public String getCurrentAddressHomeTelephone2() {
		return currentAddressHomeTelephone2;
	}
	public void setCurrentAddressHomeTelephone2(String currentAddressHomeTelephone2) {
		this.currentAddressHomeTelephone2 = currentAddressHomeTelephone2;
	}
	public String getCurrentAddressHomeTelephone3() {
		return currentAddressHomeTelephone3;
	}
	public void setCurrentAddressHomeTelephone3(String currentAddressHomeTelephone3) {
		this.currentAddressHomeTelephone3 = currentAddressHomeTelephone3;
	}
	public String getCurrentAddressWorkTelephone1() {
		return currentAddressWorkTelephone1;
	}
	public void setCurrentAddressWorkTelephone1(String currentAddressWorkTelephone1) {
		this.currentAddressWorkTelephone1 = currentAddressWorkTelephone1;
	}
	public String getCurrentAddressWorkTelephone2() {
		return currentAddressWorkTelephone2;
	}
	public void setCurrentAddressWorkTelephone2(String currentAddressWorkTelephone2) {
		this.currentAddressWorkTelephone2 = currentAddressWorkTelephone2;
	}
	public String getCurrentAddressWorkTelephone3() {
		return currentAddressWorkTelephone3;
	}
	public void setCurrentAddressWorkTelephone3(String currentAddressWorkTelephone3) {
		this.currentAddressWorkTelephone3 = currentAddressWorkTelephone3;
	}
	public String getPermanentAddressHomeTelephone1() {
		return permanentAddressHomeTelephone1;
	}
	public void setPermanentAddressHomeTelephone1(String permanentAddressHomeTelephone1) {
		this.permanentAddressHomeTelephone1 = permanentAddressHomeTelephone1;
	}
	public String getPermanentAddressHomeTelephone2() {
		return permanentAddressHomeTelephone2;
	}
	public void setPermanentAddressHomeTelephone2(String permanentAddressHomeTelephone2) {
		this.permanentAddressHomeTelephone2 = permanentAddressHomeTelephone2;
	}
	public String getPermanentAddressHomeTelephone3() {
		return permanentAddressHomeTelephone3;
	}
	public void setPermanentAddressHomeTelephone3(String permanentAddressHomeTelephone3) {
		this.permanentAddressHomeTelephone3 = permanentAddressHomeTelephone3;
	}
	public String getCurrentAddressMobile1() {
		return currentAddressMobile1;
	}
	public void setCurrentAddressMobile1(String currentAddressMobile1) {
		this.currentAddressMobile1 = currentAddressMobile1;
	}
	public String getCurrentAddressMobile2() {
		return currentAddressMobile2;
	}
	public void setCurrentAddressMobile2(String currentAddressMobile2) {
		this.currentAddressMobile2 = currentAddressMobile2;
	}
	public String getCurrentAddressMobile3() {
		return currentAddressMobile3;
	}
	public void setCurrentAddressMobile3(String currentAddressMobile3) {
		this.currentAddressMobile3 = currentAddressMobile3;
	}
	public String getPermanentAddressMobile1() {
		return permanentAddressMobile1;
	}
	public void setPermanentAddressMobile1(String permanentAddressMobile1) {
		this.permanentAddressMobile1 = permanentAddressMobile1;
	}
	public String getPermanentAddressMobile2() {
		return permanentAddressMobile2;
	}
	public void setPermanentAddressMobile2(String permanentAddressMobile2) {
		this.permanentAddressMobile2 = permanentAddressMobile2;
	}
	public String getPermanentAddressMobile3() {
		return permanentAddressMobile3;
	}
	public void setPermanentAddressMobile3(String permanentAddressMobile3) {
		this.permanentAddressMobile3 = permanentAddressMobile3;
	}
	public String getReportToId() {
		return reportToId;
	}
	public void setReportToId(String reportToId) {
		this.reportToId = reportToId;
	}
	public String getReportToName() {
		return reportToName;
	}
	public void setReportToName(String reportToName) {
		this.reportToName = reportToName;
	}
	public String getFinalAuthorityId() {
		return finalAuthorityId;
	}
	public void setFinalAuthorityId(String finalAuthorityId) {
		this.finalAuthorityId = finalAuthorityId;
	}
	public String getFinalAuthorityName() {
		return finalAuthorityName;
	}
	public void setFinalAuthorityName(String finalAuthorityName) {
		this.finalAuthorityName = finalAuthorityName;
	}
	public String getEmergencyContName() {
		return emergencyContName;
	}
	public void setEmergencyContName(String emergencyContName) {
		this.emergencyContName = emergencyContName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getEmergencyMobile1() {
		return emergencyMobile1;
	}
	public void setEmergencyMobile1(String emergencyMobile1) {
		this.emergencyMobile1 = emergencyMobile1;
	}
	public String getEmergencyMobile2() {
		return emergencyMobile2;
	}
	public void setEmergencyMobile2(String emergencyMobile2) {
		this.emergencyMobile2 = emergencyMobile2;
	}
	public String getEmergencyMobile() {
		return emergencyMobile;
	}
	public void setEmergencyMobile(String emergencyMobile) {
		this.emergencyMobile = emergencyMobile;
	}
	public String getEmergencyHomeTelephone1() {
		return emergencyHomeTelephone1;
	}
	public void setEmergencyHomeTelephone1(String emergencyHomeTelephone1) {
		this.emergencyHomeTelephone1 = emergencyHomeTelephone1;
	}
	public String getEmergencyHomeTelephone2() {
		return emergencyHomeTelephone2;
	}
	public void setEmergencyHomeTelephone2(String emergencyHomeTelephone2) {
		this.emergencyHomeTelephone2 = emergencyHomeTelephone2;
	}
	public String getEmergencyHomeTelephone() {
		return emergencyHomeTelephone;
	}
	public void setEmergencyHomeTelephone(String emergencyHomeTelephone) {
		this.emergencyHomeTelephone = emergencyHomeTelephone;
	}
	public String getEmergencyWorkTelephone1() {
		return emergencyWorkTelephone1;
	}
	public void setEmergencyWorkTelephone1(String emergencyWorkTelephone1) {
		this.emergencyWorkTelephone1 = emergencyWorkTelephone1;
	}
	public String getEmergencyWorkTelephone2() {
		return emergencyWorkTelephone2;
	}
	public void setEmergencyWorkTelephone2(String emergencyWorkTelephone2) {
		this.emergencyWorkTelephone2 = emergencyWorkTelephone2;
	}
	public String getEmergencyWorkTelephone() {
		return emergencyWorkTelephone;
	}
	public void setEmergencyWorkTelephone(String emergencyWorkTelephone) {
		this.emergencyWorkTelephone = emergencyWorkTelephone;
	}
	public String getWorkEmail() {
		return workEmail;
	}
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	public String getOtherEmail() {
		return otherEmail;
	}
	public void setOtherEmail(String otherEmail) {
		this.otherEmail = otherEmail;
	}
	public String getApprovalRemarks() {
		return approvalRemarks;
	}
	public void setApprovalRemarks(String approvalRemarks) {
		this.approvalRemarks = approvalRemarks;
	}
	public Employee getOriginalEmployee() {
		return originalEmployee;
	}
	public void setOriginalEmployee(Employee originalEmployee) {
		this.originalEmployee = originalEmployee;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getWorkLocationId() {
		return workLocationId;
	}
	public void setWorkLocationId(String workLocationId) {
		this.workLocationId = workLocationId;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getActiveDummy() {
		return activeDummy;
	}
	public void setActiveDummy(String activeDummy) {
		this.activeDummy = activeDummy;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDesignationId() {
		return designationId;
	}
	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}
	public String getFingerPrintId() {
		return fingerPrintId;
	}
	public void setFingerPrintId(String fingerPrintId) {
		this.fingerPrintId = fingerPrintId;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAddRemarks() {
		return isAddRemarks;
	}
	public void setAddRemarks(boolean isAddRemarks) {
		this.isAddRemarks = isAddRemarks;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isViewRemarks() {
		return isViewRemarks;
	}
	public void setViewRemarks(boolean isViewRemarks) {
		this.isViewRemarks = isViewRemarks;
	}
	public MultipartFile getEmpPhotoName() {
		return empPhotoName;
	}
	public void setEmpPhotoName(MultipartFile empPhotoName) {
		this.empPhotoName = empPhotoName;
	}
	public String getDummyCode() {
		return dummyCode;
	}
	public void setDummyCode(String dummyCode) {
		this.dummyCode = dummyCode;
	}
	public String getDummyFirstName() {
		return dummyFirstName;
	}
	public void setDummyFirstName(String dummyFirstName) {
		this.dummyFirstName = dummyFirstName;
	}
	public String getDummyDepartmentId() {
		return dummyDepartmentId;
	}
	public void setDummyDepartmentId(String dummyDepartmentId) {
		this.dummyDepartmentId = dummyDepartmentId;
	}
	public String getDummyDesignationId() {
		return dummyDesignationId;
	}
	public void setDummyDesignationId(String dummyDesignationId) {
		this.dummyDesignationId = dummyDesignationId;
	}
	public String getDummyFingerPrintId() {
		return dummyFingerPrintId;
	}
	public void setDummyFingerPrintId(String dummyFingerPrintId) {
		this.dummyFingerPrintId = dummyFingerPrintId;
	}
	public String getDummyUid() {
		return dummyUid;
	}
	public void setDummyUid(String dummyUid) {
		this.dummyUid = dummyUid;
	}
	public String getDummyDesignationName() {
		return dummyDesignationName;
	}
	public void setDummyDesignationName(String dummyDesignationName) {
		this.dummyDesignationName = dummyDesignationName;
	}
	public String getDummyDepartmentName() {
		return dummyDepartmentName;
	}
	public void setDummyDepartmentName(String dummyDepartmentName) {
		this.dummyDepartmentName = dummyDepartmentName;
	}
	public String getDummyMiddleName() {
		return dummyMiddleName;
	}
	public void setDummyMiddleName(String dummyMiddleName) {
		this.dummyMiddleName = dummyMiddleName;
	}
	public String getDummyLastName() {
		return dummyLastName;
	}
	public void setDummyLastName(String dummyLastName) {
		this.dummyLastName = dummyLastName;
	}
	public String getDummyNickName() {
		return dummyNickName;
	}
	public void setDummyNickName(String dummyNickName) {
		this.dummyNickName = dummyNickName;
	}
	public Boolean getIsTeachingStaff() {
		return isTeachingStaff;
	}
	public void setIsTeachingStaff(Boolean isTeachingStaff) {
		this.isTeachingStaff = isTeachingStaff;
	}
	public String getNewFirstName() {
		return newFirstName;
	}
	public void setNewFirstName(String newFirstName) {
		this.newFirstName = newFirstName;
	}
	public String getNewMiddleName() {
		return newMiddleName;
	}
	public void setNewMiddleName(String newMiddleName) {
		this.newMiddleName = newMiddleName;
	}
	public String getNewLastName() {
		return newLastName;
	}
	public void setNewLastName(String newLastName) {
		this.newLastName = newLastName;
	}
	public String getNewNickName() {
		return newNickName;
	}
	public void setNewNickName(String newNickName) {
		this.newNickName = newNickName;
	}
	public String getNewCode() {
		return newCode;
	}
	public void setNewCode(String newCode) {
		this.newCode = newCode;
	}
	public boolean isPhotoAvailable() {
		return photoAvailable;
	}
	public void setPhotoAvailable(boolean photoAvailable) {
		this.photoAvailable = photoAvailable;
	}
	public String getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPermanantBankStateId() {
		return permanantBankStateId;
	}
	public void setPermanantBankStateId(String permanantBankStateId) {
		this.permanantBankStateId = permanantBankStateId;
	}
	public String getPermanentAddressCountry() {
		return permanentAddressCountry;
	}
	public void setPermanentAddressCountry(String permanentAddressCountry) {
		this.permanentAddressCountry = permanentAddressCountry;
	}
	public String getCurrentBankStateId() {
		return currentBankStateId;
	}
	public void setCurrentBankStateId(String currentBankStateId) {
		this.currentBankStateId = currentBankStateId;
	}
	public String getPbankCCode() {
		return pbankCCode;
	}
	public void setPbankCCode(String pbankCCode) {
		this.pbankCCode = pbankCCode;
	}
	public String getCurrentCityCode() {
		return currentCityCode;
	}
	public void setCurrentCityCode(String currentCityCode) {
		this.currentCityCode = currentCityCode;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getChecked1() {
		return checked1;
	}
	public void setChecked1(String checked1) {
		this.checked1 = checked1;
	}
	public boolean isPhoto() {
		return isPhoto;
	}
	public void setPhoto(boolean isPhoto) {
		this.isPhoto = isPhoto;
	}
	public Boolean getIsPunchingExcemption() {
		return isPunchingExcemption;
	}
	public void setIsPunchingExcemption(Boolean isPunchingExcemption) {
		this.isPunchingExcemption = isPunchingExcemption;
	}
	public String getWorkLocationName() {
		return workLocationName;
	}
	public void setWorkLocationName(String workLocationName) {
		this.workLocationName = workLocationName;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getReservationCatagory() {
		return reservationCatagory;
	}
	public void setReservationCatagory(String reservationCatagory) {
		this.reservationCatagory = reservationCatagory;
	}
	public String getSmartCardNo() {
		return smartCardNo;
	}
	public void setSmartCardNo(String smartCardNo) {
		this.smartCardNo = smartCardNo;
	}
	public String getFourWheelerNo() {
		return fourWheelerNo;
	}
	public void setFourWheelerNo(String fourWheelerNo) {
		this.fourWheelerNo = fourWheelerNo;
	}
	public String getTwoWheelerNo() {
		return twoWheelerNo;
	}
	public void setTwoWheelerNo(String twoWheelerNo) {
		this.twoWheelerNo = twoWheelerNo;
	}
	public String getHomeTelephone() {
		return homeTelephone;
	}
	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}
	public String getWorkTelephone() {
		return workTelephone;
	}
	public void setWorkTelephone(String workTelephone) {
		this.workTelephone = workTelephone;
	}
	public String getRejoinDate() {
		return rejoinDate;
	}
	public void setRejoinDate(String rejoinDate) {
		this.rejoinDate = rejoinDate;
	}
	public String getRetirementDate() {
		return retirementDate;
	}
	public void setRetirementDate(String retirementDate) {
		this.retirementDate = retirementDate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubjectArea() {
		return subjectArea;
	}
	public void setSubjectArea(String subjectArea) {
		this.subjectArea = subjectArea;
	}
	public String getQualificationLevel() {
		return qualificationLevel;
	}
	public void setQualificationLevel(String qualificationLevel) {
		this.qualificationLevel = qualificationLevel;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getPassPortNo() {
		return passPortNo;
	}
	public void setPassPortNo(String passPortNo) {
		this.passPortNo = passPortNo;
	}
	public String getPassPortIssuedDate() {
		return passPortIssuedDate;
	}
	public void setPassPortIssuedDate(String passPortIssuedDate) {
		this.passPortIssuedDate = passPortIssuedDate;
	}
	public String getPassPortStatus() {
		return passPortStatus;
	}
	public void setPassPortStatus(String passPortStatus) {
		this.passPortStatus = passPortStatus;
	}
	public String getPassPortDOE() {
		return passPortDOE;
	}
	public void setPassPortDOE(String passPortDOE) {
		this.passPortDOE = passPortDOE;
	}
	public String getPassPortReviewComments() {
		return passPortReviewComments;
	}
	public void setPassPortReviewComments(String passPortReviewComments) {
		this.passPortReviewComments = passPortReviewComments;
	}
	public String getPassPortComments() {
		return passPortComments;
	}
	public void setPassPortComments(String passPortComments) {
		this.passPortComments = passPortComments;
	}
	public String getPassPortCItizenShip() {
		return passPortCItizenShip;
	}
	public void setPassPortCItizenShip(String passPortCItizenShip) {
		this.passPortCItizenShip = passPortCItizenShip;
	}
	public String getVisaNo() {
		return visaNo;
	}
	public void setVisaNo(String visaNo) {
		this.visaNo = visaNo;
	}
	public String getVisaIssuedDate() {
		return visaIssuedDate;
	}
	public void setVisaIssuedDate(String visaIssuedDate) {
		this.visaIssuedDate = visaIssuedDate;
	}
	public String getVisaStatus() {
		return visaStatus;
	}
	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}
	public String getVisaDoe() {
		return visaDoe;
	}
	public void setVisaDoe(String visaDoe) {
		this.visaDoe = visaDoe;
	}
	public String getVisaReviewComments() {
		return visaReviewComments;
	}
	public void setVisaReviewComments(String visaReviewComments) {
		this.visaReviewComments = visaReviewComments;
	}
	public String getVisaComments() {
		return visaComments;
	}
	public void setVisaComments(String visaComments) {
		this.visaComments = visaComments;
	}
	public String getVisaCitizenShip() {
		return visaCitizenShip;
	}
	public void setVisaCitizenShip(String visaCitizenShip) {
		this.visaCitizenShip = visaCitizenShip;
	}
	public String getDateOfLeaving() {
		return dateOfLeaving;
	}
	public void setDateOfLeaving(String dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}
	public String getDateOfResignation() {
		return dateOfResignation;
	}
	public void setDateOfResignation(String dateOfResignation) {
		this.dateOfResignation = dateOfResignation;
	}
	public String getReasonOfLeaving() {
		return reasonOfLeaving;
	}
	public void setReasonOfLeaving(String reasonOfLeaving) {
		this.reasonOfLeaving = reasonOfLeaving;
	}
	public String getTeachingStaff() {
		return teachingStaff;
	}
	public void setTeachingStaff(String teachingStaff) {
		this.teachingStaff = teachingStaff;
	}
	public String getTotalExpYears() {
		return totalExpYears;
	}
	public void setTotalExpYears(String totalExpYears) {
		this.totalExpYears = totalExpYears;
	}
	public String getTotalExpMonths() {
		return totalExpMonths;
	}
	public void setTotalExpMonths(String totalExpMonths) {
		this.totalExpMonths = totalExpMonths;
	}
	public String getRelevantExpYears() {
		return relevantExpYears;
	}
	public void setRelevantExpYears(String relevantExpYears) {
		this.relevantExpYears = relevantExpYears;
	}
	public String getRelevantExpMonths() {
		return relevantExpMonths;
	}
	public void setRelevantExpMonths(String relevantExpMonths) {
		this.relevantExpMonths = relevantExpMonths;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getApproverName() {
		return approverName;
	}
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
	public String getTotalTeachingExperience() {
		return totalTeachingExperience;
	}
	public void setTotalTeachingExperience(String totalTeachingExperience) {
		this.totalTeachingExperience = totalTeachingExperience;
	}
	public String getIndustryExperience() {
		return industryExperience;
	}
	public void setIndustryExperience(String industryExperience) {
		this.industryExperience = industryExperience;
	}
	public String getTotalExp() {
		return totalExp;
	}
	public void setTotalExp(String totalExp) {
		this.totalExp = totalExp;
	}
	public String getIndustryFunctionalArea() {
		return industryFunctionalArea;
	}
	public void setIndustryFunctionalArea(String industryFunctionalArea) {
		this.industryFunctionalArea = industryFunctionalArea;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getEligibilityTest() {
		return eligibilityTest;
	}
	public void setEligibilityTest(String eligibilityTest) {
		this.eligibilityTest = eligibilityTest;
	}
	public String getSubjectSpecilization() {
		return subjectSpecilization;
	}
	public void setSubjectSpecilization(String subjectSpecilization) {
		this.subjectSpecilization = subjectSpecilization;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Boolean getIsCurrentWorkingDates() {
		return isCurrentWorkingDates;
	}
	public void setIsCurrentWorkingDates(Boolean isCurrentWorkingDates) {
		this.isCurrentWorkingDates = isCurrentWorkingDates;
	}
	public String getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}
	public void setWorkingHoursPerWeek(String workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}
	public String getHonorariumPerHours() {
		return honorariumPerHours;
	}
	public void setHonorariumPerHours(String honorariumPerHours) {
		this.honorariumPerHours = honorariumPerHours;
	}
	public String getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	public byte[] getPhotoBytes() {
		return photoBytes;
	}
	public void setPhotoBytes(byte[] photoBytes) {
		this.photoBytes = photoBytes;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getCommuContryName() {
		return commuContryName;
	}
	public void setCommuContryName(String commuContryName) {
		this.commuContryName = commuContryName;
	}
	public String getCommuStateName() {
		return commuStateName;
	}
	public void setCommuStateName(String commuStateName) {
		this.commuStateName = commuStateName;
	}
	public String getEligibilityTestForOther() {
		return eligibilityTestForOther;
	}
	public void setEligibilityTestForOther(String eligibilityTestForOther) {
		this.eligibilityTestForOther = eligibilityTestForOther;
	}
	public String getNoOfPubNotReffered() {
		return noOfPubNotReffered;
	}
	public void setNoOfPubNotReffered(String noOfPubNotReffered) {
		this.noOfPubNotReffered = noOfPubNotReffered;
	}
	public String getNoOfPubReffered() {
		return noOfPubReffered;
	}
	public void setNoOfPubReffered(String noOfPubReffered) {
		this.noOfPubReffered = noOfPubReffered;
	}
	public String getBooks() {
		return books;
	}
	public void setBooks(String books) {
		this.books = books;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getBankIfscCode() {
		return bankIfscCode;
	}
	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}
	public String getCommunicationAddress() {
		return communicationAddress;
	}
	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	
	
}
