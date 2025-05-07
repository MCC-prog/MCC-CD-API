package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.centralizedData.centralized.dto.admin.CategoryDto;
import com.centralizedData.centralized.dto.admin.CountryDto;

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
@Table(name="category")       
public class Category implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1205225906937969769L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer  id;
	
	@Column(name="name")
	private String name;
		
	@Column(name="created_by")
	private String createdBy;
		
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
		
	@Column(name="last_modified_date")
	private LocalDate lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="international_category")
	private Boolean internationalCategory;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public LocalDate getLastModifiedDate() {
		return lastModifiedDate;
	}


	public void setLastModifiedDate(LocalDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public Boolean getInternationalCategory() {
		return internationalCategory;
	}


	public void setInternationalCategory(Boolean internationalCategory) {
		this.internationalCategory = internationalCategory;
	}
	
	
	

}
