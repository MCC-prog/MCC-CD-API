package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;



public class StudentNewDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5960683619868467610L;
	
	private Long id;
//	private AdmAppln admAppln;
	private String secondLanguage;
	private String StudentName;
	private String ClassName;
	private Map<String, List<SubjectDto>> subjectsMap;
	//private Map<String,PreviousClassDetailsDto> studentHistoryMap;
	//private List<PreviousClassDetailsDto> previousDetailsList;
	private boolean previousHistoryAvailable;
	
	private Long admApplnId;
	private String createdBy;
	private Instant createdDate;
	private String modified_by;
	private Instant lastModifiedDate;	
	private Boolean isActive;
	private Boolean isAdmitted;
	private String rollNo;
	private String registerNo;
	private Boolean isCurrent;
	private Boolean isExamEligible;
//	private ClassSchemewise classSchemewise;
	private Long classSchemewiseId;
	private Integer programTypeSlNo;
	private String examRegisterNo;
	private String studentNo;
	private String tcNo;	
	private String mcNo;	
	private LocalDate tcDate;	
	private String tcSlNo;	
	private String bankAccNo;	
	private String tcType;	
	private Boolean isHide;		
	private LocalDate  hideDate;
	private String hideReason;
	private Boolean proforma;
	private String pucCollegeCode;
	private String yearOfPass;
	private String smartCardNo;
	private Boolean isScDataGenerated;
	private Boolean isScDataDelivered;
	private String admissionNo;
	private Integer admission_month;
	
	
	
	public String getSecondLanguage() {
		return secondLanguage;
	}
	public void setSecondLanguage(String secondLanguage) {
		this.secondLanguage = secondLanguage;
	}
//	public List<PreviousClassDetailsDto> getPreviousDetailsList() {
//		return previousDetailsList;
//	}
//	public void setPreviousDetailsList(List<PreviousClassDetailsDto> previousDetailsList) {
//		this.previousDetailsList = previousDetailsList;
//	}
	public boolean isPreviousHistoryAvailable() {
		return previousHistoryAvailable;
	}
	public void setPreviousHistoryAvailable(boolean previousHistoryAvailable) {
		this.previousHistoryAvailable = previousHistoryAvailable;
	}
//	public Map<String, PreviousClassDetailsDto> getStudentHistoryMap() {
//		return studentHistoryMap;
//	}
//	public void setStudentHistoryMap(Map<String, PreviousClassDetailsDto> studentHistoryMap) {
//		this.studentHistoryMap = studentHistoryMap;
//	}
	public Map<String, List<SubjectDto>> getSubjectsMap() {
		return subjectsMap;
	}
	public void setSubjectsMap(Map<String, List<SubjectDto>> subjectsMap) {
		this.subjectsMap = subjectsMap;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public Long getAdmApplnId() {
		return admApplnId;
	}
	public void setAdmApplnId(Long admApplnId) {
		this.admApplnId = admApplnId;
	}
	public Long getClassSchemewiseId() {
		return classSchemewiseId;
	}
	public void setClassSchemewiseId(Long classSchemewiseId) {
		this.classSchemewiseId = classSchemewiseId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public AdmAppln getAdmAppln() {
//		return admAppln;
//	}
//	public void setAdmAppln(AdmAppln admAppln) {
//		this.admAppln = admAppln;
//	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Instant getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Boolean getIsAdmitted() {
		return isAdmitted;
	}
	public void setIsAdmitted(Boolean isAdmitted) {
		this.isAdmitted = isAdmitted;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
	public Boolean getIsCurrent() {
		return isCurrent;
	}
	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
	public Boolean getIsExamEligible() {
		return isExamEligible;
	}
	public void setIsExamEligible(Boolean isExamEligible) {
		this.isExamEligible = isExamEligible;
	}
//	public ClassSchemewise getClassSchemewise() {
//		return classSchemewise;
//	}
//	public void setClassSchemewise(ClassSchemewise classSchemewise) {
//		this.classSchemewise = classSchemewise;
//	}
	public Integer getProgramTypeSlNo() {
		return programTypeSlNo;
	}
	public void setProgramTypeSlNo(Integer programTypeSlNo) {
		this.programTypeSlNo = programTypeSlNo;
	}
	public String getExamRegisterNo() {
		return examRegisterNo;
	}
	public void setExamRegisterNo(String examRegisterNo) {
		this.examRegisterNo = examRegisterNo;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getMcNo() {
		return mcNo;
	}
	public void setMcNo(String mcNo) {
		this.mcNo = mcNo;
	}
	public LocalDate getTcDate() {
		return tcDate;
	}
	public void setTcDate(LocalDate tcDate) {
		this.tcDate = tcDate;
	}
	public String getTcSlNo() {
		return tcSlNo;
	}
	public void setTcSlNo(String tcSlNo) {
		this.tcSlNo = tcSlNo;
	}
	public String getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public String getTcType() {
		return tcType;
	}
	public void setTcType(String tcType) {
		this.tcType = tcType;
	}
	public Boolean getIsHide() {
		return isHide;
	}
	public void setIsHide(Boolean isHide) {
		this.isHide = isHide;
	}
	public LocalDate getHideDate() {
		return hideDate;
	}
	public void setHideDate(LocalDate hideDate) {
		this.hideDate = hideDate;
	}
	public String getHideReason() {
		return hideReason;
	}
	public void setHideReason(String hideReason) {
		this.hideReason = hideReason;
	}
	public Boolean getProforma() {
		return proforma;
	}
	public void setProforma(Boolean proforma) {
		this.proforma = proforma;
	}
	public String getPucCollegeCode() {
		return pucCollegeCode;
	}
	public void setPucCollegeCode(String pucCollegeCode) {
		this.pucCollegeCode = pucCollegeCode;
	}
	public String getYearOfPass() {
		return yearOfPass;
	}
	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}
	public String getSmartCardNo() {
		return smartCardNo;
	}
	public void setSmartCardNo(String smartCardNo) {
		this.smartCardNo = smartCardNo;
	}
	public Boolean getIsScDataGenerated() {
		return isScDataGenerated;
	}
	public void setIsScDataGenerated(Boolean isScDataGenerated) {
		this.isScDataGenerated = isScDataGenerated;
	}
	public Boolean getIsScDataDelivered() {
		return isScDataDelivered;
	}
	public void setIsScDataDelivered(Boolean isScDataDelivered) {
		this.isScDataDelivered = isScDataDelivered;
	}
	public String getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}
	public Integer getAdmission_month() {
		return admission_month;
	}
	public void setAdmission_month(Integer admission_month) {
		this.admission_month = admission_month;
	}
	
	

}
