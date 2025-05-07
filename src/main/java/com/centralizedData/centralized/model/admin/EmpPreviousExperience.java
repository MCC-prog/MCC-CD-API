package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="emp_previous_experience")
public class EmpPreviousExperience implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1849014998449927891L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "emp_org_name")
	private String empOrganization;
	
	@Column(name = "emp_designation")
	private String empDesignation;
	
	@Column(name = "exp_years")
	private int expYears;
	
	@Column(name = "exp_months")
	private int expMonths;
	
	@Column(name = "is_teaching_experience")
	private boolean teachingExperience;
	
	@Column(name = "is_industry_experience")
	private boolean industryExperience;
	
	@Column(name = "is_active")
	private boolean active;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	
	@Column(name = "created_by")
	private String createdBy;
	
	
	@Column(name = "last_modified_date")
	private Date modifiedDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	
	@Column(name = "to_date")
	private Date toDate;
	
	
	@Column(name = "from_date")
	private Date fromDate;
}
