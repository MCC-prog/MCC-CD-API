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
@Table(name="interview_card")
public class InterviewCard implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2703528514140971987L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
		
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_schedule_id")
	private InterviewSchedule interviewSchedule;	
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "reporting_time")
	private String reportingTime;

	@Column(name = "interviewer")
	private Integer interviewer;

	@Column(name = "entrance_number")
	private String entranceNumber;
	
	@Column(name = "time")
	private String time;


//	private Set<InterviewProcess> interviewProcesses = new HashSet<InterviewProcess>();
}
