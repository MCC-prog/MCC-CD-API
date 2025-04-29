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
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_specialization_subject_group")
public class ExamSpecializationSubjectGroup implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;

	@Column(name="academic_year")
	private Integer academicYear;

	@Column(name="scheme_no")
	private Integer schemeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses examCourseUtilBO;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "specialization_id")
	private ExamSpecialization examSpecializationBO;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_group_id")
	private SubjectGroup subjectGroupId;

	@Column(name="created_by")
	private String createdBy;;

	@Column(name="created_date")
	private Date createdDate;





}

