package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.OneToMany;
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
@Table(name="fee_payment")
public class FeePayment implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	private Currency currency;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_mode_id")
	private FeePaymentMode feePaymentMode;
	
	@Column(name="application_no")
	private String applicationNo;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="registration_no")
	private String registrationNo;
	
	@Column(name="bill_no")
	private String billNo;
	
	@Column(name="challen_no")
	private String challenNo;
	
	@Column(name="total_amount")
	private BigDecimal totalAmount;
	
	@Column(name="total_fee_paid")
	private BigDecimal totalFeePaid;
	
	@Column(name="is_challen_printed")
	private Boolean isChallenPrinted;
	
	@Column(name="challen_printed_date")
	private Date challenPrintedDate;
	
	@Column(name="is_fee_paid")
	private Boolean isFeePaid;
	
	@Column(name="fee_paid_date")
	private Date feePaidDate;
	
	@Column(name="is_completly_paid")
	private Boolean isCompletlyPaid;
	
	@Column(name="total_concession_amount")
    private BigDecimal totalConcessionAmount;
	
	@Column(name="total_balance_amount")
    private BigDecimal totalBalanceAmount;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
    private Courses course;
    
    @Column(name="academic_year")
    private Integer academicYear;
    
    @Column(name="is_challan_canceled")
    private Boolean isCancelChallan;
    
    @Column(name="challan_created_time")
    private Date challanCreatedTime;
    
    @Column(name="concession_voucher_no")
	private String concessionVoucherNo;
    
    @Column(name="roll_no")
	private String rollNo;
    
    @Column(name="cancellation_reason")
	private String cancellationReason;
    
    @Column(name="manual_class_name")
	private String manualClassName;
    
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_paid_financial_year_id")
	private FeeFinancialYear amountFinancialYear;
	
	
	@OneToMany(mappedBy = "feePayment", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeePaymentDetail> feePaymentDetails = new HashSet<FeePaymentDetail>(
			0);
	
	@OneToMany(mappedBy = "feePayment", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeePaymentApplicantDetails> feePaymentApplicantDetailses = new HashSet<FeePaymentApplicantDetails>(
			0);

}
