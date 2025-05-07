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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="tt_subject_batch_history")
public class TTSubjectBatchHistory implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -1976830130896822193L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "tt_period_id")
	private TTPeriodWeekHistory tTPeriodWeekHistory;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "batch_id")
	private Batch batch;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
	private Activity activity;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "attendance_type_id")
	private AttendanceType attendanceType;
	
	@Column(name="room_no")
	private String roomNo;
	
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
	
	@OneToMany(mappedBy = "tTSubjectBatchHistory", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<TTUsersHistory> ttUsersHistory;

}
