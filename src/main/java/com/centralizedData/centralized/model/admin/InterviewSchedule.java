package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;
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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="interview_schedule")
public class InterviewSchedule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3921048718600612555L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_id")
	private Interview interview;
		
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_selection_schedule_id")
	private InterviewSelectionSchedule interviewSelectionScheduleId;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "date")
	private Date date;

	@Column(name = "start_time")
	private String startTime;

	@Column(name = "end_time")
	private String endTime;

	@Column(name = "time_interval")
	private Instant timeInterval;
	
	@Column(name = "venue")
	private String venue;
	
	@Column(name = "queries")
	private String queries;
	
	@Column(name = "remarks")
	private String remarks;
	
	@OneToMany(mappedBy = "interviewSchedule", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<InterviewBreakTime> interviewBreakTimes;
	
	@OneToMany(mappedBy = "interviewSchedule", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<InterviewCard> interviewCards;
	
	
}
