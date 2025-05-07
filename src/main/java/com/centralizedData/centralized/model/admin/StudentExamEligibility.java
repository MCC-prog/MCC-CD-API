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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="Student_Exam_Eligibility")
public class StudentExamEligibility implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "eligibility_for")
	private String eligibilityFor;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examDef;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "isCia_eligible")
	private boolean isCiaEligibile;
	
	@Column(name = "isAdmission_eligible")
	private boolean isAdmEligibile;
	
	@Column(name = "isFee_eligible")
	private boolean isFeeEligibile;
	
	@Column(name = "isLibrary_eligible")
	private boolean isLibEligible;
	
	@Column(name = "valueSubAttn_Eligibility")
	private boolean valueSubAttnEligibility;
	
	@Column(name = "is_eligible_for_Markscard")
	private boolean isMarksCardEligible;
	
	@Column(name = "cia_modifiedBy")
	private String ciaModifiedBy;
	
	@Column(name = "adm_modified_by")
	private String admModifiedBy;
	
	@Column(name = "fee_modifiedBy")
	private String feeModifiedBy;
	
	@Column(name = "lib_modified_by")
	private String libModifiedBy;
	
	@Column(name = "value_sub_modified_by")
	private String valueSubModifiedBy;
	
	@Column(name = "marks_card_modified_by")
	private String marksCardModifiedBy;	
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
//	@Column(name = "id")
//	private Boolean changeCia;
//	
//	@Column(name = "id")
//	private Boolean changeAdm;
	
//	@Column(name = "id")
//	private Boolean changeFee;
	
//	@Column(name = "id")
//	private Boolean changeLib;
	
//	@Column(name = "id")
//	private Boolean changeValueSub;
	
//	@Column(name = "id")
//	private Boolean changeMarksCard;
	
	@Column(name = "cia_modified_date")
	private Date ciaModifiedDate;
	
	@Column(name = "adm_modified_date")
	private Date admModifiedDate;
	
	@Column(name = "fee_modified_date")
	private Date feeModifiedDate;
	
	@Column(name = "lib_modified_date")
	private Date libModifiedDate;
	
	@Column(name = "value_sub_modified_date")
	private Date valueSubModifiedDate;
	
	@Column(name = "marks_card_modified_date")
	private Date marksCardModifiedDate;

}
