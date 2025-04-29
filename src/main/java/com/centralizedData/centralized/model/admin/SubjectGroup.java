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
@Table(name="subject_group")
public class SubjectGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 972797961270973459L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@Column(name="name")
	private String subjectGroupName;
	
	
//	@OneToMany(mappedBy = "subjectGroup", cascade = CascadeType.ALL,orphanRemoval=true)
//	private List<SubjectGroupSubjects> subjectGroupSubjects;
	
	@OneToMany(mappedBy = "subjectGroup", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<SubjectGroupSubjects> subjectGroupSubjects = new HashSet<SubjectGroupSubjects>(0);
	
	@Column(name="is_common_sub_grp")
	private Boolean commonSubjectGroup;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "second_language_id")
	private SecondLanguage secondLanguage;
	
	@Column(name="religion_subject")
	private Integer IsRc;
	
//	@Column(name="exam_second_language_masterbo")
//	private String examSecondLanguageMasterbo ;
//	
//	@Column(name="examSecondLanguageMasterBO")
//	private String examSecondLanguageMasterBO ;
	
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
}
