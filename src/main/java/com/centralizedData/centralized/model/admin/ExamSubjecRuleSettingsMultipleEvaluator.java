package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Getter
@Setter
@Table(name="EXAM_subject_rule_settings_mul_evaluator")
public class ExamSubjecRuleSettingsMultipleEvaluator implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	//private int subjectRuleSettingsId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluator_id")
	private Employee evaluatorId;
	
	@Column(name="no_of_evaluations")
	private Integer noOfEvaluations;
	
	@Column(name="type_of_evaluation")
	private String typeOfEvaluation;
	
	@Column(name="is_theory_practical")
	private String isTheoryPractical;
	
	
//	private EmployeeUtilBO employeeUtilBO;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_rule_settings_id")
	private ExamSubjectRuleSettings examSubjectRuleSettingsBO;

}

