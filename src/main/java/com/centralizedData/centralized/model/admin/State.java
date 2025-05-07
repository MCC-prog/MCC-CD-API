package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.centralizedData.centralized.dto.admin.CountryDto;
import com.centralizedData.centralized.dto.admin.StateDto;

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
@Table(name="state")
public class State implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4718150107218108389L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="name")
	private String name;
	
//	@Column(name="country_id")
//	private Integer countryId;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="bank_state_id")
	private String bankStateId;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Country country;
	
	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Integer getCountryId() {
//		return countryId;
//	}
//
//	public void setCountryId(Integer countryId) {
//		this.countryId = countryId;
//	}
//
//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public Instant getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Instant createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public String getModifiedBy() {
//		return modifiedBy;
//	}
//
//	public void setModifiedBy(String modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
//
//	public Instant getLastModifiedDate() {
//		return lastModifiedDate;
//	}
//
//	public void setLastModifiedDate(Instant lastModifiedDate) {
//		this.lastModifiedDate = lastModifiedDate;
//	}
//
//	public Boolean getIsActive() {
//		return isActive;
//	}
//
//	public void setIsActive(Boolean isActive) {
//		this.isActive = isActive;
//	}
//
//	public String getBankStateId() {
//		return bankStateId;
//	}
//
//	public void setBankStateId(String bankStateId) {
//		this.bankStateId = bankStateId;
//	}
//	
	

	
}
