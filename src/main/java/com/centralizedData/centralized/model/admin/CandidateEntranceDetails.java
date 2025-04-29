package com.centralizedData.centralized.model.admin;

import java.io.Serializable;


import java.math.BigDecimal;
import java.time.Instant;

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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="candidate_entrance_details")
public class CandidateEntranceDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3016956472471094658L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "entrance_id")
	private Entrance entrance;
	
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@Column(name="entrance_roll_no")
	private String entranceRollNo;
	
	@Column(name="year_passing")
	private Integer yearPassing;
	
	@Column(name="month_passing")
	private Integer monthPassing;
	
	@Column(name="mark_obtained")
	private BigDecimal marksObtained;
	
	@Column(name="total_marks")
	private BigDecimal totalMarks;


}
