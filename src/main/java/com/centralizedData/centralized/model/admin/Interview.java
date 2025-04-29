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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="interview")
public class Interview implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5173834552021597854L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_program_course_id")
	private InterviewProgramCourse interviewProgramCourse;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "year")
	private Integer year;

	@Column(name = "no_of_candidates")
	private Integer noOfCandidates;

	@Column(name = "no_of_interviewers")
	private Integer noOfInterviewers;

	@Column(name = "is_group_interview")
	private Boolean isGroupInterview;
	
	@Column(name = "no_of_persons_per_panel")
	private Integer noOfPersonsPerPanel;

	@Column(name = "no_of_candidates_per_panel")
	private Integer noOfCandidatesPerPanel;

	@Column(name = "no_of_panels_per_day")
	private Integer noOfPanelsPerDay;
	
	@OneToMany(mappedBy = "interview", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<InterviewSchedule> interviewSchedules;

	

}
