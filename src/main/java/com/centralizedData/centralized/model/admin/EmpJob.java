package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp_job")
public class EmpJob implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "emp_leave_type_id")
//	private EmpAllowance empAllowance;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="job_specification")
	private String jobSpecification;
	
	@Column(name="employment_status")
	private String employmentStatus;
	
	@Column(name="job_duties")
	private String jobDuties;
	
	@Column(name="joining_date")
	private Date joiningDate;
	
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
	// private String EmployeeType;
	
	@Column(name="department_type")
	private String departmentType;
	
	@Column(name="date_of_retirement")
	private Date dateOfRetirement;
	
	@Column(name="basic_pay")
	private BigDecimal basicPay;
	
	@Column(name="gross_pay")
	private BigDecimal grossPay;
	
	
	@Column(name="date_of_resign")
	private Date dateOfResign;
	
	@Column(name="resignation_reason")
	private String resignationReason;
	
	@Column(name="date_of_leaving")
	private Date dateOfLeaving;
	
	@Column(name="financial_assisstance")
	private String financialAssisstance;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Employee_Type_Id")
	private EmployeeType objEmployeeTypeBO;
	
	
	@Column(name="date_of_rejoin")
	private Date dateOfRejoin;
	
	
	
	@OneToMany(mappedBy = "empJob", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpJobAllowance> empJobAllowances = new HashSet<EmpJobAllowance>(
			0);

}
