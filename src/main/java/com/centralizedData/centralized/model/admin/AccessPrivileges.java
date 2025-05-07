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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="report_access_privileges")
public class AccessPrivileges implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3797667655940849779L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modules_id")
	private Module modules;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menus_id")
	private Menu menus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roles_id")
	private Roles roles;
	
	@Column(name="name")
	private String name;
	
	@Column(name="allow_access")
	private Boolean allowAccess;
	
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

}

