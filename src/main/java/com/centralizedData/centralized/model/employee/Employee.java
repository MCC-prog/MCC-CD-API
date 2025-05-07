package com.centralizedData.centralized.model.employee;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

import com.centralizedData.centralized.model.admin.Country;
import com.centralizedData.centralized.model.admin.Designation;
import com.centralizedData.centralized.model.admin.EmpAcheivement;
import com.centralizedData.centralized.model.admin.EmpDependents;
import com.centralizedData.centralized.model.admin.EmpEducationalDetails;
import com.centralizedData.centralized.model.admin.EmpFeeConcession;
import com.centralizedData.centralized.model.admin.EmpFinancial;
import com.centralizedData.centralized.model.admin.EmpImages;
import com.centralizedData.centralized.model.admin.EmpImmigration;
import com.centralizedData.centralized.model.admin.EmpIncentives;
import com.centralizedData.centralized.model.admin.EmpJobTitle;
import com.centralizedData.centralized.model.admin.EmpLeave;
import com.centralizedData.centralized.model.admin.EmpLoan;
import com.centralizedData.centralized.model.admin.EmpPayAllowanceDetails;
import com.centralizedData.centralized.model.admin.EmpPreviousExperience;
import com.centralizedData.centralized.model.admin.EmpRemarks;
import com.centralizedData.centralized.model.admin.EmpType;
import com.centralizedData.centralized.model.admin.EmpWorkLocation;
import com.centralizedData.centralized.model.admin.EmployeeStream;
import com.centralizedData.centralized.model.admin.EmployeeWorkLocation;
import com.centralizedData.centralized.model.admin.Nationality;
import com.centralizedData.centralized.model.admin.PayScale;
import com.centralizedData.centralized.model.admin.PfGratuityNominees;
import com.centralizedData.centralized.model.admin.QualificationLevel;
import com.centralizedData.centralized.model.admin.Religion;
import com.centralizedData.centralized.model.admin.State;
import com.centralizedData.centralized.model.admin.SubjectArea;
import com.centralizedData.centralized.model.user.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Employee implements Serializable{

	private static final long serialVersionUID = 2461942331128420380L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long employeeId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private LocalDateTime lastModifiedDate;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "doj")
	private Date doj;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "designation_id")
	private Designation designation;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nationality_id")
	private Nationality nationality;

	@Column(name = "permanent_address_line_1")
	private String permanentAddressLine1;

	@Column(name = "permanent_address_line_2")
	private String permanentAddressLine2;

	@Column(name = "permanent_address_city")
	private String permanentAddressCity;

	@Column(name = "permanent_address_zip")
	private String permanentAddressZip;

	@Column(name = "communication_address_line_1")
	private String communicationAddressLine1;

	@Column(name = "communication_address_line_2")
	private String communicationAddressLine2;

	@Column(name = "communication_address_city")
	private String communicationAddressCity;

	@Column(name = "communication_address_zip")
	private String communicationAddressZip;

	@Column(name = "email")
	private String email;
	
	@Column(name = "designation")
	private String designationName;
	
	@Column(name = "previously_working")
	private Boolean currentlyWorking;
	
	@Column(name = "current_organisation")
	private String organistionName;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "communication_address_state_others")
	private String communicationAddressStateOthers;

	@Column(name = "permanent_address_state_others")
	private String permanentAddressStateOthers;

	@Column(name = "code")
	private String code;

	@Column(name = "marital_status")
	private String maritalStatus;

	@Column(name = "gender")
	private String gender;

	@Column(name = "emergency_cont_name")
	private String emergencyContName;

	@Column(name = "relationship")
	private String relationship;

	
	
	@Column(name = "emergency_mobile")
	private String emergencyMobile;

	@Column(name = "emergency_home_telephone")
	private String emergencyHomeTelephone;

	@Column(name = "emergency_work_telephone")
	private String emergencyWorkTelephone;

	@Column(name = "work_email")
	private String workEmail;

	@Column(name = "other_email")
	private String otherEmail;

	@Column(name = "uid")
	private String uid;

	@Column(name = "pan_no")
	private String panNo;

	@Column(name = "current_address_home_telephone1")
	private String currentAddressHomeTelephone1;

	@Column(name = "current_address_home_telephone2")
	private String currentAddressHomeTelephone2;

	@Column(name = "current_address_home_telephone3")
	private String currentAddressHomeTelephone3;

	@Column(name = "current_address_work_telephone1")
	private String currentAddressWorkTelephone1;

	@Column(name = "current_address_work_telephone2")
	private String currentAddressWorkTelephone2;

	@Column(name = "current_address_work_telephone3")
	private String currentAddressWorkTelephone3;

	@Column(name = "current_address_mobile1")
	private String currentAddressMobile1;

	@Column(name = "grade")
	private String grade;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "fingerPrintId")
	private String fingerPrintId;

	@Column(name = "mother_Name")
	private String motherName;


	@Column(name = "display_in_website")
	private Boolean displayInWebsite;

//	@Column(name = "previously_working")
//	private Boolean previouslyWorking;

//	@Column(name = "designation")
//	private String motherDesignation;

	@Column(name = "eligibility_test_other")
	private String eligibilityTestOther;

	@Column(name = "eligibility_test")
	private String eligibilityTest;

	@Column(name = "industry_functional_area")
	private String industryFunctionalArea;

	@Column(name = "lic_gratuity_no")
	private String licGratuityNo;

	@Column(name = "pf_no")
	private String nomineePfNo;

	@Column(name = "lic_gratuity_date")
	private Date licGratuityDate;

	@Column(name = "pf_date")
	private Date nomineePfDate;

	@Column(name = "date_of_resignation")
	private Date dateOfResignation;

	@Column(name = "date_of_leaving")
	private Date dateOfLeaving;

	@Column(name = "reason_of_leaving")
	private String reasonOfLeaving;

	@Column(name = "reservation_category")
	private String reservationCategory;

	@Column(name = "handicap_description")
	private String handicappedDescription;



	

	

	@Column(name = "books")
	private String books;

	@Column(name = "scale")
	private String scale;

	@Column(name = "gross_pay")
	private String grossPay;

	@Column(name = "retirement_date")
	private Date retirementDate;

	@Column(name = "rejoin_date")
	private Date rejoinDate;

	@Column(name = "time_in")
	private String timeIn;

	@Column(name = "time_in_ends")
	private String timeInEnds;

	@Column(name = "time_out")
	private String timeOut;

	@Column(name = "saturday_time_out")
	private String saturdayTimeOut;

	@Column(name = "half_day_start_time")
	private String halfDayStartTime;

	@Column(name = "half_day_end_time")
	private String halfDayEndTime;

	@Column(name = "two_wheeler_no")
	private String twoWheelerNo;

	@Column(name = "four_wheeler_no")
	private String fourWheelerNo;
	
	
	

	@Column(name = "bank_account_no")
	private String bankAccNo;

	@Column(name = "pf_number")
	private String pfNo;
	
	

	@Column(name = "emp_teaching_staff")
	private Boolean teachingStaff;

	@Column(name = "is_punching_exemption")
	private Boolean isPunchingExcemption;

	@Column(name = "is_same_address")
	private Boolean isSameAddress;

	@Column(name = "total_experience_year")
	private String totalExpYear;

	@Column(name = "total_experience_month")
	private String totalExpMonths;

	@Column(name = "relevant_experience_month")
	private String relevantExpMonths;

	@Column(name = "relevant_experience_year")
	private String relevantExpYears;

	@Column(name = "other_info")
	private String otherInfo;

	@Column(name = "emergency_address")
	private String emContactAddress;

	@Column(name = "smart_card_no")
	private String smartCardNo;

	@Column(name = "is_sc_data_generated")
	private Boolean isSCDataGenerated;

	@Column(name = "is_sc_data_delivered")
	private Boolean isSCDataDelivered;

	@Column(name = "is_SendSms")
	private Boolean isSendSms;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_type_id")
	private EmpType emptype;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "album_designation_id")
	private Designation albumDesignation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_title_id")
	private EmpJobTitle titleId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "religion")
	private Religion religionId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_stream_id")
	private EmployeeStream streamId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_Work_Location_id")
	private EmployeeWorkLocation workLocationId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "communication_address_country_id")
	private Country countryByCommunicationAddressCountryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "communication_address_state_id")
	private State stateByCommunicationAddressStateId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "permanent_address_country_id")
	private Country countryByPermanentAddressCountryId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_qualification_level")
	private QualificationLevel empQualificationLevel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pay_scale_grade_id")
	private PayScale payScaleId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_area_id")
	private SubjectArea empSubjectArea;
	
	@Column(name = "publications_refered")
	private String noOfPublicationsRefered;
	
	
	@Column(name = "publications_not_refered")
	private String noOfPublicationsNotRefered;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "permanent_address_state_id")
	private State stateByPermanentAddressStateId;
	
	@Column(name = "highest_qualification")
	private String highQualifForAlbum;

//	@Column(name = "current_organisation")
//	private String currentOrganisation;
	
	@Column(name = "extension_Number")
	private String extensionNumber;

	@Column(name = "research_papers_refereed")
	private Integer researchPapersRefereed;

	@Column(name = "research_papers_non_refereed")
	private Integer researchPapersNonRefereed;

	@Column(name = "research_papers_proceedings")
	private Integer researchPapersProceedings;

	@Column(name = "international_book_publications")
	private Integer internationalBookPublications;

	@Column(name = "national_book_publications")
	private Integer nationalBookPublications;

	@Column(name = "local_book_publications")
	private Integer localBookPublications;

	@Column(name = "chapters_edited_books_national")
	private Integer chaptersEditedBooksNational;

	@Column(name = "minor_sponsered_projects")
	private Integer minorSponseredProjects;

	@Column(name = "consultancy1_sponsered_projects")
	private Integer consultancy1SponseredProjects;

	@Column(name = "consultancy2_sponsered_projects")
	private Integer consultancy2SponseredProjects;

	@Column(name = "phd_research_guidance")
	private Integer phdResearchGuidance;

	@Column(name = "mphil_research_guidance")
	private Integer mphilResearchGuidance;

	@Column(name = "training_attended_fdp_1week")
	private Integer trainingAttendedFdp1Weeks;

	@Column(name = "major_sponsered_projects")
	private Integer majorSponseredProjects;

	@Column(name = "international_conference_presentation")
	private Integer internationalConferencePresentaion;

	@Column(name = "national_conference_presentation")
	private Integer nationalConferencePresentaion;

	@Column(name = "regional_conference_presentation")
	private Integer regionalConferencePresentaion;

	@Column(name = "local_conference_presentation")
	private Integer localConferencePresentaion;

	@Column(name = "training_attended_fdp_2weeks")
	private Integer trainingAttendedFdp2Weeks;

	@Column(name = "appointment_letter_date")
	private Date appointmentLetterDate;

	@Column(name = "appointment_reference_number")
	private String referenceNumberForAppointment;

	@Column(name = "releaving_order_date")
	private Date releavingOrderDate;

	@Column(name = "releaving_reference_number")
	private String referenceNubmerforReleaving;

	@Column(name = "additional_remarks")
	private String additionalRemarks;

	@Column(name = "chapters_edited_books_international")
	private Integer chaptersEditedBooksInternational;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deputation_department_id")
	private Department deputationToDepartmentId;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<User> userses = new HashSet<User>(0);
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpLoan> empLoan = new HashSet<EmpLoan>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpFinancial> empFinancial = new HashSet<EmpFinancial>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpFeeConcession> empFeeConcession = new HashSet<EmpFeeConcession>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpIncentives> empIncentives = new HashSet<EmpIncentives>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpRemarks> empRemarks = new HashSet<EmpRemarks>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpImmigration> empImmigrations = new HashSet<EmpImmigration>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpDependents> empDependentses = new HashSet<EmpDependents>(0);
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<PfGratuityNominees> pfGratuityNominees = new HashSet<PfGratuityNominees>(0);
	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpAcheivement> empAcheivements = new HashSet<EmpAcheivement>(0);
	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpPayAllowanceDetails> empPayAllowance = new HashSet<EmpPayAllowanceDetails>();
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpLeave> empLeaves = new HashSet<EmpLeave>();
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpImages> empImages = new HashSet<EmpImages>();
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpPreviousExperience> previousExpSet = new HashSet<EmpPreviousExperience>();
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpEducationalDetails> educationalDetailsSet = new HashSet<EmpEducationalDetails>();

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", lastModifiedDate=" + lastModifiedDate + ", dob=" + dob + ", doj="
				+ doj + ", designation=" + designation + ", nationality=" + nationality + ", permanentAddressLine1="
				+ permanentAddressLine1 + ", permanentAddressLine2=" + permanentAddressLine2 + ", permanentAddressCity="
				+ permanentAddressCity + ", permanentAddressZip=" + permanentAddressZip + ", communicationAddressLine1="
				+ communicationAddressLine1 + ", communicationAddressLine2=" + communicationAddressLine2
				+ ", communicationAddressCity=" + communicationAddressCity + ", communicationAddressZip="
				+ communicationAddressZip + ", email=" + email + ", designationName=" + designationName
				+ ", currentlyWorking=" + currentlyWorking + ", organistionName=" + organistionName + ", fatherName="
				+ fatherName + ", bloodGroup=" + bloodGroup + ", communicationAddressStateOthers="
				+ communicationAddressStateOthers + ", permanentAddressStateOthers=" + permanentAddressStateOthers
				+ ", code=" + code + ", maritalStatus=" + maritalStatus + ", gender=" + gender + ", emergencyContName="
				+ emergencyContName + ", relationship=" + relationship + ", emergencyMobile=" + emergencyMobile
				+ ", emergencyHomeTelephone=" + emergencyHomeTelephone + ", emergencyWorkTelephone="
				+ emergencyWorkTelephone + ", workEmail=" + workEmail + ", otherEmail=" + otherEmail + ", uid=" + uid
				+ ", panNo=" + panNo + ", currentAddressHomeTelephone1=" + currentAddressHomeTelephone1
				+ ", currentAddressHomeTelephone2=" + currentAddressHomeTelephone2 + ", currentAddressHomeTelephone3="
				+ currentAddressHomeTelephone3 + ", currentAddressWorkTelephone1=" + currentAddressWorkTelephone1
				+ ", currentAddressWorkTelephone2=" + currentAddressWorkTelephone2 + ", currentAddressWorkTelephone3="
				+ currentAddressWorkTelephone3 + ", currentAddressMobile1=" + currentAddressMobile1 + ", grade=" + grade
				+ ", isActive=" + isActive + ", active=" + active + ", fingerPrintId=" + fingerPrintId + ", motherName="
				+ motherName + ", displayInWebsite=" + displayInWebsite + ", eligibilityTestOther="
				+ eligibilityTestOther + ", eligibilityTest=" + eligibilityTest + ", industryFunctionalArea="
				+ industryFunctionalArea + ", licGratuityNo=" + licGratuityNo + ", nomineePfNo=" + nomineePfNo
				+ ", licGratuityDate=" + licGratuityDate + ", nomineePfDate=" + nomineePfDate + ", dateOfResignation="
				+ dateOfResignation + ", dateOfLeaving=" + dateOfLeaving + ", reasonOfLeaving=" + reasonOfLeaving
				+ ", reservationCategory=" + reservationCategory + ", handicappedDescription=" + handicappedDescription
				+ ", books=" + books + ", scale=" + scale + ", grossPay=" + grossPay + ", retirementDate="
				+ retirementDate + ", rejoinDate=" + rejoinDate + ", timeIn=" + timeIn + ", timeInEnds=" + timeInEnds
				+ ", timeOut=" + timeOut + ", saturdayTimeOut=" + saturdayTimeOut + ", halfDayStartTime="
				+ halfDayStartTime + ", halfDayEndTime=" + halfDayEndTime + ", twoWheelerNo=" + twoWheelerNo
				+ ", fourWheelerNo=" + fourWheelerNo + ", bankAccNo=" + bankAccNo + ", pfNo=" + pfNo
				+ ", teachingStaff=" + teachingStaff + ", isPunchingExcemption=" + isPunchingExcemption
				+ ", isSameAddress=" + isSameAddress + ", totalExpYear=" + totalExpYear + ", totalExpMonths="
				+ totalExpMonths + ", relevantExpMonths=" + relevantExpMonths + ", relevantExpYears=" + relevantExpYears
				+ ", otherInfo=" + otherInfo + ", emContactAddress=" + emContactAddress + ", smartCardNo=" + smartCardNo
				+ ", isSCDataGenerated=" + isSCDataGenerated + ", isSCDataDelivered=" + isSCDataDelivered
				+ ", isSendSms=" + isSendSms + ", emptype=" + emptype + ", albumDesignation=" + albumDesignation
				+ ", titleId=" + titleId + ", religionId=" + religionId + ", streamId=" + streamId + ", workLocationId="
				+ workLocationId + ", countryByCommunicationAddressCountryId=" + countryByCommunicationAddressCountryId
				+ ", stateByCommunicationAddressStateId=" + stateByCommunicationAddressStateId
				+ ", countryByPermanentAddressCountryId=" + countryByPermanentAddressCountryId
				+ ", empQualificationLevel=" + empQualificationLevel + ", payScaleId=" + payScaleId
				+ ", empSubjectArea=" + empSubjectArea + ", noOfPublicationsRefered=" + noOfPublicationsRefered
				+ ", noOfPublicationsNotRefered=" + noOfPublicationsNotRefered + ", stateByPermanentAddressStateId="
				+ stateByPermanentAddressStateId + ", highQualifForAlbum=" + highQualifForAlbum + ", extensionNumber="
				+ extensionNumber + ", researchPapersRefereed=" + researchPapersRefereed
				+ ", researchPapersNonRefereed=" + researchPapersNonRefereed + ", researchPapersProceedings="
				+ researchPapersProceedings + ", internationalBookPublications=" + internationalBookPublications
				+ ", nationalBookPublications=" + nationalBookPublications + ", localBookPublications="
				+ localBookPublications + ", chaptersEditedBooksNational=" + chaptersEditedBooksNational
				+ ", minorSponseredProjects=" + minorSponseredProjects + ", consultancy1SponseredProjects="
				+ consultancy1SponseredProjects + ", consultancy2SponseredProjects=" + consultancy2SponseredProjects
				+ ", phdResearchGuidance=" + phdResearchGuidance + ", mphilResearchGuidance=" + mphilResearchGuidance
				+ ", trainingAttendedFdp1Weeks=" + trainingAttendedFdp1Weeks + ", majorSponseredProjects="
				+ majorSponseredProjects + ", internationalConferencePresentaion=" + internationalConferencePresentaion
				+ ", nationalConferencePresentaion=" + nationalConferencePresentaion
				+ ", regionalConferencePresentaion=" + regionalConferencePresentaion + ", localConferencePresentaion="
				+ localConferencePresentaion + ", trainingAttendedFdp2Weeks=" + trainingAttendedFdp2Weeks
				+ ", appointmentLetterDate=" + appointmentLetterDate + ", referenceNumberForAppointment="
				+ referenceNumberForAppointment + ", releavingOrderDate=" + releavingOrderDate
				+ ", referenceNubmerforReleaving=" + referenceNubmerforReleaving + ", additionalRemarks="
				+ additionalRemarks + ", chaptersEditedBooksInternational=" + chaptersEditedBooksInternational
				+ ", department=" + department + ", deputationToDepartmentId=" + deputationToDepartmentId + ", userses="
				+ userses + ", empLoan=" + empLoan + ", empFinancial=" + empFinancial + ", empFeeConcession="
				+ empFeeConcession + ", empIncentives=" + empIncentives + ", empRemarks=" + empRemarks
				+ ", empImmigrations=" + empImmigrations + ", empDependentses=" + empDependentses
				+ ", pfGratuityNominees=" + pfGratuityNominees + ", empAcheivements=" + empAcheivements
				+ ", empPayAllowance=" + empPayAllowance + ", empLeaves=" + empLeaves + ", empImages=" + empImages
				+ ", previousExpSet=" + previousExpSet + ", educationalDetailsSet=" + educationalDetailsSet + "]";
	}
	
	
//	@Column(name = "name")
//	private String departmentName;


}
