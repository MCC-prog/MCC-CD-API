package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

import com.centralizedData.centralized.dto.admin.IncomeDto;
import com.centralizedData.centralized.dto.admin.LanguageDto;

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
@Table(name="income")
public class Income implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4056842146580649158L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="created_by")
	private String createdBy ;	
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="income_range")
	private String incomeRange;
		
	@Column(name="is_active")
	private Boolean isActive;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
		
	@Column(name="modified_by")
	private String modifiedBy;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name="currency_id")
	private Currency currency;
}
