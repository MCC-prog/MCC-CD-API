package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_settings")
public class EmployeeSettings implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1413781749928533384L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "age_of_retirement")
	private Integer ageOfRetirement;
	
	@Column(name = "sms_alert")
	private Boolean smsAlert;
	
	@Column(name = "absence_check")
	private Boolean absenceChecking;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "accumulate_leave_type")
	private EmpLeaveType accumulateLeaveType;
	
	@Column(name = "current_application_no")
	private String currentApplicationNo;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private  Instant lastModifiedDate;
	
	@Column(name = "machine_id_offtime_in_punch")
	private Integer machineIdForOfflineINPunch;
	
	@Column(name = "machine_id_offtime_out_punch")
	private Integer machineIdForOfflineOUTPunch;
}
