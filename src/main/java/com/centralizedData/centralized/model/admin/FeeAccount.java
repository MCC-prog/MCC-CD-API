package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="fee_account")
public class FeeAccount implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 496037809482301404L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="is_active")
	private Boolean isActive;
	
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_division_id")
	private FeeDivision feeDivision;
	
	
	@Column(name="code")
	private String code;
	
	@Column(name="description1")
	private String description1;
	
	@Column(name="description2")
	private String description2;
	
	@Column(name="logo")
	private byte[] logo;
	
	@Column(name="file_name")
	private String fileName;
	
	@Column(name="content_type")
	private String contentType;
	
	@Column(name="verified_by")
	private String verifiedBy;
	
	@Column(name="bank_information")
	private String bankInformation;
	
	@Column(name="print_account_name")
	private String printAccountName;
	
	@Column(name="print_position")
	private Integer printPosition;
	
	
	@OneToMany(mappedBy = "feeAccount", cascade = CascadeType.ALL,orphanRemoval=true)

	private Set<FeeAccountAssignment> feeAccountAssignments = new HashSet<FeeAccountAssignment>(
			0);
	
	@OneToMany(mappedBy = "feeAccount", cascade = CascadeType.ALL,orphanRemoval=true)

	private Set<FeePaymentDetail> feePaymentDetails = new HashSet<FeePaymentDetail>(
			0);

}
