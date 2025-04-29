package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "block_exam_for_roles")
public class BlockMarkEntryForRoles implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4192669442429962257L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Roles roles;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_def_id")
	private ExamDefinition examDefinition;
	
	@Column(name = "created_by")
	private String CreatedBy;
	
	@Column(name = "modified_by")
	private String ModifiedBy;
	
	@Column(name = "created_date")
	private Date CreatedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "last_modified_date")
	private Date LastModifiedDate;
	
	@Column(name = "is_mark_entry_blocked")
	private Boolean markEntryBlocked;
}
