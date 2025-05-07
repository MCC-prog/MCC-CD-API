package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.centralizedData.centralized.dto.admin.AcademicYearDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="academic_year")
public class AcademicYear implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2108489577637808137L;


	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="created_date")
	private Instant createdDate;
	
	
	@Column(name="modified_by")
	private String modified_by;
	
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	
	@Column(name="is_active")
	private Boolean isActive;
		
	
	@Column(name="year")
	private Integer year;
	
	
	@Column(name="is_current")
	private Boolean isCurrent;
	
	 
	@Column(name="is_current_for_admission")
	private Boolean isCurrentForAdmission;
	
	
	@Column(name="start_date")
	private LocalDateTime startDate;
	
	
	@Column(name="end_date")
	private LocalDateTime endDate;
	
	@Column(name="display")
	private String display;
	
//	
//	@Column(name="appraisal_start_date")
//	private LocalDateTime appraisalStartDate;
//
//	
//	@Column(name="appraisal_end_date")
//	private LocalDateTime appraisalEndDate;
	
}
