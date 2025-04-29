package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.centralizedData.centralized.model.admin.AdmApplnAdditionalInfo;
import com.centralizedData.centralized.model.admin.ApplicantLateralDetails;
import com.centralizedData.centralized.model.admin.ApplicantTransferDetails;
import com.centralizedData.centralized.model.admin.CandidatePreference;
import com.centralizedData.centralized.model.admin.CandidatePrerequisiteMarks;
import com.centralizedData.centralized.model.admin.Student;
import com.centralizedData.centralized.model.admin.StudentQualifyexamDetail;
import com.centralizedData.centralized.model.admin.StudentSpecializationPrefered;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdmApplnNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8798613183407109423L;

	private Long id;
	  
	private PersonalDataDto personalData;
	private long personalDataid;
	private CourseNewDto course;
	private CourseNewDto selectedCourse;
	private int applnNo;
	private String challanRefNo;
	private String journalNo;
	private String bankBranch;
	private Instant createdDate;
	private String createdBy;
	private Instant lastModifiedDate;
	private Date date;
	private String amount;
	private Boolean isSelected;
	private Boolean isBypassed;
	private Boolean isApproved;
	private Boolean isInterviewSelected;
	private Integer appliedYear;
	private Set<Student> students = new HashSet<Student>();
	private List<String> originalList;
	private List<String> pendingDocList;
	private long applicationId;
	private List<EdnQualificationDto> ednQualificationList;
	private PreferenceDto preference;
	private List<ApplnDocDto> documentsList;
	private List<ApplnDocDto> editDocuments;
	private List<InterviewResultDto> interviewResultList;
	private String challanDate;
	private Set<InterviewSelectedDto> interviewSelecteds = new HashSet<InterviewSelectedDto>(
			0);
	private StudentVehicleDetailsDto vehicleDetail;
	private String totalWeightage;
	private String weightageAdjustMark;
	private String admittedThroughId;
	private String admittedThroughName;
	private String[] subjectGroupIds;
	private String subjectGroupNames;
	List<ApplicantWorkExperienceDto> workExpList = null;
	//private List<ApplicantSubjectGroupDto> applicantSubjectGroups;
	private String photoPath;
	private String remark;
	private String approvalRemark;
	private Boolean isCancelled;
	private Boolean isFreeShip;
	// added by smitha for challan verification
	private Boolean isChallanVerified;
	private Boolean isLIG;
	private Boolean isFinalMeritApproved;
	private String markscardDate;
	private String tcDate;
	private String tcNo;
	private String tcType;
	private String markscardNo;
	private Boolean hidedetailsRadio;
	private String hidedetailsDate;
	private String hidedetailReasons;
	private Boolean proforma;
	private String collegeCode;
	private String yearOfPass;
	private String courseChangeDate;
	private String admStatus;
	private Boolean isHide;
	private Boolean backLogs;
	private Boolean isWaiting;
	private Boolean notSelected;
	private String interviewSelectionScheduleId;
	private int studentId;
	private CourseNewDto admittedCourse;
	private Boolean isAided;
	private Set<CandidatePrerequisiteMarks> candidatePrerequisiteMarks = new HashSet<CandidatePrerequisiteMarks>();
	private CandidateEntranceDetailsDto entranceDetail;
	private List<ApplicantLateralDetailsDto> lateralDetails;
	private List<ApplicantTransferDetailsDto> transferDetails;
	
	
	
//	private List<ApplicantWorkExperienceTO> workExperienceList;
	
	
	private List<CandidatePrerequisiteMarksDto> prerequisiteTos;
	
	
	
	private Set<ApplicantLateralDetails> lateralDetailBos = new HashSet<ApplicantLateralDetails>();

	private Set<ApplicantTransferDetails> transferDetailBos = new HashSet<ApplicantTransferDetails>();
	
	private Boolean displaySecondLanguage;
	private Boolean displayExtraDetails;
	private Boolean displayMotherTongue;
	private Boolean displayHeightWeight;
	private Boolean displayLanguageKnown;
	private Boolean displayTrainingDetails;
	private Boolean displayAdditionalInfo;
	private Boolean displayExtracurricular;
	private Boolean displayTCDetails;
	private Boolean displayFamilyBackground;
	private Boolean displayLateralDetails;
	private Boolean displayTransferDetails;
	private Boolean displayLateralTransfer;
	private StudentQualifyExamDetailsDto qualifyDetailsTo;
	private Set<StudentQualifyexamDetail> originalQualDetails;
	private Set<CandidatePreference> originalPreferences;
	
	private String admissionDate;
	private Long examCenterId;
	private String examCenterName;
	private Long commonSubjectId;
	private String interviewDate;
	private String verifiedBy;
	private String submissionDate;
	private String status;
	private String shortStatus;
	private String studentTcNo;
	private String studentTcDate;
	private String studentTcType;
	private Map<Long,Long> subIdMap;
	private String mode;
	//added for canceledAdmissionRepayment option
	private String admissionCancelDate;
	private String admissionCancelRemarks;
	private String studentName;
	private String courseName;
	private String regNo;
	private Set<StudentSpecializationPrefered> studentSpecializationPrefered;
	private Set<AdmApplnAdditionalInfo> admapplnAdditionalInfos;
	private String ddDrawnOn;
	private String ddIssuingBank;
	private Boolean ddPayment;
	private Boolean onlinePayment;
	private Boolean challanPayment;
	
	private Boolean isPreferenceUpdated;
	private String seatNo;
	private LocalDate finalMeritListApproveDate;
	private String preRequisiteObtMarks;
	private String preRequisiteRollNo;
	private String preRequisiteExamYear;
	private String preRequisiteExamMonth;
	private String applicantFeedbackId;
	private String titleOfFather;
	private String titleOfMother;
	private String internationalCurrencyId;
	private Boolean hasWorkExp;
	private Boolean isComeDk;
	private String commSentTo;
	private String entranceDate;
	private String entranceVenue;
	private String entranceTime;
	private String preRequisiteExamMonthDisplay;
	private Boolean isDraftMode;
	private Boolean isDraftCancelled;
	private String assignedDateForAdmissionCJC;
	private String interSessionDetails;
	private String uniqueId;
	private String interSessionName;
	private String currentPageName;
	private long StudentOnlineApplicationId;
	private String bypassRemarks;
	
}
