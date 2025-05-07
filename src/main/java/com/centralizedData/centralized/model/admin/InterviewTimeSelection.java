package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="interview_time_selection")
public class InterviewTimeSelection implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5133023526741046469L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name="select_schedule_id")
	private InterviewSelectionSchedule InterviewSelectionSchedule;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="is_active")
	private Integer isActive;

	@Column(name="end_time")
	private String endTime;

	@Column(name="time")
	private String time;

	@Column(name="max_seats")
	private Integer maxSeats;
}
