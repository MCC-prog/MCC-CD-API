package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="emp_remark")
public class EmpRemarks implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8707712504410489695L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "date")
	private Date remarksDate;
	
	@Column(name = "remarks")
	private String remarksDetails;
	
	@Column(name = "entered_by")
	private String remarksEnteredBy;
	
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

}
