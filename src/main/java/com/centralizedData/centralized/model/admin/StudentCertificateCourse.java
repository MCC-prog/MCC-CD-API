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
import javax.validation.constraints.DecimalMax;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="student_certificate_course")
public class StudentCertificateCourse implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 4964329166963479762L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "certificate_course_id")
	private CertificateCourse CertificateCourse;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	private CCGroup groups;
	
	@Column(name="scheme_no")
	private Integer schemeNo;
	
	@Column(name="is_cancelled")
	private Boolean isCancelled;
	
	@Column(name="is_optional")
	private Boolean isOptional;
	
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
	
	@Column(name="is_extra_curricular")
	private Boolean isExtraCurricular;
	
	@Column(name="transaction_date")
	private Date transactionDate;
	
	@Column(name="status")
	private String status;
	
	@Column(name="bank_confirmation_id")
	private String bankConfirmationId;
	
	@Column(name="is_payment_failed")
	private Boolean isPaymentFailed;
	
	@Column(name="fee_amount")
	private Double feeAmount;
			
	@Column(name="is_online")
	private Boolean isOnline;

}
