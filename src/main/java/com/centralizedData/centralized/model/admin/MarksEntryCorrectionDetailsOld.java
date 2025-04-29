package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
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

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EXAM_marks_entry_correction_details_old")
public class MarksEntryCorrectionDetailsOld implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1838333619409735167L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "marks_entry_id")
	private MarksEntry marksEntry;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "overall_id")
	private StudentOverallInternalMarkDetails studentOverAllMark;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "int_final_mark_id")
	private StudentFinalMarkDetails studentFinalMark;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name="theory_marks")
	private String theoryMarks;
	
	@Column(name="practical_marks")
	private String practicalMarks;
	
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="previous_evaluator_theory_marks")
	private String previousEvaluatorTheoryMarks;
	
	@Column(name="previous_evaluator_practical_marks")
	private String previousEvaluatorPracticalMarks;
	
	@Column(name="is_mistake")
	private Boolean isMistake;
	
	@Column(name="is_retest")
	private Boolean isRetest;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	
	

}
