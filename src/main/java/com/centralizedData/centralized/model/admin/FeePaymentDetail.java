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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="fee_payment_detail")
public class FeePaymentDetail implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9114336773201074116L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	private Currency currency;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_financial_year_id")
	private FeeFinancialYear feeFinancialYear;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_payment_id")
	private FeePayment feePayment;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_payment_mode_id")
	private FeePaymentMode feePaymentMode;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_acount_id")
	private FeeAccount feeAccount;
	
	@Column(name="total_amount")
	private BigDecimal totalAmount;
	
	@Column(name="total_nonadditional_amount")
	private BigDecimal totalNonAdditionalAmount;
	
	@Column(name="total_additional_amount")
	private BigDecimal totalAdditionalAmount;
	
	@Column(name="concession_amount")
	private BigDecimal concessionAmount;
	
	@Column(name="amount_paid")
	private BigDecimal amountPaid;
	
	@Column(name="amount_balance")
	private BigDecimal amountBalance;
	
	@Column(name="paid_date")
	private Date paidDate;
	
	@Column(name="reference_number")
	private String referenceNumber;
	
	@Column(name="discount_amt")
	private BigDecimal discountAmt;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_heading_id")
	private FeeHeading feeHeading;
	
	@Column(name="semester_no")
	private Integer semesterNo;

}
