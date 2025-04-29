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
@Table(name="emp_dependents")
public class EmpDependents  implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5358343559779412652L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "created_by")
	private String createdBy;
	
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "dependent_name")
	private String dependentName;
	
	@Column(name = "dependent_relationship")
	private String dependentRelationship;
	
	@Column(name = "emp_dependant_dob")
	private Date dependantDOB;
	
	@Column(name = "child1_name")
	private String child1Name;
	
	@Column(name = "child2_name")
	private String child2Name;
	
	@Column(name = "child1_date_of_birth")
	private Date child1DateOfBirth;
	
	@Column(name = "child2_date_of_birth")
	private Date child2DateOfBirth;

}
