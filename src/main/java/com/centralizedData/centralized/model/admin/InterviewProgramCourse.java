package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="interview_program_course")
public class InterviewProgramCourse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2985812374175035349L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
	private Program program;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "weightage_id")
	private Weightage weightage;
	
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
	
	@Column(name="sequence")
	private String sequence;

	@Column(name="year")
	private Integer year;
	
	@Column(name="name")
	private String interviewType;

	@Column(name="weightage_percentage")
	private BigDecimal weightagePercentage;

	@Column(name="content")
	private String content;
	
	@Column(name="no_of_interviews_per_panel")
	private String noOfInterviewsPerPanel;
}
