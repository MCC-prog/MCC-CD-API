package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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
@Table(name="course_university_mark_settings")
public class CourseUniversityMarksSettings implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 4472339705494975645L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "university_id")
	private University university;
	
	@Column(name = "mark_entry_from")
	private Date markEntryOpenFrom;
	
	@Column(name = "mark_entry_from_time")
	private String markEntryOpenTime;
		
	@Column(name = "created_by")
	private String createdBy;
		
	@Column(name = "modified_by")
    private String modifiedBy;
    
	@Column(name = "created_date")
    private Instant createdDate;
    
	@Column(name = "last_modified_date")
    private Instant lastModifiedDate;
       
	@Column(name = "is_active")
    private Boolean isActive;

}
