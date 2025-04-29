package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="exam_center")
public class ExamCenter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5530313175981171551L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
	private Program program;
	
//	@Column(name="name")
//	private String name;
	
	@Column(name="center")
	private String center;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="createdby")
	private String createdBy;
	
	@Column(name="modifiedby")
	private String modifiedBy;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="seat_no_from")
	private Integer seatNoFrom;
	
	@Column(name="seat_no_to")
	private Integer seatNoTo;
	
	@Column(name="current_seat_no")
	private Integer currentSeatNo;
	
	@Column(name="seat_no_prefix")
	private String seatNoPrefix;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="address_2")
	private String address2;

	@Column(name="address_3")
	private String address3;
	
	@Column(name="address_4")
	private String address4;
	
	
}
