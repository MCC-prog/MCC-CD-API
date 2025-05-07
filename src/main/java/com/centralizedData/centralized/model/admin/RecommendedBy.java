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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="recommendor")
public class RecommendedBy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9053287254075928041L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;

	@Column(name="code")
	private String  code;
	
	@Column(name="name")
	private String name;
	

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Country country;
	
//	@Column(name="country_id")
//	private Integer CountryId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private State state;
	
//	@Column(name="state_id")
//	private Integer stateId;
	
	@Column(name="is_active")
	private Boolean isActive;


	@Column(name="created_by")
	private String createdBy;


	@Column(name="created_date")
	private Instant createdDate;

	
	@Column(name="modified_by")
	private String modifiedBy;

	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	
	@Column(name="city")
	private String city;

	
	@Column(name="comments")
	private String comments;
	
	@Column(name="address_line_1")
	private String addressLine1;
	
	@Column(name="address_line_2")
	private String addressLine2;
	
	@Column(name="line_1")
	private String line1;
	
	@Column(name="line_2")
	private String line2;
	
	@Column(name="phone")
	private String phone;

	
	
	
}
