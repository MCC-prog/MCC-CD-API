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
@Table(name="emp_online_leave")
public class EmpOnlineLeave implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2516554226148617194L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_leave_type_id")
	private EmpLeaveType empLeaveType;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name="to_date")
	private Date toDate;
	
	@Column(name="reason")
	private String reason;
	
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
	
	@Column(name="no_of_days")
	private Double noOfDays;
	
	@Column(name="is_half_day")
	private Boolean isHalfDay;
	
	
	@Column(name="is_am")
	private String isAm;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="approved_date")
	private Date approvedDate;
	
	
	@Column(name="authorized_date")
	private Date authorizedDate;
	
	@Column(name="rejected_reason")
	private String rejectedReason;
	
	@Column(name="is_approved")
	private Boolean isApproved;
	
	
	@Column(name="approved_by")
	private String approvedBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "leave_approver")
	private Employee leaveApprover;
	
	@Column(name="authorized_by")
	private String authorizedBy;
	
	
	@Column(name="is_authorized")
	private Boolean isAuthorized;
	
	@Column(name="reference_number")
	private String referenceNumber;

}
