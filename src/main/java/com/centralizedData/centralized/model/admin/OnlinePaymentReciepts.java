package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

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
@Getter
@Setter
@Entity 
@Table(name="online_payment_reciept")
public class OnlinePaymentReciepts implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "transaction_date")
	private Date transactionDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "bank_confirmation_id")
	private String bankConfirmationId;
	
	@Column(name = "is_payment_failed")
	private Boolean isPaymentFailed; 
	
	@Column(name = "total_amount")
	private BigDecimal totalAmount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "reciept_no")
	private Integer recieptNo;
	
	@Column(name = "application_for")
	private String applicationFor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pc_financial_year_id")
	private PcFinancialYear pcFinancialYear;
	
	@Column(name = "created_by")
	private String createdBy;;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_type_id")
	private ExamDefinition examId;
	
	@Column(name = "ref_no")
	private String refNo;
	
	@Column(name = "debited_amount")
	private BigDecimal debitedAmount;
	
	@Column(name = "payment_mode_selected")
	private String paymentModeSelected;
	

}

