package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="prerequisite_year_month")
public class PrerequisitsYearMonth implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 6772572422014609571L;

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="month")
	private Integer month;
	
	@Column(name="created_By")
	private String createdBy;
	
	@Column(name="modified_By")
	private String modifiedBy;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_Date")
	private Instant createdDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="last_Modified_Date")
	private Instant lastModifiedDate;
}
