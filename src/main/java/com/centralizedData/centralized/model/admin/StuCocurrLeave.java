package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.LocalDate;
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
import javax.security.auth.Subject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stu_cocurr_leave")
public class StuCocurrLeave implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_schemewise_id")
	private ClassSchemewise classSchemewise;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cocurricular_leavetype_id")
	private Activity activity;
	
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
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "is_cocurr_leave_cancelled")
	private Boolean isCocurrLeaveCancelled;
	
	@Column(name = "approved_by_teacher")
	private Boolean approvedByTeacher;
	
	@Column(name = "cancelled_by_teacher")
	private Boolean cancelledByTeacher;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name = "approved_teacher_id")
	private String approverTeacher;
	
	@OneToMany(mappedBy = "stuCocurrLeave", cascade = CascadeType.ALL)
	private Set<StuCocurrLeaveDetails> stuCocurrLeaveDetailses = new HashSet<StuCocurrLeaveDetails>(
			0);
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "attendance_type_id")
	private AttendanceType attendanceType;

}
