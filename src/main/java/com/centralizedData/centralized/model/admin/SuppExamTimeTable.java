package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EXAM_supp_time_table")
public class SuppExamTimeTable implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_course_scheme_id")
	private ExamExamCourseSchemeDetails courseSchemeDetails;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subjectId;
	
	@Column(name = "date_starttime")
	private Date dateStarttime;
	
	@Column(name = "date_endtime")
	private Date dateEndtime;
	
	@Column(name = "applied_year")
	private int appliedYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses course;
	
	@Column(name = "scheme")
	private Integer scheme;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_session_id")
	private ExaminationSessions examinationSessions;
	
	@Column(name = "is_active")
	private Boolean isActive;

}
