package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="vba_master_additional_fee_assignment")
public class VbaMasterAdditionalFeeAssignment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1277861177765392621L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_additional_id")
	private FeeAdditional feeAdditional;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "second_language_id")
	private ExamSecondLanguage secondLanguage;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;

}
