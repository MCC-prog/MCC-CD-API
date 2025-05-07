package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fee_voucher")
public class FeeVoucher implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="type")
	private String type;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_financial_year_id")
	private FeeFinancialYear feeFinancialYear;
	
	@Column(name="starting_number")
	private String startingNumber;
	
	@Column(name="ending_number")
	private String endingNumber;
	
	@Column(name="slip_book_number")
	private String slipBookNumber;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="alpha")
	private String alpha;

}
