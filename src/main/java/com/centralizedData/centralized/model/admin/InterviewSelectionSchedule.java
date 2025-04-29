package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
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
@Table(name="interview_selection_schedule")
public class InterviewSelectionSchedule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8000746029424572789L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
	private Program program;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "venue_id")
	private ExamCenter examCenter;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "academic_year")
	private Integer academicYear;

	@Column(name = "pi_required")
	private Boolean piRequired;

	@Column(name = "max_no_seats_offline")
	private Integer maxNoSeatsOffline;
	
	@Column(name = "max_no_seats_online")
	private Integer maxNoSeatsOnline;
	
	@Column(name = "cut_off_date")
	private Date cutOffDate;
	
	@Column(name = "selection_process_date")
	private Date selectionProcessDate;
}
