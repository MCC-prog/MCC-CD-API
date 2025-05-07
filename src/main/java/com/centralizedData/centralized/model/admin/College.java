package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="college")
public class College implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1628143725313945781L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "university_id")
	private University university;
	
	@Column(name="created_by")
	private String createdBy ;

	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="is_approval_required")
	private Boolean isApprovalRequired;

	
}
