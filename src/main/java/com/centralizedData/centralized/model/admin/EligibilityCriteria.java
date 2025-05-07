package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
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


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="eligibility_criteria")
public class EligibilityCriteria implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -4515126804904171689L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "total_percentage")
	private BigDecimal totalPercentage;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "percentage_without_language")
	private BigDecimal percentageWithoutLanguage;
	
	@OneToMany(mappedBy = "eligibilityCriteria", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EligibleSubjects> eligibleSubjectses = new HashSet<EligibleSubjects>();
		
	
	
	
	
}
