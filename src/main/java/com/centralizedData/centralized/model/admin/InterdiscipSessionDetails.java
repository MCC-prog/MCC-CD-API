package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="intr_session_details")
public class InterdiscipSessionDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6703563249192038328L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "semester_name")
	private String semesterName;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_by")
    private String modifiedBy;
    
	@Column(name = "created_date")
    private Instant createdDate;
    
	@Column(name = "last_modified_date")
    private Instant lastModifiedDate;
    
	@Column(name = "is_active")
    private Boolean isActive;
}
