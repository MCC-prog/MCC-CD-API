package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

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
@Table(name="adm_appln_additional_info")
public class AdmApplnAdditionalInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3465568814175679935L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "applicant_feedback_id")
	private ApplicantFeedback applicantFeedBack;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "international_appln_fee_currency_id")
	private Currency internationalApplnFeeCurrency;
	
	@Column(name="admission_scheduled_date")
	private LocalDate admissionScheduledDate;
	
	@Column(name="admission_scheduled_time")
	private String admissionScheduledTime;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="title_father")
	private String titleFather;
	
	@Column(name="title_mother")
	private String titleMother;
	
	@Column(name="back_logs")
	private Boolean backLogs;
	
	@Column(name="is_comedk")
	private Boolean isComedk;
	
	@Column(name="communication_sent_to")
	private String communicationSentTo;
	
	@Column(name="is_spot_admission")
	private Boolean isSpotAdmission;
	
	@Column(name="list_name")
	private String listName;

}
