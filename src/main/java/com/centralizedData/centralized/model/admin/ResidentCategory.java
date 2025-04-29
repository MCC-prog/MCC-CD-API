package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
@Table(name="resident_category")
public class ResidentCategory implements Serializable{




	/**
	 * 
	 */
	private static final long serialVersionUID = 6766578395412966483L;

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



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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





	public Boolean getIsActive() {
		return isActive;
	}





	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}





	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}





	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}





	public String getModifiedBy() {
		return modifiedBy;
	}





	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}


}
