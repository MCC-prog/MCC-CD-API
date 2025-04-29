package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="fee_group")
public class FeeGroup  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2917270528495824791L;

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
	
	@Column(name="is_optional")
	private Boolean isOptional;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@OneToMany(mappedBy = "feeGroup", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeHeading> feeHeadings = new HashSet<FeeHeading>(0);
	
	@OneToMany(mappedBy = "feeGroup", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Fee> fees = new HashSet<Fee>(0);
	
	@OneToMany(mappedBy = "feeGroup", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeePaymentApplicantDetails> feePaymentApplicantDetailses = new HashSet<FeePaymentApplicantDetails>(
			0);

}
