package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="vba_student_fee_assignment")
public class VbaStudentFeeAssignment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6470470441851996831L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "virtual_bank_account_id")
	private VirtualBankAccount virtualBankAccount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vba_master_fee_assignment_id")
	private VbaMasterFeeAssignment vbaMasterFeeAssignment;
	
	@Column(name="fully_paid_date")
	private Date fullyPaidDate;
	
	@Column(name="fully_paid")
	private Boolean fullyPaid;
	
	@Column(name="amount_paid")
	private Double amountPaid;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	@OneToMany(mappedBy = "vbaStudentFeeAssignment", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<VbaStudentAdditionalFeeAssignment> addtnlFeeAssignmentSet = new HashSet<VbaStudentAdditionalFeeAssignment>();

}
