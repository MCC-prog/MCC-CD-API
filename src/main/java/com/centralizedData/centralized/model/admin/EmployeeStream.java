package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "emp_stream")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EmployeeStream  implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2326256740976132521L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "created_by")
	private String createdBy;;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "display_name")
	private String displayName;
	
	@Column(name = "display_in_online_application")
	private Boolean displayInOnlineApplication;
}
