package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
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
import javax.persistence.OneToMany;
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
@Table(name="EXAM_revaluation")
public class ExamRevaluation implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -5412435697154201115L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition  exam;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "billNo")
	private String billNo;
	
	@Column(name = "financial_yearId")
	private Integer financialId;
	
	@Column(name = "is_feepaid")
	private Boolean isFeePaid;
	
	@Column(name = "payment_reference")
	private String paymentReference;
	
	@Column(name = "new_marks_card_no")
	private String newMarksCardNo;
	
	@Column(name = "old_marks_card_date")
	private Date oldMarksCardDate;
	
	@Column(name = "old_marks_card_no")
	private String oldMarksCardNo;	
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@OneToMany(mappedBy = "examRevaluation", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<ExamRevaluationDetails> examRevaluationDetails;

}
