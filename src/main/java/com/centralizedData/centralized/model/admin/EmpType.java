package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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
@Table(name = "emp_type")
public class EmpType implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1328962038853918887L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name="employee_id")
//	private Employee employee;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "time_in")
	private String timeIn;
	
	@Column(name = "time_in_ends")
	private String timeInEnds;
	
	@Column(name = "time_out")
	private String timeOut;
	
	@Column(name = "saturday_time_out")
	private String saturdayTimeOut;
	
	@Column(name = "half_day_start_time")
	private String halfDayStartTime;
	
	@Column(name = "half_day_end_time")
	private String halfDatyEndTime;
	
	@Column(name = "leave_initialize_month")
	private String leaveInitializeMonth;
	
	@Column(name = "is_Active")
	private Boolean isActive;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_by")
	private String lastModifiedBy;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@OneToMany(mappedBy = "empType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpLeaveAllotment> empLeaveAllot=new HashSet<EmpLeaveAllotment>(0);

}
