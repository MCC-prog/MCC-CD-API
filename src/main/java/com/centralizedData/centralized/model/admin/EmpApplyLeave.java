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

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_apply_leave")
public class EmpApplyLeave implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7840169412569249795L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_leave_type_id")
	private EmpLeaveType empLeaveType;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	
	@Column(name = "from_date")
	private Date fromDate;
	
	
	@Column(name = "to_date")
	private Date toDate;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "from_time")
	private String fromTime;
	
	@Column(name = "to_time")
	private String toTime;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "is_on_duty")
	private Boolean isOnDuty;
	
	@Column(name = "approval_remarks")
	private String approvalRemarks;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "applied_on")
	private Date appliedOn;
	
	@OneToMany(mappedBy = "empApplyLeave", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpApplyLeaveDates> empApplyLeaveDates = new HashSet<EmpApplyLeaveDates>(0);
	
	@Column(name = "no_of_days")
	private Double noOfDays;
	
	@Column(name = "cancel_reason")
	private String cancelReason;
	
	@Column(name = "cancel_remarks")
	private String cancelRemarks;
	
	@Column(name = "is_canceled")
	private Boolean isCanceled;
	
	@Column(name = "is_half_day")
	private Boolean isHalfDay;
	
	@Column(name = "is_am")
	private String isAm;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "is_exemption")
	private Boolean isExemption;
	
	@Column(name = "apply_through_online")
	private Boolean applyThroughOnline;

}
