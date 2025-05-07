package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.centralizedData.centralized.model.employee.Employee;
@Entity
@Table(name="emp_qualification_level")
public class EmpQualificationLevel implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 5102953012963869454L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
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
	
	@Column(name="display_order")
	private int displayOrder;
	
	@Column(name="fixed_display")
	private boolean fixedDisplay;
	
	@Column(name="phd_qualification")
	private boolean phdQualification;
	
	
	
//	private Set<Employee> employee =new HashSet<Employee>(0);
//	private Set<GuestFaculty> guestFaculty =new HashSet<GuestFaculty>(0);
//	private Set<EmpOnlineResume> empOnlineResumes = new HashSet<EmpOnlineResume>(
//			0);
//	private Set<EmpEducationMaster> empEducationMasters = new HashSet<EmpEducationMaster>(
//			0);

	public EmpQualificationLevel() {
	}

	public EmpQualificationLevel(int id) {
		this.id = id;
	}

	public EmpQualificationLevel(int id, String name, String createdBy,
			Date createdDate, String modifiedBy, Date lastModifiedDate,
			Boolean isActive, Set<EmpOnlineResume> empOnlineResumes, Set<GuestFaculty> guestFaculty,
			Set<EmpEducationMaster> empEducationMasters,int displayOrder, boolean fixedDisplay,boolean phdQualification,Set<Employee> employee) {
		this.id = id;
		this.name = name;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.isActive = isActive;
//		this.empOnlineResumes = empOnlineResumes;
//		this.empEducationMasters = empEducationMasters;
		this.displayOrder=displayOrder;
		this.fixedDisplay=fixedDisplay;
		this.phdQualification=phdQualification;
//		this.employee=employee;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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
//	public Set<EmpEducationMaster> getEmpEducationMasters() {
//		return this.empEducationMasters;
//	}

//	public void setEmpEducationMasters(
//			Set<EmpEducationMaster> empEducationMasters) {
//		this.empEducationMasters = empEducationMasters;
//	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public boolean isFixedDisplay() {
		return fixedDisplay;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFixedDisplay(boolean fixedDisplay) {
		this.fixedDisplay = fixedDisplay;
	}

	public boolean isPhdQualification() {
		return phdQualification;
	}

	public void setPhdQualification(boolean phdQualification) {
		this.phdQualification = phdQualification;
	}

//	public Set<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Set<Employee> employee) {
//		this.employee = employee;
//	}
//
//	public Set<GuestFaculty> getGuestFaculty() {
//		return guestFaculty;
//	}
//
//	public void setGuestFaculty(Set<GuestFaculty> guestFaculty) {
//		this.guestFaculty = guestFaculty;
//	}



}
