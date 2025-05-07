package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="emp_immigration")
public class EmpImmigration implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -93349280992368092L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passport_country_id")
	private Country countryByPassportCountryId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visa_country_id")
	private Country countryByVisaCountryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	
	@Column(name = "created_by")
	private String createdBy;
	
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "passport_no")
	private String passportNo;
	
	@Column(name = "passport_status")
	private String passportStatus;
	
	@Column(name = "passport_review_status")
	private String passportReviewStatus;
	
	@Column(name = "passport_issue_date")
	private Date passportIssueDate;
	
	@Column(name = "passport_date_of_expiry")
	private Date passportDateOfExpiry;
	
	@Column(name = "passport_comments")
	private String passportComments;
	
	
	@Column(name = "visa_no")
	private String visaNo;
	
	
	@Column(name = "visa_status")
	private String visaStatus;
	
	@Column(name = "visa_review_status")
	private String visaReviewStatus;
	
	@Column(name = "visa_issue_date")
	private Date visaIssueDate;
	
	@Column(name = "visa_date_of_expiry")
	private Date visaDateOfExpiry;
	
	@Column(name = "visa_comments")
	private String visaComments;
	
//	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<Employee> employees = new HashSet<Employee>(0);

}
