package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.centralizedData.centralized.dto.admin.MotherTongueDto;

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
@Table(name="region")
public class Region implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1301341322085262876L;
	
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
	
	
	
	
	

	

}
