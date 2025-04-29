package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "EXAM_subject_rule_settings_mul_evaluator")
public class SubjectRuleSettingsMulEvaluator implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_rule_settings_id")
	private ExamSubjectRuleSettings examSubjectRuleSettings;
	
	@Column(name = "evaluator_id")
	private Integer evaluatorId;
	
	@Column(name = "no_of_evaluations")
	private Integer noOfEvaluations;
	
	@Column(name = "type_of_evaluation")
	private String typeOfEvaluation;
	
	@Column(name = "is_theory_practical")
	private Character isTheoryPractical;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "is_reviewer")
	private Boolean isReviewer;

}

