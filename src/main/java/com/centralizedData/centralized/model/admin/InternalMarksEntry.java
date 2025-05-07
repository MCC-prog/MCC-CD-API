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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="internal_marks_entry")
public class InternalMarksEntry implements Serializable{
	
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition exam;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name="evaluator_type_id")
	private Integer evaluatorType;
	
	@Column(name="marks_card_no")
	private String marksCardNo;
	
	@Column(name="marks_card_date")
	private Date marksCardDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="answer_script_type")
	private Integer answerScript;
	
	@Column(name="sequence_evaluator")
	private Integer sequenceEvaluator;
	
	@Column(name="mark_type")
	private String markType;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@OneToMany(mappedBy = "internalMarksEntry", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<InternalMarksEntryDetails> internalMarksDetails=new HashSet<InternalMarksEntryDetails>();

}

