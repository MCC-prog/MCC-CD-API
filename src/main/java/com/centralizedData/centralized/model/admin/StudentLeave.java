package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_leave")
public class StudentLeave implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "leave_type_id")
	private LeaveType leaveType;
	
	@Column(name = "created_by")
	private String createdBy;;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "start_period")
	private Period startPeriod;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "end_period")
	private Period endPeriod;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "first_approved")
	private Boolean firstApproved;
	
	@Column(name = "second_approved")
	private Boolean secondApproved;
	
	@Column(name = "leave_canceled")
	private Boolean leaveCanceled;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_schemewise_id")
	private ClassSchemewise classSchemewise;
	
	
	@OneToMany(mappedBy = "studentLeave", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<StudentLeaveDetails> studentLeaveDetails = new HashSet<StudentLeaveDetails>(
			0);
}
