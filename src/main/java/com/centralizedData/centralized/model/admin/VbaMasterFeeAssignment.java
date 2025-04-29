package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

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
@Table(name="vba_master_fee_assignment")
public class VbaMasterFeeAssignment implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7954186960655007180L;


	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses course;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "admitted_through_id")
	private AdmittedThrough admittedThrough;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="add_second_language")
	private Boolean addSecondLanguage;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;

}
