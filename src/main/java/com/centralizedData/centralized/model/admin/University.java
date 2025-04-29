package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="university")
public class University implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4341649961667759868L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_type_Id")
	private DocType docType;
	
//	@Column(name="doc_type_id")
//	private Integer docTypeId;
	
	@OneToMany(mappedBy = "university", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<College> colleges = new HashSet<College>();
//	private Set<WeightageDefinition> weightageDefinitions = new HashSet<WeightageDefinition>(
//			0);
//	private Set<EdnQualification> ednQualifications = new HashSet<EdnQualification>(
//			0);
//	private Set<FeeCriteria> feeCriteriasUni = new HashSet<FeeCriteria>(
//			0);
}
