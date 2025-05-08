package com.centralizedData.centralized.model.curriculum;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Builder
@Table(name="ce_curriculum_innovative_teaching_methodology_document")
public class InnovativeTeachingMethodologyDocument implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 5671141779055928165L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "innovative_teaching_methodology_id", nullable = false)
	private InnovativeTeachingMethodology innovativeTeachingMethodology;

	@Column(name = "filename")
	private String fileName;

	@Column(name = "file_type")
	private String fileType;

	@Column(name = "file_size")
	private Integer fileSize;

	@Column(name = "doc_type")
	private String docType;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private LocalDateTime lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;
	

}
