package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="emp_education_master")
public class EmpEducationMaster implements Serializable {
	


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6592098425897958837L;


	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_qualification_level_id")
	private EmpQualificationLevel empQualificationLevel;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	
//	private Set<EmpOnlineResume> empOnlineResumes = new HashSet<EmpOnlineResume>(
//			0);
//	private Set<EmpEducation> empEducations = new HashSet<EmpEducation>(0);
//	public EmpEducationMaster() {
//	}

	public EmpEducationMaster(int id) {
		this.id = id;
	}

	public EmpEducationMaster(int id,
			EmpQualificationLevel empQualificationLevel, String name,
			String createdBy, Date createdDate, String modifiedBy,
			Date lastModifiedDate, Boolean isActive,
			Set<EmpOnlineResume> empOnlineResumes, Set<EmpEducation> empEducations) {
		this.id = id;
		this.empQualificationLevel = empQualificationLevel;
		this.name = name;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.isActive = isActive;
//		this.empOnlineResumes = empOnlineResumes;
//		this.empEducations = empEducations;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EmpQualificationLevel getEmpQualificationLevel() {
		return this.empQualificationLevel;
	}

	public void setEmpQualificationLevel(
			EmpQualificationLevel empQualificationLevel) {
		this.empQualificationLevel = empQualificationLevel;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

//	public Set<EmpOnlineResume> getEmpOnlineResumes() {
//		return this.empOnlineResumes;
//	}
//
//	public void setEmpOnlineResumes(Set<EmpOnlineResume> empOnlineResumes) {
//		this.empOnlineResumes = empOnlineResumes;
//	}
//
//	public Set<EmpEducation> getEmpEducations() {
//		return empEducations;
//	}
//
//	public void setEmpEducations(Set<EmpEducation> empEducations) {
//		this.empEducations = empEducations;
//	}



}
