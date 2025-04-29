package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="adm_appln")
public class AdmAppln implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3209421350222141091L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "appln_no")
	private Integer applnNo;
	
	@Column(name = "challan_ref_no")
	private String challanRefNo;
	
	@Column(name = "journal_no")
	private String journalNo;	
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "amount")
	private Double amount;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "personal_data_id")
	private PersonalData personalData;
	
	@Column(name = "is_selected")
	private Boolean isSelected;
	
	@Column(name = "is_interview_selected")
	private Boolean isInterviewSelected;
	
	@Column(name = "applied_year")
	private Integer appliedYear;
	
	@Column(name = "total_weightage")
	private Integer totalWeightage;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "admitted_through_id")
	private AdmittedThrough admittedThrough;
	
	@Column(name = "bank_branch")
	private String bankBranch;
	
	@Column(name = "weightage_adjusted_marks")
	private Integer weightageAdjustedMarks;
	
	@Column(name = "remarks")
	private String remarks;
	
	@Column(name = "is_cancelled")
	private Boolean isCancelled;
	
	@Column(name = "cancel_remarks")
	private String cancelRemarks;
	
	@Column(name = "is_FreeShip")
	private Boolean isFreeShip;
	
	@Column(name = "is_approved")
	private Boolean isApproved;
	
	@Column(name = "approval_remark")
	private String approvalRemark;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "selected_course_id")
	private Courses courses1;
	
	@Column(name = "tc_no")
	private String tcNo;
	
	@Column(name = "tc_date")
	private LocalDate tcDate;
	
	@Column(name = "marks_card_no")
	private String marksCardNo;
	
	@Column(name = "marks_card_date")
	private LocalDate marksCardDate;
	
	@Column(name = "is_bypassed")
	private Boolean isBypassed;
	
	@Column(name = "admission_date")
	private Date admissionDate;
	
	@Column(name = "is_final_merit_approved")
	private Boolean isFinalMeritApproved;

	@Column(name = "is_preference_updated")
	private Boolean isPreferenceUpdated;
	
	@Column(name = "is_lig")
	private Boolean isLig;
	
	@Column(name = "adm_status")
	private String admStatus;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_center_id")
	private ExamCenter examCenter;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_schedule_id")
	private InterviewSelectionSchedule interviewSelectionSchedule;
	
	@Column(name = "seat_no")
	private String seatNo;
	
	@Column(name = "verifiedBy")
	private String verifiedBy;

	@Column(name = "cancel_date")
	private LocalDate cancelDate;
	
	@Column(name = "reference_no")
	private Integer referenceNo;
	
	@Column(name = "final_meritList_approve_date")
	private LocalDate finalMeritListApproveDate;
	
	@Column(name = "course_change_date")
	private LocalDate courseChangeDate;
	
	@Column(name = "is_challan_verified")
	private Boolean isChallanVerified;
	
	@Column(name = "mode")
	private String mode;
	
	@Column(name = "dd_drawn_on")
	private String ddDrawnOn;
	
	@Column(name = "dd_issuing_bank")
	private String ddIssuingBank;
	
	@Column(name = "is_waitlisted")
	private Boolean isWaitlisted;
	
	@Column(name = "is_not_selected")
	private Boolean isNotSelected;
	
//	@Column(name = "interview_schedule_id")
//	private Integer interviewScheduleId;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "admitted_course_id")
	private Courses admittedCourseId;
	
	@Column(name = "is_aided")
	private Boolean isAided;
	
	@Column(name = "fee_amount_paid")
	private Integer feeAmountPaid;
	
//	@Column(name = "unique_id")
//	private Integer uniqueId;
	
//	@Column(name = "intr_session_details_id")
//	private Integer intrSessionDetailsId;
	
	@Column(name = "is_draft_cancelled")
	private Boolean isDraftCancelled;
	
	@Column(name = "current_page_name")
	private String currentPageName;
	
	@Column(name = "bypass_remarks")
	private String bypassRemarks;
	
	@Column(name = "is_draft_mode")
	private  Boolean isDraftMode;
	
	@Column(name = "adm_year")
	private Integer admYear;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "unique_id")
	private StudentOnlineApplication studentOnlineApplication;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "intr_session_details_id")
	private InterdiscipSessionDetails intrSessionDetails;
	
//	@Column(name = "applied_under_nri") intrSessionDetails
//	private Integer appliedUnderNri;
//	
//	@Column(name = "final_merit_list_approve_date")
//	private LocalDate finalMeritListApproveDate1;
//	
//	@Column(name = "is_free_ship")
//	private Integer is_free_ship;
//	
//	@Column(name = "is_withdrawn")
//	private Integer is_withdrawn;
//	
//	@Column(name = "lateral_applied_year")
//	private Integer lateralAppliedYear;
//	
//	@Column(name = "paytm_order_id")
//	private String paytmOrderId;
//	
//	@Column(name = "pio_or_oci")
//	private Integer pioOrOci;
//	
//	@Column(name = "reattempted_order_id")
//	private String reattemptedOrderId;
//	
//	@Column(name = "verified_by")
//	private String verifiedBy1;
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<ApplnDoc> applnDocs;
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<Student> students = new HashSet<Student>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<ApplicantSubjectGroup> applicantSubjectGroups = new HashSet<ApplicantSubjectGroup>();

	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<CandidatePreference> candidatePreferences = new HashSet<CandidatePreference>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<StudentVehicleDetails> studentVehicleDetailses = new HashSet<StudentVehicleDetails>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<CandidatePrerequisiteMarks> candidatePrerequisiteMarks = new HashSet<CandidatePrerequisiteMarks>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<AdmApplnAdditionalInfo> admapplnAdditionalInfo= new HashSet<AdmApplnAdditionalInfo>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<CandidateEntranceDetails> candidateEntranceDetailses = new HashSet<CandidateEntranceDetails>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<ApplicantLateralDetails> applicantLateralDetailses = new HashSet<ApplicantLateralDetails>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<ApplicantTransferDetails> applicantTransferDetailses = new HashSet<ApplicantTransferDetails>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<ApplicantWorkExperience> applicantWorkExperiences = new HashSet<ApplicantWorkExperience>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<StudentQualifyexamDetail> studentQualifyexamDetails = new HashSet<StudentQualifyexamDetail>();
	
	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL)
	private Set<StudentSpecializationPrefered> studentSpecializationPrefered = new HashSet<StudentSpecializationPrefered>();
	
	
//	@OneToMany(cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<ApplnDoc> applnDocs;

	
}
