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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="student_qualifyexam_detail")
public class StudentQualifyexamDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6495939283671558607L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@Column(name="optional_subjects")
	private String optionalSubjects;
	
	@Column(name="second_language")
	private String secondLanguage;
	
	@Column(name="total_marks")
	private BigDecimal totalMarks;
	
	@Column(name="obtained_marks")
	private String obtainedMarks;
	
	@Column(name="percentage")
	private BigDecimal percentage;
	
	@Column(name="core_subjects_total_marks")
	private BigDecimal coreSubjectsTotalMarks;
	
	@Column(name="core_subjects_obtained_marks")
	private BigDecimal coreSubjectsObtainedMarks;
	
	@Column(name="core_subjects_percentage")
	private BigDecimal coreSubjectsPercentage;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
}
