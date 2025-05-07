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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="detailed_subjects")
public class DetailedSubjects implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -254868560868827841L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
	
	@Column(name="name")
	private String subjectName;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name="course_id")
	private Courses courses; 

}
