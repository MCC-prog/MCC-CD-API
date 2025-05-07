package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="virtual_bank_account")
public class VirtualBankAccount implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6484576084729130269L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name="account_number")
	private String accountNumber;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="mobile_country_code")
	private String mobileCountryCode;
	
	@Column(name="email")
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses course;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financial_year_id")
	private FeeFinancialYear financialYear;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="last_activated_date")
	private Date lastActivateddDate;
	
	@Column(name="last_deactivated_date")
	private Date lastDeActivatedDate;
	
	@Column(name="active_account")
	private Boolean activeAccount;
	
	@Column(name="password")
	private String password;
	
	@Column(name="is_locked")
	private Boolean isLocked;
	
	@Column(name="last_logged_in")
	private Date lastLoggedIn;

}
