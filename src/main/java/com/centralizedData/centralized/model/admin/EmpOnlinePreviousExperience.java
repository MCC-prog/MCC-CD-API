package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="emp_online_previous_experience")
public class EmpOnlinePreviousExperience implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="emp_org_name")
	private String empOrganization;
	
	@Column(name="emp_designation")
	private String empDesignation;
	
	@Column(name="exp_years")
	private int expYears;
	
	@Column(name="exp_months")
	private int expMonths;
	
	@Column(name="is_teaching_experience")
	private boolean teachingExperience;
	
	@Column(name="is_industry_experience")
	private boolean industryExperience;
	
	@Column(name="is_active")
	private boolean active;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="last_modified_date")
	private Date modifiedDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="to_date")
	private Date toDate;
	
	@Column(name="from_date")
	private Date fromDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_online_resume_id")
	private EmpOnlineResume empOnlineResume;
	
	@Column(name="gross_salary")
	private String grossSalary;
	
	
	
	
	public EmpOnlinePreviousExperience(){
		
	}
	
	/**
	 * @param id
	 * @param empOrganization
	 * @param empDesignation
	 * @param expYears
	 * @param expMonths
	 * @param teachingExperience
	 * @param industryExperience
	 * @param active
	 * @param createdDate
	 * @param createdBy
	 * @param modifiedDate
	 * @param modifiedBy
	 * @param empOnlineResume
	 */
	public EmpOnlinePreviousExperience(int id, String empOrganization,
			String empDesignation, int expYears, int expMonths,
			boolean teachingExperience, boolean industryExperience,
			boolean active, Date createdDate, String createdBy,
			Date modifiedDate, String modifiedBy,
			EmpOnlineResume empOnlineResume, String grossSalary, Date toDate, Date fromDate) {
		super();
		this.id = id;
		this.grossSalary= grossSalary;
		this.toDate=toDate;
		this.fromDate= fromDate;
		this.empOrganization = empOrganization;
		this.empDesignation = empDesignation;
		this.expYears = expYears;
		this.expMonths = expMonths;
		this.teachingExperience = teachingExperience;
		this.industryExperience = industryExperience;
		this.active = active;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.empOnlineResume = empOnlineResume;
	}

	public int getId() {
		return id;
	}

	public String getEmpOrganization() {
		return empOrganization;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public int getExpYears() {
		return expYears;
	}

	public int getExpMonths() {
		return expMonths;
	}

	public boolean isTeachingExperience() {
		return teachingExperience;
	}

	public boolean isIndustryExperience() {
		return industryExperience;
	}

	public boolean isActive() {
		return active;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public EmpOnlineResume getEmpOnlineResume() {
		return empOnlineResume;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmpOrganization(String empOrganization) {
		this.empOrganization = empOrganization;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}

	public void setExpMonths(int expMonths) {
		this.expMonths = expMonths;
	}

	public void setTeachingExperience(boolean teachingExperience) {
		this.teachingExperience = teachingExperience;
	}

	public void setIndustryExperience(boolean industryExperience) {
		this.industryExperience = industryExperience;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public void setEmpOnlineResume(EmpOnlineResume empOnlineResume) {
		this.empOnlineResume = empOnlineResume;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(String grossSalary) {
		this.grossSalary = grossSalary;
	}

	

	
}
