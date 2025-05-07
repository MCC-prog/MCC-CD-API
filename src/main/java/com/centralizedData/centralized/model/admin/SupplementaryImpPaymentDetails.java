package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "supp_imp_payment_details")
public class SupplementaryImpPaymentDetails implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "reciepts_id")
	private OnlinePaymentReciepts onlinePaymentReciepts;
	
	@Column(name="is_supplementary")
	private Boolean isSupplementary;
	
	@Column(name="is_improvement")
	private Boolean isImprovement;
	
	@Column(name="is_failed_theory")
	private Boolean isFailedTheory;
	
	@Column(name="is_failed_practical")
	private Boolean isFailedPractical;
	
	@Column(name="is_appeared_theory")
	private Boolean isAppearedTheory;
	
	@Column(name="is_appeared_practical")
	private Boolean isAppearedPractical;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="fees")
	private String fees;
	
	@Column(name="chance")
	private Integer chance;
	
	@Column(name="scheme_no")
	private Integer schemeNo;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examDefinition;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@Column(name="is_theory_overall_failed")
	private boolean isTheoryOverallFailed;
	
	@Column(name="is_practical_overall_failed")
	private boolean isPracticalOverallFailed;
	
	@Column(name="is_online")
	private Boolean isOnline;
	
	@Column(name="cia_is_failed_theory")
	private Boolean isCIAFailedTheory;
	
	@Column(name="cia_is_failed_practical")
	private Boolean isCIAFailedPractical;
	
	@Column(name="cia_is_appeared_theory")
	private Boolean isCIAAppearedTheory;
	
	@Column(name="cia_is_appeared_practical")
	private Boolean isCIAAppearedPractical;
	
	@Column(name="is_cia")
	private Boolean ciaExam;
	
	@Column(name="process")
	private Boolean process;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "supp_imp_appln_id")
	private StudentSupplementaryImprovementApplication  studentSupplImpAppln;

}
