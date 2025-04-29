package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="fee_payment_mode")
public class FeePaymentMode implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7978823002921720840L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="name")
	private String name;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	
	
//	private Set<FeePayment> feePayments = new HashSet<FeePayment>(0);
//	private Set<FeePaymentDetail> feePaymentDetails = new HashSet<FeePaymentDetail>(
//			0);

}
