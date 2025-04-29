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
@Table(name="fee_heading")
public class FeeHeading implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6271889276913183031L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
	@JoinColumn(name = "fee_group_id")
	private FeeGroup feeGroup;
	
	
	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@OneToMany(mappedBy = "feeHeading", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeAccountAssignment> feeAccountAssignments = new HashSet<FeeAccountAssignment>(
			0);
	
	@OneToMany(mappedBy = "feeHeading", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeePaymentDetail > feePaymentDetailses = new HashSet<FeePaymentDetail>(
			0);

}
