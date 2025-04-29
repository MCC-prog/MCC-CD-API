package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_revaluation_details")
public class ExamRevaluationDetails implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -3164127386649122479L;
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_revaluation_id")
	private ExamRevaluation examRevaluation;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name = "previous_theory_marks")
	private BigDecimal previousTheoryMarks;
	
	@Column(name = "previous_practical_marks")
	private BigDecimal previousPracticalMarks;
	
	@Column(name = "current_theory_marks")
	private BigDecimal currentTheoryMarks;
	
	@Column(name = "current_practical_marks")
	private BigDecimal currentPracticalMarks;
	
	@Column(name = "revaluation_type_name")
	private String revaluationTypeName;	
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

}
