package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="student_documents")
public class StudentDocuments implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_type_id")
	private DocType docType;
	
	@Column(name="is_verified")
	private Boolean isVerified;
	
	@Column(name="file_name")
	private String fileName;
	
	@Column(name="file_type")
	private String fileType;
	
	@Column(name="created_by")
	private String createdBy;
		
	@Column(name="created_date")
	private Instant createdDate;
		
	@Column(name="modified_by")
	private String modifiedBy;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_rejected")
	private Boolean isRejected;
	
	@Column(name="is_pending")
	private Boolean isPending;
	
	@Column(name="reject_reason")
	private String rejectReason;
	
	@Column(name="file_size")
	private Integer fileSize;
	
	@Column(name="verified_by")
	private String verifiedBy;
	
	@Column(name="verified_date")
	private Instant verifiedDate;
			
	@Column(name="is_active")
	private Boolean isActive;
	
	

}
