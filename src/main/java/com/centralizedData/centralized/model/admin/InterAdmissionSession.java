package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="intr_admission_sessions")
public class InterAdmissionSession implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7214873208392128681L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "intr_session_details_id")
	private InterdiscipSessionDetails semesterNameId;
	
	@Column(name = "is_application_open")
	private Boolean  isApplicationOpen;
	
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
    
	@Column(name = "registration_from")
    private Date registrationFrom;
    
	@Column(name = "registration_till")
    private Date registrationTill;
}
