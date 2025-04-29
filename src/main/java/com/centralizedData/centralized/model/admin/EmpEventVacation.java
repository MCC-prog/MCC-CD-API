package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="emp_event_vacation")
public class EmpEventVacation implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="type")
	private String type;
	
	@OneToMany(mappedBy = "empEventVacation", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpEventVacationDepartment> empEventVacationDepartment= new  HashSet<EmpEventVacationDepartment>();
	
	@Column(name="to_date")
	private Date toDate;
	
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="is_teaching_staff")
	private Boolean teachingStaff;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stream_id")
	private EmployeeStream stream;

}
