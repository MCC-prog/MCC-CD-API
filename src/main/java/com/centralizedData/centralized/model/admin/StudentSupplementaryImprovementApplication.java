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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_supplementary_improvement_application")
public class StudentSupplementaryImprovementApplication implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -8273570921502240342L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST,  fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@ManyToOne(cascade = CascadeType.PERSIST,  fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.PERSIST,  fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,  fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name="is_supplementary")
	private Boolean isSupplementary;
	
	@Column(name="is_improvement")
	private Boolean isImprovement;
	
	@Column(name="is_failed_theory")
	private Boolean isFailedTheory;
	
	@Column(name="is_failed_practical")
	private Boolean isFailedPractical;
	
	@Column(name="is_appeared_theory")
	private Boolean isAppearedTheory;
	
	@Column(name="is_appeared_practical")
	private Boolean isAppearedPractical;
		
	@Column(name="fees")
	private String fees;
	
	@Column(name="chance")
	private Integer chance;
	
	@Column(name="scheme_no")
	private Integer schemeNo;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="is_theory_overall_failed")
	private Boolean isTheoryOverallFailed;
	
	@Column(name="is_practical_overall_failed")
	private Boolean isPracticalOverallFailed;
	
	@Column(name="is_online")
	private Boolean isOnline;
	
	@Column(name="cia_is_failed_theory")
	private Boolean isCIAFailedTheory;
	
	@Column(name="cia_is_failed_practical")
	private Boolean isCIAFailedPractical;
	
	@Column(name="cia_is_appeared_theory")
	private Boolean isCIAAppearedTheory;

	@Column(name="cia_is_appeared_practical")
	private Boolean isCIAAppearedPractical;
	
	@Column(name="is_cia")
	private Boolean ciaExam;
	
	@Column(name="process")
	private Boolean process;

}
