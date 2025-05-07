package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
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
@Table(name="forward_to_fee_department")
public class ForwardToFeeDepartment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -131390026739924768L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_program_course_id")
	private InterviewProgramCourse interviewProgramCourse;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="cancelled")
	private Boolean cancelled;
	
	@Column(name="doc_verified")
	private Boolean docVerified;
	
	@Column(name="doc_verified_by")
	private String docVerifiedBy;
	
	@Column(name="doc_verified_date")
	private Date docVerifiedDate;
	
	@Column(name="doc_rejected")
	private Boolean docRejected;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="assign_fee")
	private Boolean assignFee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "admitted_through_id")
	private AdmittedThrough admittedThrough;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "second_language_id")
	private ExamSecondLanguage secondLanguage;

}
