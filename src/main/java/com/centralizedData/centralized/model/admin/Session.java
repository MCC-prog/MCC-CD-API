package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
import javax.security.auth.Subject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "session")
public class Session implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sub_class_id")
	private SubClass subClass;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@Column(name = "created_by")
	private String createdBy;;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_type_id")
	private SubjectType subjectType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
	private Activity activity;
	
	
	@Column(name = "modified_by")
	private String modifiedBy;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_type_id")
	private SessionType sessionType;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "start_time")
	private Date startTime;
	
	@Column(name = "end_time")
	private Date endTime;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@OneToMany(mappedBy = "session", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<SessionIncharge> sessionIncharges = new HashSet<SessionIncharge>(
			0);
	
	@OneToMany(mappedBy = "session", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<SessionAttendee> sessionAttendees = new HashSet<SessionAttendee>(
			0);
}
