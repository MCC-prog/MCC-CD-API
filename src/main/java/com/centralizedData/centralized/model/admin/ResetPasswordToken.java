package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.centralizedData.centralized.model.employee.Employee;

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
@Table(name="reset_password_token")
public class ResetPasswordToken implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4113620077842271276L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Employee employee;
	
	@Column(name="expiry_date")
	private Instant expiryDate;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	@Column(name = "one_time_password")
	 private Integer oneTimePassword;
	     
	@Column(name = "otp_requested_time")
	private Instant otpRequestedTime;
	
	@Column(name="token")
	private String token;
}
