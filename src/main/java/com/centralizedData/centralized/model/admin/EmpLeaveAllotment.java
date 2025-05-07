package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_leave_allotment")
public class EmpLeaveAllotment implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -451931573130771114L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_type_id")
	private EmpType empType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "leave_type_id")
	private EmpLeaveType empLeaveType;
	
	@Column(name = "allotted_leave")
	private Integer allottedLeave;
	
	@Column(name = "initialization_required")
	private Boolean initRequired;
	
	@Column(name = "no_of_accumulated_leave")
	private Integer noOfAccumulatedLeave;
	
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "created_by")
	private String createdBy;;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "is_active")
	private Boolean isActive;

}
