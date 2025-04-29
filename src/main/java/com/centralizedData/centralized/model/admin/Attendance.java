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
@Table(name = "attendance")
public class Attendance implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
	private Activity activity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "attendance_type_id")
	private AttendanceType attendanceType;
	
	@Column(name = "attendance_date")
	private Date attendanceDate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "hours_held")
	private Integer hoursHeld;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batch_id")
	private Batch batch;
	
	@Column(name = "is_canceled")
	private Boolean isCanceled;
	
	@Column(name = "is_activity_attendance")
	private Boolean isActivityAttendance;
	
	@Column(name = "is_monthly_attendance")
	private Boolean isMonthlyAttendance;
	
	@Column(name = "hours_held_monthly")
	private Integer hoursHeldMonthly;  
	
	@OneToMany(mappedBy = "attendance", cascade = CascadeType.ALL)
	private Set<AttendanceStudent> attendanceStudents = new HashSet<AttendanceStudent>(
			0);
	
	@OneToMany(mappedBy = "attendance", cascade = CascadeType.ALL)
	private Set<AttendanceClass> attendanceClasses = new HashSet<AttendanceClass>(
			0);
	
	@OneToMany(mappedBy = "attendance", cascade = CascadeType.ALL)
	private Set<AttendancePeriod> attendancePeriods = new HashSet<AttendancePeriod>(
			0);
	
	@OneToMany(mappedBy = "attendance", cascade = CascadeType.ALL)
	private Set<AttendanceInstructor> attendanceInstructors = new HashSet<AttendanceInstructor>(
			0);
	
	@Column(name = "slip_no")
	private String slipNo;
	
	@Column(name = "is_time_table")
	private Boolean isTimeTable;

}
