package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="doc_checklist")
public class DocChecklist implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7593323146659577071L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="created_by")
	private String createdBy ;

	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@Column(name="year")
	private Integer year;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="program_id")
	private Program program;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="doc_type_id")
	private DocType docType; 
	
	@Column(name="is_marks_card")
	private Boolean isMarksCard;
	
	@Column(name="is_consolidated_marks")
	private Boolean isConsolidatedMarks;
	
	@Column(name="need_to_produce")
	private Boolean needToProduce;
	
	@Column(name="isDocSelected")
	private Boolean isDocSelected;
	
	@Column(name="is_semester_wise")
	private Boolean isSemesterWise;
	
	@Column(name="is_previous_exam")
	private Boolean isPreviousExam;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="weightage_id")
	private Weightage weightage_id;
	
	@Column(name="weightage_percentage")
	private Double weightagePercentage;
	
	@Column(name="is_include_language")
	private Boolean isIncludeLanguage;
	
	@Column(name="is_exam_req")
	private Boolean isExamReq;
	
	@Column(name="need_to_produce_semwise_mc")
	private Boolean needToProduceSemwiseMc;
	
	@OneToMany(mappedBy = "docChecklist", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EdnQualification> ednQualifications = new HashSet<EdnQualification>();

}
