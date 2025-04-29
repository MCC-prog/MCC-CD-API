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
@Table(name="fee_additional")
public class FeeAdditional  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1564083069113178730L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_division_id")
	private FeeDivision feeDivision;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_group_id")
	private FeeGroup feeGroup;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@OneToMany(mappedBy = "feeAdditional", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeAdditionalAccountAssignment> feeAdditionalAccountAssignments = new HashSet<FeeAdditionalAccountAssignment>(
			0);
	@OneToMany(mappedBy = "feeAdditional1", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeCriteria> feeCriterias1  = new HashSet<FeeCriteria>();
	
	@OneToMany(mappedBy = "feeAdditional2", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeCriteria> feeCriterias2 = new HashSet<FeeCriteria>();
	
	@OneToMany(mappedBy = "feeAdditional3", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeCriteria> feeCriterias3 = new HashSet<FeeCriteria>();
	
	

}
