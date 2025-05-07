package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@Table(name="internal_marks_entry_details")
public class InternalMarksEntryDetails implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "marks_entry_id")
	private InternalMarksEntry internalMarksEntry;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name="theory_marks")
	private String theoryMarks;
	
	@Column(name="practical_marks")
	private String practicalMarks;

	// For Secured Marks Entry Screen
	
	@Column(name="previous_evaluator_theory_marks")
	private String previousEvaluatorTheoryMarks;
	
	@Column(name="previous_evaluator_practical_marks")
	private String previousEvaluatorPracticalMarks;
	
	@Column(name="is_mistake")
	private Boolean isMistake;
	
	@Column(name="is_retest")
	private Boolean isRetest;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_theory_secured")
	private Boolean isTheorySecured;
	
	@Column(name="is_practical_secured")
	private Boolean isPracticalSecured;
	
	@Column(name="original_marks")
	private String originalMarks;
	
	@Column(name="graced_mark")
	private Boolean isGracing;

}

