package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="unique_id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Applicant implements Serializable{

	/**
	 * author - ninad 
	 */
	private static final long serialVersionUID = -4377212718997132966L;

private static final long OTP_VALID_DURATION = 5 * 60 * 1000;
	
	@Id
	@Column(name="id", nullable = false , updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="E-mail cannot be empty or null")
	@Column(name="email_id",unique = true)
	private String emailId;
	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = "users", joinColumns = { @JoinColumn(name = "users_id") }, inverseJoinColumns = {
//	@JoinColumn(name = "applicant_id") })
//	private User user;
	
	
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "applicant", orphanRemoval = true, cascade = CascadeType.ALL)
//	private Set<Role> Role = new HashSet<Role>();
	
//	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//    @JoinTable(name="applicant_roles",
//        joinColumns = {@JoinColumn(name="applicant_id", referencedColumnName="id")},
//        inverseJoinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")}
//    )
//    private List<ApplicantRoles>  applicantroles;
	
	@Column(name="roles")
	private String role;
	
	@Column(name="authorities")
	private String authorities;
	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "APPLICANT_ROLES", joinColumns = {
//            @JoinColumn(name = "applicant_id") }, inverseJoinColumns = {
//            @JoinColumn(name = "role_id") })
//    private Set<Role> roles;
	
	
	@NotBlank(message="Mobile Number cannot be empty or null")
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="unique_id")
	private String UniqueId;
	
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
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="is_logged_in")
	private Integer isLoggedIn;
	
	@Column(name="last_logged_in")
	private Instant lastLoggedIn;
	
	@Column(name="country_code")
	private Integer countryCode;
	
	@Column(name="ssn_id")
	private String ssnId;
	
	@NotBlank(message="password cannot be null")
	@Column(name="password")
	private String password;
	
	@NotBlank(message="Name cannot be empty or null")
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="ip_address")
	private String ipAddress;
	
	@Column(name = "one_time_password")
	 private Integer oneTimePassword;
	     
	@Column(name = "otp_requested_time")
	private Instant otpRequestedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUniqueId() {
		return UniqueId;
	}

	public void setUniqueId(String uniqueId) {
		UniqueId = uniqueId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

//	public Integer getIsActive() {
//		return isActive;
//	}
//
//	public void setIsActive(Integer isActive) {
//		this.isActive = isActive;
//	}
	
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(Integer isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public Instant getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Instant lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getSsnId() {
		return ssnId;
	}

	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Integer getOneTimePassword() {
		return oneTimePassword;
	}

	public void setOneTimePassword(Integer oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	}

	public Instant getOtpRequestedTime() {
		return otpRequestedTime;
	}

	public void setOtpRequestedTime(Instant otpRequestedTime) {
		this.otpRequestedTime = otpRequestedTime;
	}

	public static long getOtpValidDuration() {
		return OTP_VALID_DURATION;
	}
	
}
