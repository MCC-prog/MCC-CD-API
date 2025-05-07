package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
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

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EXAM_marks_entry_old_detained")
public class MarksEntryOldDetained implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7444504661818405500L;
	
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
	
	@Column(name="evaluator_type_id")
	private Integer evaluatorType;
	
	@Column(name="answer_script_type")
	private Integer answerScript;
		
	@Column(name="sequence_evaluator")
	private Integer sequenceEvaluator;
	
	@Column(name="marks_card_no")
	private String marksCardNo;
	
	@Column(name="marks_card_date")
	private LocalDate marksCardDate;
	
	@Column(name="mark_type")
	private String markType;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@OneToMany(mappedBy = "marksEntryOldDetained", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<MarksEntryDetailsOldDetained> marksDetails=new HashSet<MarksEntryDetailsOldDetained>();
}
