package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_publish_exam_results")
public class ExamPublishExamResults implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2696239047981996171L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examDefinition;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@Column(name="publish_date")
	private Date publishDate;
	
	@Column(name="is_publish_overall_internal_comp_only")
	private Boolean isPublishOverallInternalCompOnly;
	
	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

}
