package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
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

import com.centralizedData.centralized.model.employee.Department;
import com.centralizedData.centralized.model.employee.WorkLocation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@ToString
@Table(name="course")
public class Courses implements Serializable {

	private static final long serialVersionUID = -3968067481705698438L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String courseName;

	@Column(name = "code")
	private String code;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
	private Program program;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "is_autonomous")
	private Boolean isAutonomous;

	@Column(name = "bankName")
	private String bankNameCourse;
	
	@Column(name = "bankNameFull")
	private String bankNameFullCourse;
	
	@Column(name = "bankIncludeSection")
	private Boolean bankIncludeSectionCourse;
	
	@Column(name = "max_intake")
	private Integer maxIntake;

	@Column(name = "payment_code")
	private String payCode;

	@Column(name = "amount")
	private BigDecimal amount;

	@Column(name = "is_work_exp_req")
	private Boolean isWorkExperienceRequired;

	@Column(name = "is_detail_mark_print")
	private Boolean isDetailMarksPrint;
	
	@Column(name = "course_name_certificate")
	private String courseNameCertificate;

	@Column(name = "is_work_exp_mandatory")
	private Boolean isWorkExpMandatory;

	@Column(name = "is_appear_in_online")
	private Boolean isAppearInOnline;

	@Column(name = "is_application_process_sms")
	private Boolean isApplicationProcessSms;

	@Column(name = "only_for_application")
	private Boolean onlyForApplication;

	@Column(name = "course_marks_card")
	private String courseMarksCard;

	@Column(name = "course_commencement_date")
	private Date courseCommencementDate;

	@Column(name = "intapplication_fees")
	private BigDecimal intapplicationFees;

	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	private Currency currency;

	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "work_location_id")
	private WorkLocation workLocation;

	@Column(name = "no_of_attempts_midsem")
	private Integer noOfAttemptsMidsem;

	@Column(name = "reg_no_start_prefix")
	private String regNoStartPrefix;

	@Column(name = "start_reg_no")
	private String startRegNo;

	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private DepartmentEntry department;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "cost_center_id")
	private CostCenter costCenter;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "stream_for_admission_id")
	private EmpStream empStreamForAdmission;

	@Column(name = "web_prog_id")
	private Integer webProgId;

	@Column(name = "is_interdisciplinary")
	private Boolean isInterdisciplinary;

	@Column(name = "cia_rubrics_applicable")
	private Boolean ciaRubricsApplicable;

	@Column(name = "is_second_language")
	private Boolean isSecondLanguage;

	@Column(name = "is_displaylanguage_known")
	private Boolean isDisplaylanguageKnown;

	@Column(name = "is_family_background")
	private Boolean isFamilyBackground;

	@Column(name = "is_height_weight")
	private Boolean isHeightWeight;

	@Column(name = "is_entrance_details")
	private Boolean isEntranceDetails;

	@Column(name = "is_lateral_details")
	private Boolean isLateralDetails;

	@Column(name = "is_display_trainingshort_course")
	private Boolean isDisplayTrainingshortCourse;

	@Column(name = "is_transfer_course")
	private Boolean isTransferCourse;

	@Column(name = "is_additional_info")
	private Boolean isAdditionalInfo;

	@Column(name = "is_extra_details")
	private Boolean isExtraDetails;

	@Column(name = "is_tc_display")
	private Boolean isTcDisplay;

	@Column(name = "is_open")
	private Boolean isOpen;

	@Column(name = "academic_year")
	private Integer academicYear;

	@Column(name = "is_exam_center_required")
	private Boolean isExamCenterRequired;

	@Column(name = "is_mother_tongue")
	private Boolean isMotherTongue;

	@Column(name = "status_text_submission_appln_online")
	private String statusTextSubmissionApplnOnline;

	@Column(name = "status_text_submission_appln_offline")
	private String statusTextSubmissionApplnOffline;

	@Column(name = "status_text_acknowledgement_online")
	private String statusTextAcknowledgementOnline;

	@Column(name = "status_text_acknowledgement_offline")
	private String statusTextAcknowledgementOffline;

	@Column(name = "block_mark_entry_qualifying_exam")
	private Boolean blockMarkEntryQualifyingExam;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "emp_stream_id")
//	private EmpStream empEtream;

	@Column(name = "e_admit_card_gen_acknowledgement")
	private Boolean eAdmitCardGenAcknowledgement;

	
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
    private Set<CourseApplicationOpenSession> courseApplicationOpenSessionSet;
	
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private Set<InterAdmissionSession> interAdmissionSession;
	
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private Set<CourseUniversityMarksSettings> courseUniversityMarksSettingsSet;
	
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private Set<SeatAllocation> seatAllocations = new HashSet<SeatAllocation>();
	
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
    private Set<Classes> classes;
	
}

