package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
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
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_subject_rule_settings")
public class SubjectRuleSettings implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1329327874727420464L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name="course_id")
	private Courses courses;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name="subject_id")
	private SubjectEntry subjectEntry;
	
	@Column(name="scheme_no")
	private Integer schemeNo;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@Column(name="select_best_of_theory_internal")
	private Integer selectBestOfTheoryInternal;
	
	@Column(name="final_theory_internal_is_sub_internal")
	private Boolean finalTheoryInternalIsSubInternal;
	
	@Column(name="final_theory_internal_is_attendance")
	private Boolean finalTheoryInternalIsAttendance;
	
	@Column(name="final_theory_internal_is_assignment")
	private Boolean finalTheoryInternalIsAssignment;
	
	@Column(name="final_theory_internal_minimum_mark")
	private BigDecimal finalTheoryInternalMinimumMark;
	
	@Column(name="final_theory_internal_entered_max_mark")
	private BigDecimal finalTheoryInternalEnteredMaxMark;
	
	@Column(name="final_theory_internal_maximum_mark")
	private BigDecimal finalTheoryInternalMaximumMark;
	
	@Column(name="select_best_of_practical_internal")
	private Integer selectBestOfPracticalInternal;
	
	@Column(name="final_practical_internal_is_sub_internal")
	private Boolean finalPracticalInternalIsSubInternal;
	
	@Column(name="final_practical_internal_is_attendance")
	private Boolean finalPracticalInternalIsAttendance;
	
	@Column(name="final_practical_internal_is_assignment")
	private Boolean finalPracticalInternalIsAssignment;
	
	@Column(name="final_practical_internal_minimum_mark")
	private BigDecimal finalPracticalInternalMinimumMark;
	
	@Column(name="final_practical_internal_entered_max_mark")
	private BigDecimal finalPracticalInternalEnteredMaxMark;
	
	@Column(name="final_practical_internal_maximum_mark")
	private BigDecimal finalPracticalInternalMaximumMark;
	
	@Column(name="theory_ese_is_regular")
	private Boolean theoryEseIsRegular;
	
	@Column(name="theory_ese_is_multiple_answer_script")
	private Boolean theoryEseIsMultipleAnswerScript;
	
	@Column(name="theory_ese_is_multiple_evaluator")
	private Boolean theoryEseIsMultipleEvaluator;
		
	@Column(name="theory_ese_minimum_mark")
	private BigDecimal theoryEseMinimumMark;
	
	@Column(name="theory_ese_entered_max_mark")
	private BigDecimal theoryEseEnteredMaxMark;
	
	@Column(name="theory_ese_maximum_mark")
	private BigDecimal theoryEseMaximumMark;
	
	@Column(name="theory_ese_theory_final_minimum_mark")
	private BigDecimal theoryEseTheoryFinalMinimumMark;
	
	@Column(name="theory_ese_theory_final_maximum_mark")
	private BigDecimal theoryEseTheoryFinalMaximumMark;
	
	@Column(name="practical_ese_is_regular")
	private Boolean practicalEseIsRegular;
	
	@Column(name="practical_ese_is_multiple_answer_script")
	private Boolean practicalEseIsMultipleAnswerScript;
	
	@Column(name="practical_ese_is_multiple_evaluator")
	private Boolean practicalEseIsMultipleEvaluator;
		
	@Column(name="practical_ese_minimum_mark")
	private BigDecimal practicalEseMinimumMark;
	
	@Column(name="practical_ese_entered_max_mark")
	private BigDecimal practicalEseEnteredMaxMark;
	
	@Column(name="practical_ese_maximum_mark")
	private BigDecimal practicalEseMaximumMark;
	
	@Column(name="practical_ese_theory_final_minimum_mark")
	private BigDecimal practicalEseTheoryFinalMinimumMark;
	
	@Column(name="practical_ese_theory_final_maximum_mark")
	private BigDecimal practicalEseTheoryFinalMaximumMark;
	
	@Column(name="subject_final_is_theory_exam")
	private Boolean subjectFinalIsTheoryExam;
	
	@Column(name="subject_final_is_practical_exam")
	private Boolean subjectFinalIsPracticalExam;
	
	@Column(name="subject_final_is_internal_exam")
	private Boolean subjectFinalIsInternalExam;
	
	@Column(name="subject_final_is_attendance")
	private Boolean subjectFinalIsAttendance;
	
	@Column(name="subject_final_minimum")
	private BigDecimal subjectFinalMinimum;
	
	@Column(name="subject_final_maximum")
	private BigDecimal subjectFinalMaximum;
	
	@Column(name="subject_final_valuated")
	private BigDecimal subjectFinalValuated;
		
	@Column(name="created_by")
	private String createdBy;
		
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
		
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="theory_int_min_marks_total")
	private BigDecimal theoryIntMinMarksTotal;
	
	@Column(name="theory_int_max_marks_total")
	private BigDecimal theoryIntMaxMarksTotal;
	
	@Column(name="theory_int_entry_max_marks_total")
	private BigDecimal theoryIntEntryMaxMarksTotal;
	
	@Column(name="practical_int_min_marks_total")
	private BigDecimal practicalIntMinMarksTotal;
	
	@Column(name="practical_int_max_marks_total")
	private BigDecimal practicalIntMaxMarksTotal;
	
	@Column(name="practical_int_entry_max_marks_total")
	private BigDecimal practicalIntEntryMaxMarksTotal;
		
	@Column(name="theory_is_supplementary")
	private Boolean theoryIsSupplementary;
	
	@Column(name="practical_is_supplementary")
	private Boolean practicalIsSupplementary;
	
	@Column(name="theory_supplementary_minMarks")
	private BigDecimal theorySupplementaryMinMarksTotal;
	
	@Column(name="theory_supplementary_maxMarks")
	private BigDecimal theorySupplementaryMaxMarksTotal;
	
	@Column(name="practical_supplementary_minMarks")
	private BigDecimal practicalSupplementaryMinMarksTotal;
	
	@Column(name="practical_supplementary_maxMarks")
	private BigDecimal practicalSupplementaryMaxMarksTotal;
	
	@OneToMany(mappedBy = "examSubjectRuleSettings", cascade = CascadeType.ALL)
	private Set<SubjectRuleSettingsMulAnsScript> examSubjectRuleSettingsMulAnsScripts = new HashSet<SubjectRuleSettingsMulAnsScript>(0);
	
	@OneToMany(mappedBy = "examSubjectRuleSettings", cascade = CascadeType.ALL)
	private Set<SubjectRuleSettingsSubInternal> examSubjectRuleSettingsSubInternals = new HashSet<SubjectRuleSettingsSubInternal>(0);
	
	@OneToMany(mappedBy = "examSubjectRuleSettings", cascade = CascadeType.ALL)
	private Set<SubjectRuleSettingsAttendance> examSubjectRuleSettingsAttendances = new HashSet<SubjectRuleSettingsAttendance>(0);
	
	@OneToMany(mappedBy = "examSubjectRuleSettings", cascade = CascadeType.ALL)
	private Set<SubjectRuleSettingsMulEvaluator> examSubjectRuleSettingsMulEvaluators = new HashSet<SubjectRuleSettingsMulEvaluator>(0);
	
	@OneToMany(mappedBy = "examSubjectRuleSettings", cascade = CascadeType.ALL)
	private Set<SubjectRuleSettingsAssignment> examSubjectRuleSettingsAssignments = new HashSet<SubjectRuleSettingsAssignment>(0);
	
	
	

}
