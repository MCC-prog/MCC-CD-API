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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name="admission_no")
public class AdmissionNoEntry implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8417140070566828225L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="start_no")
	private Integer startNo;
	
	@Column(name="prefix")
	private String prefix;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="current_no")
	private Integer currentNo;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_Modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType programType;




	
	
}
