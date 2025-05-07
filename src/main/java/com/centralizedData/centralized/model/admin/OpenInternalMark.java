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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="open_internal_marks_entry")
public class OpenInternalMark implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 882088014163200298L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;

	@Column(name="display_name")
	private String displayName;

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
	
	@Column(name="is_theory_practical")
	private String theoryPractical;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examDefinition;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType programType;
	
	@OneToMany(mappedBy = "openInternalMark", cascade = CascadeType.ALL)
	private Set<OpenInternalExamForClasses> classesSet;
}
