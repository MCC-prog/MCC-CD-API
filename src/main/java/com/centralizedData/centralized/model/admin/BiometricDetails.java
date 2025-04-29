package com.centralizedData.centralized.model.admin;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="emp_biometric_master")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BiometricDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3504297149876864679L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="machineId")
	private String machineId;
	
	@Column(name="machineIp")
	private String machineIp;
	
	@Column(name="machinename")
	private String machineName;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	
	@Column(name="created_date")
	private Date createdDate;
	
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	
	@Column(name="work_location")
	private String workLocation;

}
