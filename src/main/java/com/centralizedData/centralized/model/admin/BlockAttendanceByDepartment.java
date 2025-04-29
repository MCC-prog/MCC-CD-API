package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

import com.centralizedData.centralized.model.employee.Department;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "block_attendancentry_by_department")
public class BlockAttendanceByDepartment  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	 

		
	  @Column(name = "block_days")		
	  private String blockDays;
	  
	 @Column(name = "block_type")
	  private String blockType;
		
	 @Column(name = "created_by")
	  private String createdBy;
	 
	  @Column(name = "modified_by")
	  private String modifiedBy;
	
	  @Column(name = "created_date")
	  private Date createdDate;
	  
	  @Column(name = "is_active")
	  private Boolean isActive;
	  
	  @Column(name = "last_modified_date")
	  private Date lastModifiedDate;
	  
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "department_id")
	  private Department department;
}
