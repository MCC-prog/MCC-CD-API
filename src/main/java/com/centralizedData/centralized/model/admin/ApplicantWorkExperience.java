package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

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
@Table(name="applicant_work_experience")
public class ApplicantWorkExperience implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6656504021310991922L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "occupation_id")
	private Occupation occupation;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="organization")
	private String organization;
	
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name="to_date")
	private Date toDate;
	
	@Column(name="position")
	private String position;
	
	@Column(name="reporting_to")
	private String reportingTo;
	
	@Column(name="is_current")
	private Boolean isCurrent;
	
	@Column(name="salary")
	private BigDecimal salary;
	
	@Column(name="organization_ph_no")
	private String organizationPhNo;
}
