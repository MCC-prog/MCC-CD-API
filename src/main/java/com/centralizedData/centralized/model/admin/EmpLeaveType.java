package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_leave_type")
public class EmpLeaveType implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7122252256022892590L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
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
	
	@Column(name = "is_leave")
	private Boolean isLeave;
	
	@Column(name = "is_exemption")
	private Boolean isExemption;
	
	@OneToMany(mappedBy = "empLeaveType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpApplyLeave> empApplyLeaves = new HashSet<EmpApplyLeave>(0);
	
	@OneToMany(mappedBy = "empLeaveType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpLeaveAllotment> empLeaveAllot=new HashSet<EmpLeaveAllotment>(0);
	
	@OneToMany(mappedBy = "accumulateLeaveType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmployeeSettings> empSettings=new HashSet<EmployeeSettings>(0);
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "continuous_days")
	private Boolean continuousdays;
	
	@Column(name = "can_apply_online")
    private Boolean canapplyonline;

}
