package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="offline_details")
public class OfflineDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7858175017415123220L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="year")
	private Integer year;

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
	
	@Column(name="date")
	private Date date;
		
	@Column(name="amount")
	private BigDecimal amount;
	
	@Column(name="receipt_no")
	private Integer receiptNo;
	
	@Column(name="appln_no")
	private Integer applnNo;
	
	@ManyToOne(cascade = CascadeType.PERSIST ,fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	

}
