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

import com.centralizedData.centralized.model.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="consolidated_marks_verification_details")
public class ConsolidatedMarksVerificationDetails implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 6048408870970475171L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "verified_by")
	private User verifiedBy;
	
	@Column(name="created_by")
	private String createdBy ;

	@Column(name="created_date")
	private Date createdDate;

	@Column(name="last_modified_date")
	private Date lastModifiedDate;

	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="verified")
	private Boolean verified;
	
	@Column(name="verified_date")
	private Date verifiedDate;


}
