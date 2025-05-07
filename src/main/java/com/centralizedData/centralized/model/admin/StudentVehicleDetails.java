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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="student_vehicle_details")
public class StudentVehicleDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5025190954104072322L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST,  fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@Column(name="vehicle_type")
	private String vehicleType;
	
	@Column(name="vehicle_no")
	private String vehicleNo;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
}
