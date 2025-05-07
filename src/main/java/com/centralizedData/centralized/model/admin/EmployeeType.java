package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="employee_Type")
public class EmployeeType  implements Serializable{
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@OneToMany(mappedBy = "employeeTypeBO", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpWorkTime> employees = new HashSet<EmpWorkTime>(0);

}
