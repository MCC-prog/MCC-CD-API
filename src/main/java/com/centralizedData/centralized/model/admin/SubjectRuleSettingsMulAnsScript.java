package com.centralizedData.centralized.model.admin;

import java.math.BigDecimal;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EXAM_subject_rule_settings_mul_ans_script")
public class SubjectRuleSettingsMulAnsScript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_rule_settings_id")
	private ExamSubjectRuleSettings examSubjectRuleSettings;
	
	@Column(name = "multiple_answer_script_id")
	private Integer multipleAnswerScriptId;
	
	@Column(name = "value")
	private BigDecimal value;
	
	@Column(name = "is_theory_practical")
	private Character isTheoryPractical;
	
	@Column(name = "is_active")
	private Boolean isActive;

}
