package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
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

import com.centralizedData.centralized.model.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tt_subject_batch")
public class TTSubjectBatch implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "tt_period_id")
	private TTPeriodWeek ttPeriodWeek;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "batch_id")
	private Batch batch;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name="room_no")
	private String roomNo;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "attendance_type_id")
	private AttendanceType attendanceType;
	
	
	@OneToMany(mappedBy = "ttSubjectBatch", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<TTUsers> ttUsers;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
	private Activity activity;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "room_master_id")
	private RoomMaster roomMaster;

}
