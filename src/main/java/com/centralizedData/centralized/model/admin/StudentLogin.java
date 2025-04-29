package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

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
@Table(name="student_login")
public class StudentLogin implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2346856934759237924L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roles_id")
	private Roles roles;
	
	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name="no_of_retries")
	private Integer	noOfRetries;
	
	@Column(name="last_logged_in")
	private LocalDate lastLoggedIn;
	
	@Column(name="ip_address")
	private Integer ipAddress;
	
	@Column(name="is_locked")
	private Boolean isLocked;
	
	@Column(name="is_logged_in")
	private Boolean isLoggedIn;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="spring_password")
	private String springPassword;
	
	@Column(name="is_student")
	private Boolean isStudent;
	
	@Column(name="is_temp_pasword")
	private Boolean isTempPasword;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="iserverpassword")
	private String iserverpassword;
	
//	@Column(name="is_temp_password")
//	private String isTempPassword;
	
//	@Column(name="iserver_password")
//	private String iserverPassword;

}
