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
@Table(name="emp_educational_details")
public class EmpEducationalDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2882178828025610634L;

	/**
	 * 
	 */
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="course")
	private String course;
	
	@Column(name="speciliazation")
	private String specialization;
	
	@Column(name="grade")
	private String grade;
	
	@Column(name="year_of_completion")
	private int yearOfCompletion;
	
	@Column(name="institute_university")
	private String institute;
	
	@Column(name="is_active")
	private boolean active;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_qualification_level_id")
	private QualificationLevel empQualificationLevel;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date modifiedDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	
	
	public EmpEducationalDetails(){
		
	}
	/**
	 * @param id
	 * @param course
	 * @param specialization
	 * @param grade
	 * @param yearOfCompletion
	 * @param institute
	 * @param active
	 * @param empQualificationLevel
	 * @param empOnlineResume
	 * @param createdBy
	 * @param createdDate
	 * @param modifiedBy
	 * @param modifiedDate
	 */
	//QualificationLevelBO empQualificationLevel,
	public EmpEducationalDetails(int id, String course, String specialization,
			String grade, int yearOfCompletion, String institute,
			boolean active, 
			EmpOnlineResume empOnlineResume, String createdBy,
			Date createdDate, String modifiedBy, Date modifiedDate, Employee employee) {
		super();
		this.id = id;
		this.course = course;
		this.specialization = specialization;
		this.grade = grade;
		this.yearOfCompletion = yearOfCompletion;
		this.institute = institute;
		this.active = active;
		//this.empQualificationLevel = empQualificationLevel;
		
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.employee=employee;
	}
	public int getId() {
		return id;
	}
	public String getCourse() {
		return course;
	}
	public String getSpecialization() {
		return specialization;
	}
	public String getGrade() {
		return grade;
	}
	public int getYearOfCompletion() {
		return yearOfCompletion;
	}
	public String getInstitute() {
		return institute;
	}
	public boolean isActive() {
		return active;
	}
//	public QualificationLevelBO getEmpQualificationLevel() {
//		return empQualificationLevel;
//	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setYearOfCompletion(int yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
//	public void setEmpQualificationLevel(QualificationLevelBO empQualificationLevel) {
//		this.empQualificationLevel = empQualificationLevel;
//	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public boolean equals(Object obj) {
		EmpEducationalDetails eduDetails=(EmpEducationalDetails)obj;
		boolean qualification=false;
		boolean course=false;
		boolean grade=false;
		boolean institute=false;
		boolean specialize=false;
//		if(this.empQualificationLevel==null && eduDetails.getEmpQualificationLevel()==null)
//			qualification=true;
//		else if(this.empQualificationLevel!=null && eduDetails.getEmpQualificationLevel()!=null){
//			if(this.empQualificationLevel.getId()==eduDetails.getEmpQualificationLevel().getId())
//				qualification=true;
//		}
		if(this.course==null && eduDetails.getCourse()==null)
			course=true;
		else if(this.course!=null && eduDetails.getCourse()!=null){
			if(this.course.equalsIgnoreCase(eduDetails.getCourse()))
				course=true;
		}
		if(this.grade==null && eduDetails.getGrade()==null)
			grade=true;
		else if(this.grade!=null && eduDetails.getGrade()!=null){
			if(this.grade.equalsIgnoreCase(eduDetails.getGrade()))
				grade=true;
		}
		if(this.institute==null && eduDetails.getInstitute()==null)
			institute=true;
		else if(this.institute!=null && eduDetails.getInstitute()!=null){
			if(this.institute.equalsIgnoreCase(eduDetails.getInstitute()))
				institute=true;
		}
		if(this.specialization==null && eduDetails.getSpecialization()==null)
			specialize=true;
		else if(this.specialization!=null && eduDetails.getSpecialization()!=null){
			if(this.specialization.equalsIgnoreCase(eduDetails.getSpecialization()))
				specialize=true;
		}
		if(qualification && course && grade && institute && specialize && this.yearOfCompletion==eduDetails.getYearOfCompletion() && this.employee.getUid()==eduDetails.getEmployee().getUid()){
			return true;
		}else
			return false;
	}
	public QualificationLevel getEmpQualificationLevel() {
		return empQualificationLevel;
	}
	public void setEmpQualificationLevel(QualificationLevel empQualificationLevel) {
		this.empQualificationLevel = empQualificationLevel;
	}
	
	
	
	
}
