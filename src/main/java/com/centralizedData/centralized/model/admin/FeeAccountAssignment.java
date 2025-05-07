package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="fee_account_assignment")
public class FeeAccountAssignment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 658580415392995681L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_heading_id")
	private FeeHeading feeHeading;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "admitted_through_id")
	private AdmittedThrough admittedThrough;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_account_id")
	private FeeAccount feeAccount;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_id")
	private Fee fee;
	
	@Column(name="amount")
	private BigDecimal amount;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_data")
	private Date lastModifiedData;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	private Currency currencyByCurrencyId;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "lig_currency_id")
	private Currency currencyByLigCurrencyId;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "caste_currency_id")
	private Currency currencyByCasteCurrencyId;
	
	@Column(name="lig_amount")
	private BigDecimal ligAmount;
	
	@Column(name="caste_amount")
	private BigDecimal casteAmount;

}
