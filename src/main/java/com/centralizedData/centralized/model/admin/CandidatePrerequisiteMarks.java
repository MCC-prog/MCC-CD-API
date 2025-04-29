package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="candidate_prerequisite_marks")
public class CandidatePrerequisiteMarks implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2082992778439902798L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "prerequisite_id")
	private Prerequisite prerequisite;
	
	@Column(name="prerequisite_marks_obtained")
	private BigDecimal prerequisiteMarksObtained;
	
	@Column(name="prerequisite_total_marks")
	private BigDecimal prerequisiteTotalMarks;
	
	@Column(name="weightage_adjusted_marks")
	private BigDecimal weightageAdjustedMarks;
	
	@Column(name="roll_no")
	private String rollNo;
	
	@Column(name="exam_month")
	private Integer examMonth;
	
	@Column(name="exam_year")
	private Integer examYear;
	
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

}
