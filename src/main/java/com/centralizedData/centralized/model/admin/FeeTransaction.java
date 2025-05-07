package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@Table(name="fee_transaction")
public class FeeTransaction implements Serializable{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	private Currency currency;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "bank_branch_id")
	private BankBranch bankBranch;
	

	@Column(name="created_by")
	private String createdBy;;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_mode_id")
	private PaymentMode paymentMode;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_excemption_id")
	private FeeExcemption feeExcemption;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_concession_id")
	private FeeConcession feeConcession;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_id")
	private Fee fee;
	
	@Column(name="register_number")
	private String registerNumber;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	@Column(name="paid_amount")
	private BigDecimal paidAmount;
	
	@Column(name="receipt_no")
	private String receiptNo;
	
	@Column(name="journal_no")
	private String journalNo;
	
	@Column(name="challan_ref_no")
	private String challanRefNo;
	
	@Column(name="installment_no")
	private Integer installmentNo;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;

}
