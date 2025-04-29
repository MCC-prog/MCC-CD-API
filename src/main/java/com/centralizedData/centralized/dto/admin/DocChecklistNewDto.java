package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

public class DocChecklistNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3080473686807715872L;
	
	private Long id;
	//private Courses courses;
	private Integer year;
	//private Program program;
	//private DocType docType; 
	private Long docTypeId;
	
	private Boolean isConsolidatedMarks;
	private Boolean needToProduce;
	private Boolean isDocSelected;
	private Boolean isSemesterWise;
	private Boolean isMarksCard;
	private Boolean isPreviousExam;
	//private Weightage weightage_id;
	private Double weightagePercentage;
	private Boolean isIncludeLanguage;
	private Boolean isExamReq;
	private Boolean needToProduceSemwiseMc;
	
	
	public Long getDocTypeId() {
		return docTypeId;
	}
	public void setDocTypeId(Long docTypeId) {
		this.docTypeId = docTypeId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public Boolean getIsMarksCard() {
		return isMarksCard;
	}
	public void setIsMarksCard(Boolean isMarksCard) {
		this.isMarksCard = isMarksCard;
	}
	public Boolean getIsConsolidatedMarks() {
		return isConsolidatedMarks;
	}
	public void setIsConsolidatedMarks(Boolean isConsolidatedMarks) {
		this.isConsolidatedMarks = isConsolidatedMarks;
	}
	public Boolean getNeedToProduce() {
		return needToProduce;
	}
	public void setNeedToProduce(Boolean needToProduce) {
		this.needToProduce = needToProduce;
	}
	public Boolean getIsDocSelected() {
		return isDocSelected;
	}
	public void setIsDocSelected(Boolean isDocSelected) {
		this.isDocSelected = isDocSelected;
	}
	public Boolean getIsSemesterWise() {
		return isSemesterWise;
	}
	public void setIsSemesterWise(Boolean isSemesterWise) {
		this.isSemesterWise = isSemesterWise;
	}
	public Boolean getIsPreviousExam() {
		return isPreviousExam;
	}
	public void setIsPreviousExam(Boolean isPreviousExam) {
		this.isPreviousExam = isPreviousExam;
	}

	public Double getWeightagePercentage() {
		return weightagePercentage;
	}
	public void setWeightagePercentage(Double weightagePercentage) {
		this.weightagePercentage = weightagePercentage;
	}
	public Boolean getIsIncludeLanguage() {
		return isIncludeLanguage;
	}
	public void setIsIncludeLanguage(Boolean isIncludeLanguage) {
		this.isIncludeLanguage = isIncludeLanguage;
	}
	public Boolean getIsExamReq() {
		return isExamReq;
	}
	public void setIsExamReq(Boolean isExamReq) {
		this.isExamReq = isExamReq;
	}
	public Boolean getNeedToProduceSemwiseMc() {
		return needToProduceSemwiseMc;
	}
	public void setNeedToProduceSemwiseMc(Boolean needToProduceSemwiseMc) {
		this.needToProduceSemwiseMc = needToProduceSemwiseMc;
	}
	
	

}
