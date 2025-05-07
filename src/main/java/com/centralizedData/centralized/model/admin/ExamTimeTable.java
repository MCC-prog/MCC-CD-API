package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_time_table")
public class ExamTimeTable implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_course_scheme_id")
	private ExamExamCourseSchemeDetails examId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subjectId;
	
	@Column(name="date_starttime")
	private Date dateStarttime;
	
	@Column(name="date_endtime")
	private Date dateEndtime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_session_id")
	private ExaminationSessions examinationSessions;

}
