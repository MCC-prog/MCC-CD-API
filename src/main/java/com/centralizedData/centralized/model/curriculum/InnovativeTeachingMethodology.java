package com.centralizedData.centralized.model.curriculum;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="ce_curriculum_innovative_teaching_methodology")
public class InnovativeTeachingMethodology implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2579203752972143381L;

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "academic_year")
	private Integer academicYear;
	
	@Column(name = "sem_type")
	private String semType;
	
	@Column(name = "semester_no")
	private Integer semesterNo;
	
	@Column(name = "course_title")
	private String courseTitle;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private LocalDateTime lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "innovativeTeachingMethodology", 
			orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<InnovativeTeachingMethodologyCourses> innovativeTeachingMethodologyCourses = 
	new HashSet<InnovativeTeachingMethodologyCourses>();
		
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "innovativeTeachingMethodology", 
			orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<InnovativeTeachingMethodologyDocument> innovativeTeachingMethodologyDocument = 
	new HashSet<InnovativeTeachingMethodologyDocument>();
}
