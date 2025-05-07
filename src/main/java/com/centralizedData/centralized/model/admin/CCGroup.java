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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="cc_groups")
public class CCGroup implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -8003803306607858997L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="start_date")
	private Date startDate;
	
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
