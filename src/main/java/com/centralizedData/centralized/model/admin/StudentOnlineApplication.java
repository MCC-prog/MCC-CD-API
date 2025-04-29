package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="unique_id")
public class StudentOnlineApplication implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -1599603053175659370L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="created_by")
	private String createdBy;
		
	@Column(name="created_date")
	private Instant createdDate;
		
	@Column(name="modified_by")
	private String modified_by;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="email_id")
	private String emailId;
		
	@Column(name="mobile_no")
	private String mobileNo;
		
	@Column(name="date_of_birth")
	private Date dateOfBirth;
		
	@Column(name="unique_id")
	private String uniqueId;	
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="is_logged_in")
	private Boolean isLoggedIn;
	
	@Column(name="last_logged_in")
	private Date lastLoggedIn;
	
}
