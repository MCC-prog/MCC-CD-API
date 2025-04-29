package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="academic_holiday")
public class EmpAcademicHolidays implements Serializable{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_type")
	private EmployeeType  employeeTypeBO;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "academic_year_id")
	private AcademicYear academicYearBO;
	private int academicYear;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="holiday")
	private String holiday;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="created_date")
	private Date createdDate;
	
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	
	@Column(name="isActive")
	private Boolean isActive;
	
	@OneToMany(mappedBy = "empAcademicHolidays", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpAcademicHolidaysDates> empAcademicHolidaysDates = new HashSet<EmpAcademicHolidaysDates>(0);

}
