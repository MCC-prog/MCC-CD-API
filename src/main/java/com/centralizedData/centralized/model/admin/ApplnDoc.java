package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

@Entity
@Table(name="appln_doc")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApplnDoc implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3350261405974461502L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
//	
//	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name="doc_type_id")
//	private DocType docTypeId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="doc_type")
	private DocType docType;
	
	@Column(name="is_signature")
	private Boolean isSignature;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="document")
	private byte[] document;
	
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	
	@Column(name="is_verified")
	private Boolean isVerified;
	
	
	@Column(name="content_type")
	private String contentType;
	
	
	@Column(name="is_hard_copy_submitted")
	private Boolean isHardCopySubmitted;
	
	
	@Column(name="is_photo")
	private Boolean isPhoto;
	
	
	@Column(name="submission_date")
	private LocalDate submissionDate;
	

	@Column(name="is_not_applicable")
	private Boolean isNotApplicable;
	
	@Column(name="sem_no")
	private String semNo;
	
	
	@Column(name="sem_type")
	private String semType;
	
	
	@Column(name="no_of_semester")
	private String noOfSemester;
	
	@OneToMany(mappedBy = "applnDoc", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<ApplnDocDetails> applnDocDetails;
	
	
}
