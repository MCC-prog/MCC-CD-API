package com.centralizedData.centralized.model.admin;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="student")
public class Student implements java.io.Serializable,Comparable<Student>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7610385822096419830L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_appln_id")
	private AdmAppln admAppln;
	
	@Column(name="created_by")
	private String createdBy;
		
	@Column(name="created_date")
	private Instant createdDate;
		
	@Column(name="modified_by")
	private String modified_by;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name = "is_admitted")
	private Boolean isAdmitted;
	
	@Column(name = "roll_no")
	private String rollNo;
	
	@Column(name = "register_no")
	private String registerNo;
	
	@Column(name = "is_current")
	private Boolean isCurrent;
	
	@Column(name = "is_exam_eligible")
	private Boolean isExamEligible;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "class_schemewise_id")
	private ClassSchemewise classSchemewise;
	
	@Column(name = "programType_sl_no")
	private Integer programTypeSlNo;
	
	@Column(name = "exam_register_no")
	private String examRegisterNo;
	
	@Column(name = "student_no")
	private String studentNo;
	
	@Column(name = "tc_no")
	private String tcNo;
	
	@Column(name = "mc_no")
	private String mcNo;
	
	@Column(name = "tc_date")
	private LocalDate tcDate;
	
	@Column(name = "tc_sl_no")
	private String tcSlNo;
	
	@Column(name = "bank_acc_No")
	private String bankAccNo;
	
	@Column(name = "tc_type")
	private String tcType;
	
	@Column(name = "is_hide")
	private Boolean isHide;
	
	@Column(name = "hide_date")
	private LocalDate  hideDate;
	
	@Column(name = "hide_reason")
	private String hideReason;
	
	@Column(name = "proforma")
	private Boolean proforma;
	
	@Column(name = "puc_college_code")
	private String pucCollegeCode;
	
	@Column(name = "year_of_pass")
	private String yearOfPass;
	
	@Column(name = "smart_card_no")
	private String smartCardNo;
	
	@Column(name = "is_sc_data_generated")
	private Boolean isScDataGenerated;
	
	@Column(name = "is_sc_data_delivered")
	private Boolean isScDataDelivered;
	
	@Column(name = "admission_no")
	private String admissionNo;
	
	@Column(name = "admission_month")
	private Integer admission_month;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<StudentLogin> studentLogins = new HashSet<StudentLogin>();
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<StudentPreviousClassHistory> studentPreviousClassesHistory=new HashSet<StudentPreviousClassHistory>();
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<StudentSubjectGroupHistory> studentSubjectGroupHistory=new HashSet<StudentSubjectGroupHistory>();
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<ExamStudentBioData> examStudentBioDataBOSet = new HashSet<ExamStudentBioData>(0);

	@Override
	public int compareTo(Student other) {
		if(other!=null && this!=null && other.getRegisterNo()!=null && this.getRegisterNo()!=null){
			return this.getRegisterNo().compareTo(other.getRegisterNo());
		}else
		return 0;
	}	
	
}
