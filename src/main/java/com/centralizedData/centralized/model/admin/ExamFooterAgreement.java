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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_footer_agreement")
public class ExamFooterAgreement implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -4697215209797472023L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType programType;
	
	@Column(name="name")
	private String name;
	
	@Column(name="is_agreement")
	private Boolean isAgreement;
	
	@Column(name="is_footer")
	private Boolean isFooter;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="hall_tkt_or_marks_card")
	private char hallTktOrMarksCard;

}
