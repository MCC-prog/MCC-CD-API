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
@Table(name="fee_additional_account_assignment")
public class FeeAdditionalAccountAssignment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4766776704179627648L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_heading_id")
	private FeeHeading feeHeading;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_account_id")
	private FeeAccount feeAccount;
	
	@Column(name="amount")
	private BigDecimal amount;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_additional_id")
	private FeeAdditional feeAdditional;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
//	@Column(name="name")
//	private String name;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;


}
