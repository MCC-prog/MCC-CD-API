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


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EXAM_sub_coursewise_attendance_marks")
public class ExamSubCoursewiseAttendanceMarks implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="attendance_marks")
	private BigDecimal attendanceMarks;
	
	@Column(name="from_prcntg_attndnc")
	private BigDecimal fromPrcntgAttndnc;
	
	@Column(name="to_prcntg_attndnc")
	private BigDecimal toPrcntgAttndnc;
	
	@Column(name="course_id")
	private Long courseId;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subjectUtilBO;

	public ExamSubCoursewiseAttendanceMarks(BigDecimal attendanceMarks, BigDecimal fromPrcntgAttndnc,
			BigDecimal toPrcntgAttndnc, Long courseId, SubjectEntry subjectUtilBO) {
		super();
		this.attendanceMarks = attendanceMarks;
		this.fromPrcntgAttndnc = fromPrcntgAttndnc;
		this.toPrcntgAttndnc = toPrcntgAttndnc;
		this.courseId = courseId;
		this.subjectUtilBO = subjectUtilBO;
	}
	
	
	
}

