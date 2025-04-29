package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
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

import org.springframework.data.annotation.Persistent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="curriculum_scheme_duration")
public class CurriculumSchemeDuration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1086981923434549699L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "curriculum_scheme_id")
	private CurriculumScheme curriculumScheme;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "semester_year_no")
	private Integer semesterYearNo;
	
	@Column(name = "academic_year")
	private Integer academicYear;
	
	@OneToMany(mappedBy = "curriculumSchemeDuration", cascade = CascadeType.ALL,orphanRemoval=true) 
	private Set<CurriculumSchemeSubject> curriculumSchemeSubjects = new HashSet<CurriculumSchemeSubject>();
	
	@OneToMany(mappedBy = "curriculumSchemeDuration",cascade = CascadeType.ALL,orphanRemoval=true) 
	private Set<ClassSchemewise> classSchemewises = new HashSet<ClassSchemewise>();
	
	
 
}
