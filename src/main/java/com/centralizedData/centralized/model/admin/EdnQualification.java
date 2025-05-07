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
@Table(name="edn_qualification")
public class EdnQualification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2459990532894611797L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "personal_data_id")
	private PersonalData personalData;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "institution_id")
	private College college;
	
	@Column(name="no_of_attempts")
	private Integer noOfAttempts;
	
	@Column(name="created_by")
	private String createdBy ;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="year_passing")
	private Integer yearPassing;
	
	@Column(name="marks_obtained")
	private BigDecimal marksObtained;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "university_id")
	private University university;
	
	@Column(name="total_marks")
	private BigDecimal totalMarks;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_checklist_id")
	private DocChecklist docChecklist;
	
	@Column(name="institution_name_others")
	private String institutionNameOthers;
	
	@Column(name="university_others")
	private String universityOthers;
	
	@Column(name="percentage")
	private BigDecimal percentage;
	
	@Column(name="weightage_adjusted_marks")
	private Double weightageAdjustedMarks;
	
	@Column(name="monthOfPassing")
	private Integer monthOfPassing;
	
	@Column(name="prev_exam_reg_no")
	private String prevExamRegNo;
	
//	@Column(name="course_name")
//	private String courseName;
	
	@Column(name="semester")
	private Integer semester;
	
	@Column(name="minimum_marks")
	private Double minimumMarks;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private State state;
	
	@Column(name="is_outside_india")
	private Boolean isOutsideIndia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_type_exam_id")
	private DocTypeExam docTypeExam;
	
	
	@Column(name="course_name")
	private String  previousCourse;
	
	@OneToMany(mappedBy = "ednQualification", cascade = CascadeType.ALL)
	private Set<ApplicantMarksDetails> applicantMarksDetailses = new HashSet<ApplicantMarksDetails>();
	
	@OneToMany(mappedBy = "ednQualification", cascade = CascadeType.ALL)
	private Set<CandidateMark> candidateMarkses = new HashSet<CandidateMark>();
	
}
