package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

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

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EXAM_student_final_old_mark_details")
public class StudentFinalOldMarkDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5708631206919666066L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition exam;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private Subject subject;
	
	@Column(name="subject_theory_mark")
	private String subjectTheoryMark;
	
	@Column(name="subject_practical_mark")
	private String subjectPracticalMark;
		
	@Column(name="student_theory_marks")
	private String studentTheoryMarks;
	
	@Column(name="student_practical_marks")
	private String studentPracticalMarks;
	
	@Column(name="pass_or_fail")
	private String passOrFail;
	
	@Column(name="previous_evaluator_theory_marks")
	private String previousEvaluatorTheoryMarks;
	
	@Column(name="previous_evaluator_practical_marks")
	private String previousEvaluatorPracticalMarks;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	

}
