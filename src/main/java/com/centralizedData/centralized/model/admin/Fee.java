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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fee")
public class Fee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType programType;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
	private Program program;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses course;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_group_id")
	private FeeGroup feeGroup;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="semester_no")
	private Integer semesterNo;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="aided_unaided")
	private String aidedUnaided;
	
//	@OneToMany(mappedBy = "empJob", cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<FeePayment> feePayments = new HashSet<FeePayment>(0);
	
	@OneToMany(mappedBy = "fee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeDues> feeDueses = new HashSet<FeeDues>(0);
	
	@OneToMany(mappedBy = "fee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeAccountAssignment> feeAccountAssignments = new HashSet<FeeAccountAssignment>(
			0);
	
	@OneToMany(mappedBy = "fee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeTransaction> feeTransactions = new HashSet<FeeTransaction>(0);
	
	@OneToMany(mappedBy = "fee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeDetails> feeDetailses = new HashSet<FeeDetails>(0);
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "employee_id")
//	private FeeDivision feeDivision;
//	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "employee_id")
//	private SubjectGroup subjectGroup;
//	
	@Column(name="section")
	private String section;

}
