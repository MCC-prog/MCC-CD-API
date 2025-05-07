package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

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

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EXAM_student_detention_rejoin_details")
public class ExamStudentDetentionRejoinDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3336347232040646100L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name="register_no")
	private String registerNo;
	
	
	@Column(name="batch")
	private String batch;
	
	@Column(name="detain")
	private Boolean detain;
	
	@Column(name="detention_date")
	private Date detentionDate;
	
	@Column(name="detention_reason")
	private String detentionReason;
	
	@Column(name="discontinued")
	private Boolean discontinued;
	
	@Column(name="discontinued_date")
	private Date discontinuedDate;
	
	@Column(name="discontinue_reason")
	private String discontinueReason;
	
	@Column(name="rejoin")
	private Boolean rejoin;
	
	@Column(name="rejoin_date")
	private Date rejoinDate;
	
	@Column(name="rejoin_reason")
	private String rejoinReason;
	
	@Column(name="scheme_no")
	private Integer schemeNo;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_schemewise_id")
	private ClassSchemewise classSchemewise;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "rejoin_class_schemewise_id")
	private ClassSchemewise rejoinClassSchemewise;
	


}
