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

import com.centralizedData.centralized.model.employee.Employee;

@Entity
@Table(name="emp_acheivement")
public class EmpAcheivement  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5091311219534005518L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_online_resume_id")
	private EmpOnlineResume empOnlineResume;
	
	//private EmployeeInfoBO employeeInfoBO;
	@Column(name="acheivement_name")
	private String acheivementName;
	
	@Column(name="acheivement_level")
	private String acheivementLevel;
	
	@Column(name="details")
	private String details;
	
	@Column(name="status")
	private String status;
	
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
	
	@Column(name="award_or_achievement")
	private String awardOrAchievement;
	
	
	public EmpAcheivement() {
	}

	public EmpAcheivement(int id) {
		this.id = id;
	}

	public EmpAcheivement(int id, String acheivementName, String details,
			String status, String createdBy, Date createdDate,Employee employee,
			String modifiedBy, Date lastModifiedDate, Boolean isActive,EmpOnlineResume empOnlineResume) {
		this.id = id;
		this.employee = employee;
		this.acheivementName = acheivementName;
		this.details = details;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.isActive = isActive;
		this.empOnlineResume=empOnlineResume;
		
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcheivementName() {
		return this.acheivementName;
	}

	public void setAcheivementName(String acheivementName) {
		this.acheivementName = acheivementName;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setEmpOnlineResume(EmpOnlineResume empOnlineResume) {
		this.empOnlineResume = empOnlineResume;
	}

	public EmpOnlineResume getEmpOnlineResume() {
		return empOnlineResume;
	}

//	public EmployeeInfoBO getEmployeeInfoBO() {
//		return employeeInfoBO;
//	}
//
//	public void setEmployeeInfoBO(EmployeeInfoBO employeeInfoBO) {
//		this.employeeInfoBO = employeeInfoBO;
//	}

	@Override
	public boolean equals(Object obj) {
		EmpAcheivement acheivement=(EmpAcheivement)obj;
		boolean name=false;
		boolean details=false;
		if(this.acheivementName==null && acheivement.getAcheivementName()==null)
			name=true;
		else if(this.acheivementName!=null && acheivement.getAcheivementName()!=null){
			if(this.acheivementName.equalsIgnoreCase(acheivement.getAcheivementName()))
				name=true;
		}
		if(this.details==null && acheivement.getDetails()==null)
			details=true;
		else if(this.details!=null && acheivement.getDetails()!=null){
			if(this.details.equalsIgnoreCase(acheivement.getDetails()))
				details=true;
		}
		if(name && details && this.employee.getUid()==acheivement.getEmployee().getUid()){
			return true;
		}else
			return false;
	}

	public void setAcheivementLevel(String acheivementLevel) {
		this.acheivementLevel = acheivementLevel;
	}

	public String getAcheivementLevel() {
		return acheivementLevel;
	}

	public void setAwardOrAchievement(String awardOrAchievement) {
		this.awardOrAchievement = awardOrAchievement;
	}

	public String getAwardOrAchievement() {
		return awardOrAchievement;
	}	

}
