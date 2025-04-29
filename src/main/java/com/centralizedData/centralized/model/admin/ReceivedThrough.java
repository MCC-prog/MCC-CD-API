package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="received_through")
public class ReceivedThrough implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 486072410362905412L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="received_through")
    private String receivedThrough;
	
	@Column(name="slip_required")
    private Boolean slipRequired;
	
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
