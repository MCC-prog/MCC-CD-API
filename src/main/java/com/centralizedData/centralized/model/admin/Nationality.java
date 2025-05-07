package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="nationality")
public class Nationality implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2940456147401673748L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;	
	
	@Column(name="created_by")
	private String createdBy ;
		
	@Column(name="created_date")
	private Instant createdDate;	
	
	@Column(name="is_active")
	private Boolean isActive;
			
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
			
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="name")
	private String name;
	
	
//	@Column(name="SAARC_ASEAN_AFRICAN")
//	Boolean saarcAseanAfrican;
}
