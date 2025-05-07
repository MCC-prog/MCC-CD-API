package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_work_experience")
public class EmpWorkExperience implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -624701828011661202L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "employer")
	private String employer;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "is_internal")
	private Boolean isInternal;
	
	@Column(name = "is_Active")
	private Boolean isActive;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_by")
	private String lastModifiedBy;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

}
