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

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EXAM_exam_settings_course")
public class ExamSettingCourse implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="improvement")
	private String improvement;
	
	@Column(name="supplementary_Failed_Sub")
	private String supplementaryForFailedSubject;

	@Column(name="min_req_attendance_withoutfine")
	private BigDecimal minReqAttendanceWithoutFine;
	
	@Column(name="min_req_attendance_withfine")
	private BigDecimal minReqAttendanceWithFine;

	@Column(name="aggregate_pass_prcntg")
	private BigDecimal aggregatePass;
	
	@Column(name="individual_pass_prcntg")
	private BigDecimal individualPass;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courseId;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@OneToMany(mappedBy = "examSettingCourse", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<ExamSettingCourseRevaluation> examSettingCourseRevaluationSet= new HashSet<ExamSettingCourseRevaluation>(0);

}

