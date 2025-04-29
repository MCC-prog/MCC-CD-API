package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name="EXAM_internal_mark_supplementary_details")
public class ExamInternalMarkSupplementaryDetails implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="theory_total_sub_internal_mark")
	private String theoryTotalSubInternalMarks;
	
	@Column(name="theory_total_attendance_mark")
	private String theoryTotalAttendenceMarks;
	
	@Column(name="theory_total_assignment_mark")
	private String theoryTotalAssignmentMarks;
	
	@Column(name="practical_total_sub_internal_mark")
	private String practicalTotalSubInternalMarks;
	
	@Column(name="practical_total_attendance_mark")
	private String practicalTotalAttendenceMarks;
	
	@Column(name="practical_total_assignment_mark")
	private String practicalTotalAssignmentMarks;
	
	@Column(name="pass_or_fail")
	private String passOrFail;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="theory_total_mark")
	private String theoryTotalMarks;
	
	@Column(name="practical_total_mark")
	private String practicalTotalMarks;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examDefinition;

}
