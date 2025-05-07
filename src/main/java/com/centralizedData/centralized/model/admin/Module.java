package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "modules")
public class Module implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4185824797528914067L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "display_name")
	private String displayName;
	
	@Column(name = "position")
	private Integer position;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
//	private Set<AccessPrivileges> accessPrivilegeses = new HashSet<AccessPrivileges>(
//	0);
//	@OneToMany( cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<Menu> menu;	
	
	@OneToMany(mappedBy = "module", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Menu> menuses = new HashSet<Menu>(0);
	
}
