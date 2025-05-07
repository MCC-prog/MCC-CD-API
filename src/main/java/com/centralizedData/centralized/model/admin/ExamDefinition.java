package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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
@Table(name="EXAM_definition")
public class ExamDefinition implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8107031547906999197L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="exam_code")
	private String examCode;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_type_id")
	private ExamType examType;
	
	@Column(name="month")
	private String month;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="exam_for_joining_batch")
	private Integer examForJoiningBatch;
	
	@Column(name="max_no_failed_sub")
	private Integer maxNoFailedSub;
	
	@Column(name="is_current")
	private Boolean isCurrent;
	
	@Column(name="del_is_active")
	private Boolean delIsActive; 
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "internal_exam_type_id")
	private ExamInternalExamType examInternalExamType;
	
	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@OneToMany(mappedBy = "examDefinition", cascade = CascadeType.ALL)
	private Set<ExamExamCourseSchemeDetails> courseSchemeDetails;
	
	
}
