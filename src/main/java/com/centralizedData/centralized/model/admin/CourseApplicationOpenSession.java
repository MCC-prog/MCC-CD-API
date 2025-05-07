package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="course_application_open_sessions")
public class CourseApplicationOpenSession implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1718077438579083937L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
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
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@Column(name="session_no")
	private Boolean sessionNo;
	
	@Column(name="open_from")
	private Date openFrom;
	
	@Column(name="open_to")
	private Date openTo;
	
	@Column(name="message_before_from_date")
	private String messageBeforeFromDate;
	
	@Column(name="message_after_to_date")
	private String messageAfterToDate;
}
