package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="applicant_transfer_details")
public class ApplicantTransferDetails implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -218150195203538057L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@Column(name="semester_name")
	private String semesterName;
	
	@Column(name="max_marks")
	private BigDecimal maxMarks;
	
	@Column(name="min_marks")
	private BigDecimal minMarks;
	
	@Column(name="marks_obtained")
	private BigDecimal marksObtained;
	
	@Column(name="year_pass")
	private Integer yearPass;
	
	@Column(name="semester_no")
	private Integer semesterNo;
	
	@Column(name="month_pass")
	private Integer monthPass;
	
	@Column(name="university_app_no")
	private String universityAppNo;
	
	@Column(name="registation_no")
	private String registationNo;
	
	@Column(name="arrear_detail")
	private String arrearDetail;
	
	@Column(name="institute_addr")
	private String instituteAddr;

}
