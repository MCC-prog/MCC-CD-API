package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@Entity
@Table(name="emp_online_resume")
public class EmpOnlineResume implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8851667213355098349L;

	/**
	 * 
	 */	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "nationality_id")
	private Nationality nationality;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "permanent_country_id")
	private Country country;
	
    @Column(name="emp_job_type_id")
	private String empJobType;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "permanent_state_id")
	private State state;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_education_Details_id")
	private EmpEducationMaster empEducationDetailses;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_acheivement_id")
	private EmpAcheivement empAcheivement;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "interview_schedule_id")
//	private EmpDesiredPost empDesiredPost;
	
	@Column(name="post_designation")
	private String postAppliedDesig;
	
	@Column(name="name")
	private String name;
	
	@Column(name="permanent_address_line_1")
	private String addressLine1;
	
	@Column(name="permanent_address_line_2")
	private String addressLine2;
	
	@Column(name="permanent_address_line_3")
	private String addressLine3;
	
	@Column(name="code")
	private String code;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@Column(name="permanent_city")
	private String city;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="ph_no_1")
	private String phNo1;
	
	@Column(name="ph_no_2")
	private String phNo2;
	
	@Column(name="ph_no_3")
	private String phNo3;
	
	@Column(name="work_ph_no_1")
	private String workPhNo1;
	
	@Column(name="work_ph_no_2")
	private String workPhNo2;
	
	@Column(name="work_ph_no_3")
	private String workPhNo3;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="mobile_no_1")
	private String mobileNo1;
	
	@Column(name="mobile_no_2")
	private String mobileNo2;
	
	@Column(name="mobile_no_3")
	private String mobileNo3;
	
	@Column(name="email")
	private String email;
	
	@Column(name="employement_status")
	private String employmentStatus;
	
	@Column(name="expected_salary_lakhs")
	private Integer expectedSalaryLakhs;
	
	@Column(name="expected_salary_thousands")
	private Integer expectedSalaryThousands;
	
	@Column(name="desired_post")
	private String desiredPost;
	
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	
	@Column(name="information_known")
	private String informationKnown;
	
	@Column(name="recommended_by")
	private String recommendedBy;
	
	@Column(name="emp_photo")
	private byte[] empPhoto;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="application_no")
	private String applicationNo;
	
	
	
//	private Set<EmpEducationalDetails> educationDetailsSet = new HashSet<EmpEducationalDetails>();
	@OneToMany(mappedBy = "empOnlineResume", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpOnlineEducationalDetails> educationalDetailsSet = new HashSet<EmpOnlineEducationalDetails>();
//	private Set<EmpAcheivement> acheivementSet = new HashSet<EmpAcheivement>();
	@OneToMany(mappedBy = "empOnlineResume", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmpOnlinePreviousExperience> previousExpSet = new HashSet<EmpOnlinePreviousExperience>();
//	private Set<EmpPreviousOrg> previousOrgSet=new HashSet<EmpPreviousOrg>();
	@Column(name="status")
	private String status;
	@Column(name="vacancy_information")
	private String vacancyInformation;



@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "designation_id")
	private Designation designation;

	@Column(name="job_code")
	private String jobCode;
	
	@Column(name="current_address_line_1")
	private String currentAddressLine1;
	
	@Column(name="current_address_line_2")
	private String currentAddressLine2;
	
	@Column(name="current_address_line_3")
	private String currentAddressLine3;
	
	@Column(name="current_city")
	private String currentCity;



@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "current_state_id")
	private State currentState;

@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "current_country_id")
	private Country currentCountry;

	@Column(name="permanent_zip_code")
	private String permanentZipCode;
	
	@Column(name="current_zip_code")
	private String currentZipCode;
	
	@Column(name="reservation_category")
	private String reservationCategory;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_qualification_level_id")
	private QualificationLevel empQualificationLevel;
	
	
	
//	private EmpJobType emJobType;
	@Column(name="eligibility_test")
	private String eligibilityTest;
	
	@Column(name="no_of_publications_refered")
	private Integer noOfPublicationsRefered;
	
	@Column(name="no_of_publications_not_refered")
	private Integer noOfPublicationsNotRefered;
	
	@Column(name="books")
	private Integer books;
	
	@Column(name="other_info")
	private String otherInfo;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_subject_area_id")
	private SubjectArea empSubjectArea;
	
	@Column(name="currently_working")
	private Boolean currentlyWorking;
	
	@Column(name="current_desingnation_id")
	private String currentDesignation;
	
	@Column(name="current_organization")
	private String currentOrganization;
	
	@Column(name="total_exp_years")
	private Integer totalExpYear;
	
	@Column(name="total_exp_months")
	private Integer totalExpMonths;
	
	@Column(name="date_of_submission")
	private Date dateOfSubmission;
	
//	private EmpEducationalDetails empEducationDetails;
	@Column(name="current_state_other")
	private String currentStateOther;
	
	@Column(name="permanent_state_other")
	private String permanentStateOther;
	
	@Column(name="is_same_address")
	private Boolean isSameAddress;
	//added by smitha
	@Column(name="blood_group")
	private String bloodGroup;



@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "religion_id")
	private Religion religion;

	@Column(name="eligibility_test_other")
	private String eligibilityTestOther;
	
	@Column(name="industry_functional_area")
	private String industryFunctionalArea;
	
	@Column(name="handicap_description")
	private String handicappedDescription;
	
	@Column(name="status_date")
	private Date statusDate;
	
	@Column(name="research_papers_refereed")
	private Integer researchPapersRefereed;
	
	@Column(name="research_papers_non_refereed")
	private Integer researchPapersNonRefereed;
	
	@Column(name="research_papers_proceedings")
	private Integer researchPapersProceedings;
	
	@Column(name="international_book_publications")
	private Integer internationalBookPublications;
	
	@Column(name="national_book_publications")
	private Integer nationalBookPublications;
	
	@Column(name="local_book_publications")
	private Integer localBookPublications;
	
	@Column(name="chapters_edited_books_international")
	private Integer chaptersEditedBooksInternational;
	
	@Column(name="chapters_edited_books_national")
	private Integer chaptersEditedBooksNational;
	
	@Column(name="major_sponsered_projects")
	private Integer majorSponseredProjects;
	
	@Column(name="minor_sponsered_projects")
	private Integer minorSponseredProjects;
	
	@Column(name="consultancy1_sponsered_projects")
	private Integer consultancy1SponseredProjects;
	
	@Column(name="consultancy2_sponsered_projects")
	private Integer consultancy2SponseredProjects;
	
	@Column(name="phd_research_guidance")
	private Integer phdResearchGuidance;
	
	@Column(name="mphil_research_guidance")
	private Integer mphilResearchGuidance;
	
	@Column(name="training_attended_fdp_2weeks")
	private Integer trainingAttendedFdp2Weeks;
	
	@Column(name="training_attended_fdp_1week")
	private Integer trainingAttendedFdp1Weeks;
	
	@Column(name="international_conference_presentation")
	private Integer internationalConferencePresentaion;
	
	@Column(name="national_conference_presentation")
	private Integer nationalConferencePresentaion;
	
	@Column(name="regional_conference_presentation")
	private Integer regionalConferencePresentaion;
	
	@Column(name="local_conference_presentation")
	private Integer localConferencePresentaion;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="alternate_mobile_no")
	private String alternateMobile;



@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_subject_id")
	private EmployeeSubject empSubject;

	@Column(name="aadhaar")
	private String aadhaar;
	
	public Boolean getIsSameAddress() {
		return isSameAddress;
	}
	public void setIsSameAddress(Boolean isSameAddress) {
		this.isSameAddress = isSameAddress;
	}
	public EmpOnlineResume(Integer id, Nationality nationality, Country country,
			EmpJobType emJobType, Department department,
			EmpEducationMaster empEducationDetailses,
			EmpAcheivement empAcheivement, EmpDesiredPost empDesiredPost,
			String name, String addressLine1, String addressLine2,
			String addressLine3, String code, String gender,
			String maritalStatus, String city, Date dateOfBirth, String phNo1,
			String phNo2, String phNo3, Integer age, String mobileNo1,
			String mobileNo2, String mobileNo3, String email,
			String employmentStatus, Integer expectedSalaryLakhs,
			Integer expectedSalaryThousands, String desiredPost,
			Date dateOfJoining, String informationKnown, String recommendedBy,
			byte[] empPhoto, String createdBy, Date createdDate,
			String modifiedBy, Date lastModifiedDate, Boolean isActive,String status,State state,
			String vacancyInformation,Designation designation,
			String jobCode,String currentAddressLine1,String currentAddressLine2,String currentAddressLine3,
			String currentCity,State currentState,Country currentCountry,String permanentZipCode,
			String currentZipCode,String reservationCategory,QualificationLevel empQualificationLevel, 
			String empJobType,String eligibilityTest,Integer noOfPublicationsRefered,Integer noOfPublicationsNotRefered,
			Integer books,String otherInfo,String applicationNo, //SubjectAreaBO empSubjectArea,
			Boolean currentlyWorking,String currentDesignation,String currentOrganization,
			Integer totalExpYear,Integer totalExpMonths,Date dateOfSubmission,EmpEducationalDetails empEducationDetails,
			String currentStateOther, String permanentStateOther, String workPhNo1, String workPhNo2, String workPhNo3, Boolean isSameAddress
			,String bloodGroup,Religion religion,String eligibilityTestOther,String industryFunctionalArea, String handicappedDescription) {
		super();
		this.handicappedDescription=handicappedDescription;
		this.isSameAddress=isSameAddress;
		this.workPhNo1=workPhNo1;
		this.workPhNo2=workPhNo2;
		this.workPhNo3=workPhNo3;
		this.id = id;
		this.nationality = nationality;
		this.country = country;
		this.empJobType = empJobType;
		this.department = department;
		this.empEducationDetailses = empEducationDetailses;
		this.empAcheivement = empAcheivement;
		//this.empDesiredPost = empDesiredPost;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.code = code;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
		this.phNo1 = phNo1;
		this.phNo2 = phNo2;
		this.phNo3 = phNo3;
		this.age = age;
		this.mobileNo1 = mobileNo1;
		this.mobileNo2 = mobileNo2;
		this.mobileNo3 = mobileNo3;
		this.email = email;
		this.employmentStatus = employmentStatus;
		this.expectedSalaryLakhs = expectedSalaryLakhs;
		this.expectedSalaryThousands = expectedSalaryThousands;
		this.desiredPost = desiredPost;
		this.dateOfJoining = dateOfJoining;
		this.informationKnown = informationKnown;
		this.recommendedBy = recommendedBy;
		this.empPhoto = empPhoto;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.isActive = isActive;
		this.status=status;
		this.state=state;
		this.vacancyInformation=vacancyInformation;
		this.designation=designation;
		this.jobCode=jobCode;
		this.currentAddressLine1=currentAddressLine1;
		this.currentAddressLine2=currentAddressLine2;
		this.currentAddressLine3=currentAddressLine3;
		this.currentCity=currentCity;
		this.currentState=currentState;
		this.currentCountry=currentCountry;
		this.permanentZipCode=permanentZipCode;
		this.currentZipCode=currentZipCode;
		this.reservationCategory=reservationCategory;
		this.empQualificationLevel=empQualificationLevel;
		//this.emJobType=emJobType;
		this.eligibilityTest=eligibilityTest;
		this.noOfPublicationsRefered=noOfPublicationsRefered;
		this.noOfPublicationsNotRefered=noOfPublicationsNotRefered;
		this.books=books;
		this.otherInfo=otherInfo; 
		//this.empSubjectArea=empSubjectArea;
		this.applicationNo=applicationNo;
		this.currentlyWorking=currentlyWorking;
		this.currentDesignation=currentDesignation;
		this.totalExpYear=totalExpYear;
		this.totalExpMonths=totalExpMonths;
		this.currentOrganization=currentOrganization;
		this.dateOfSubmission=dateOfSubmission;
	//	this.empEducationDetails=empEducationDetails;
		this.currentStateOther=currentStateOther;
		this.permanentStateOther=permanentStateOther;
		this.bloodGroup=bloodGroup;
		this.religion=religion;
		this.eligibilityTestOther=eligibilityTestOther;
		this.industryFunctionalArea=industryFunctionalArea;
	}
	public EmpOnlineResume() {
	}

	public EmpOnlineResume(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Nationality getNationality() {
		return this.nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public EmpAcheivement getEmpAcheivement() {
		return this.empAcheivement;
	}

	public void setEmpAcheivement(EmpAcheivement empAcheivement) {
		this.empAcheivement = empAcheivement;
	}

//	public EmpDesiredPost getEmpDesiredPost() {
//		return this.empDesiredPost;
//	}
//
//	public void setEmpDesiredPost(EmpDesiredPost empDesiredPost) {
//		this.empDesiredPost = empDesiredPost;
//	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo1() {
		return this.phNo1;
	}

	public void setPhNo1(String phNo1) {
		this.phNo1 = phNo1;
	}

	public String getPhNo2() {
		return this.phNo2;
	}

	public void setPhNo2(String phNo2) {
		this.phNo2 = phNo2;
	}

	public String getPhNo3() {
		return this.phNo3;
	}

	public void setPhNo3(String phNo3) {
		this.phNo3 = phNo3;
	}

	public String getMobileNo1() {
		return this.mobileNo1;
	}

	public void setMobileNo1(String mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}

	public String getMobileNo2() {
		return this.mobileNo2;
	}

	public void setMobileNo2(String mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}

	public String getMobileNo3() {
		return this.mobileNo3;
	}

	public void setMobileNo3(String mobileNo3) {
		this.mobileNo3 = mobileNo3;
	}

	public String getEmploymentStatus() {
		return this.employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public Integer getExpectedSalaryLakhs() {
		return this.expectedSalaryLakhs;
	}

	public void setExpectedSalaryLakhs(Integer expectedSalaryLakhs) {
		this.expectedSalaryLakhs = expectedSalaryLakhs;
	}

	public Integer getExpectedSalaryThousands() {
		return this.expectedSalaryThousands;
	}

	public void setExpectedSalaryThousands(Integer expectedSalaryThousands) {
		this.expectedSalaryThousands = expectedSalaryThousands;
	}

	public String getDesiredPost() {
		return this.desiredPost;
	}

	public void setDesiredPost(String desiredPost) {
		this.desiredPost = desiredPost;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRecommendedBy() {
		return this.recommendedBy;
	}

	public void setRecommendedBy(String recommendedBy) {
		this.recommendedBy = recommendedBy;
	}

	public String getInformationKnown() {
		return this.informationKnown;
	}

	public void setInformationKnown(String informationKnown) {
		this.informationKnown = informationKnown;
	}

	public String getEmpJobType() {
		return empJobType;
	}

	public void setEmpJobType(String empJobType) {
		this.empJobType = empJobType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public void setEmpEducationDetailses(EmpEducationMaster empEducationDetailses) {
		this.empEducationDetailses = empEducationDetailses;
	}

	public EmpEducationMaster getEmpEducationDetailses() {
		return empEducationDetailses;
	}

	public void setEmpPhoto(byte[] empPhoto) {
		this.empPhoto = empPhoto;
	}

	public byte[] getEmpPhoto() {
		return empPhoto;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setEducationalDetailsSet(Set<EmpOnlineEducationalDetails> educationalDetailsSet) {
		this.educationalDetailsSet = educationalDetailsSet;
	}
	public Set<EmpOnlineEducationalDetails> getEducationalDetailsSet() {
		return educationalDetailsSet;
	}
//	public void setAcheivementSet(Set<EmpAcheivement> acheivementSet) {
//		this.acheivementSet = acheivementSet;
//	}
//	public Set<EmpAcheivement> getAcheivementSet() {
//		return acheivementSet;
//	}
	public void setPreviousExpSet(Set<EmpOnlinePreviousExperience> previousExpSet) {
		this.previousExpSet = previousExpSet;
	}
	public Set<EmpOnlinePreviousExperience> getPreviousExpSet() {
		return previousExpSet;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getVacancyInformation() {
		return vacancyInformation;
	}
	
	public Designation getDesignation() {
		return designation;
	}
	public String getJobCode() {
		return jobCode;
	}
	public String getCurrentAddressLine1() {
		return currentAddressLine1;
	}
	public String getCurrentAddressLine2() {
		return currentAddressLine2;
	}
	public String getCurrentAddressLine3() {
		return currentAddressLine3;
	}
	public String getCurrentCity() {
		return currentCity;
	}
	public State getCurrentState() {
		return currentState;
	}
	public Country getCurrentCountry() {
		return currentCountry;
	}
	public String getPermanentZipCode() {
		return permanentZipCode;
	}
	public String getCurrentZipCode() {
		return currentZipCode;
	}
	public String getReservationCategory() {
		return reservationCategory;
	}
	public QualificationLevel getEmpQualificationLevel() {
		return empQualificationLevel;
	}
//	public EmpJobType getEmJobType() {
//		return emJobType;
//	}
	public String getEligibilityTest() {
		return eligibilityTest;
	}
	public Integer getNoOfPublicationsRefered() {
		return noOfPublicationsRefered;
	}
	public Integer getNoOfPublicationsNotRefered() {
		return noOfPublicationsNotRefered;
	}
	public Integer getBooks() {
		return books;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setVacancyInformation(String vacancyInformation) {
		this.vacancyInformation = vacancyInformation;
	}
	
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public void setCurrentAddressLine1(String currentAddressLine1) {
		this.currentAddressLine1 = currentAddressLine1;
	}
	public void setCurrentAddressLine2(String currentAddressLine2) {
		this.currentAddressLine2 = currentAddressLine2;
	}
	public void setCurrentAddressLine3(String currentAddressLine3) {
		this.currentAddressLine3 = currentAddressLine3;
	}
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	public void setCurrentCountry(Country currentCountry) {
		this.currentCountry = currentCountry;
	}
	public void setPermanentZipCode(String permanentZipCode) {
		this.permanentZipCode = permanentZipCode;
	}
	public void setCurrentZipCode(String currentZipCode) {
		this.currentZipCode = currentZipCode;
	}
	public void setReservationCategory(String reservationCategory) {
		this.reservationCategory = reservationCategory;
	}
	public void setEmpQualificationLevel(QualificationLevel empQualificationLevel) {
		this.empQualificationLevel = empQualificationLevel;
	}
//	public void setEmJobType(EmpJobType emJobType) {
//		this.emJobType = emJobType;
//	}
	public void setEligibilityTest(String eligibilityTest) {
		this.eligibilityTest = eligibilityTest;
	}
	public void setNoOfPublicationsRefered(Integer noOfPublicationsRefered) {
		this.noOfPublicationsRefered = noOfPublicationsRefered;
	}
	public void setNoOfPublicationsNotRefered(Integer noOfPublicationsNotRefered) {
		this.noOfPublicationsNotRefered = noOfPublicationsNotRefered;
	}
	public void setBooks(Integer books) {
		this.books = books;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public SubjectArea getEmpSubjectArea() {
		return empSubjectArea;
	}
	public void setEmpSubjectArea(SubjectArea empSubjectArea) {
		this.empSubjectArea = empSubjectArea;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public Boolean isCurrentlyWorking() {
		return currentlyWorking;
	}
	public String getCurrentDesignation() {
		return currentDesignation;
	}
	public String getCurrentOrganization() {
		return currentOrganization;
	}
	public Integer getTotalExpYear() {
		return totalExpYear;
	}
	public Integer getTotalExpMonths() {
		return totalExpMonths;
	}
	public void setCurrentlyWorking(Boolean currentlyWorking) {
		this.currentlyWorking = currentlyWorking;
	}
	public void setCurrentDesignation(String currentDesignation) {
		this.currentDesignation = currentDesignation;
	}
	public void setCurrentOrganization(String currentOrganization) {
		this.currentOrganization = currentOrganization;
	}
	public void setTotalExpYear(Integer totalExpYear) {
		this.totalExpYear = totalExpYear;
	}
	public void setTotalExpMonths(Integer totalExpMonths) {
		this.totalExpMonths = totalExpMonths;
	}
	public Date getDateOfSubmission() {
		return dateOfSubmission;
	}
	public void setDateOfSubmission(Date dateOfSubmission) {
		this.dateOfSubmission = dateOfSubmission;
	}
//	public Set<EmpEducationalDetails> getEducationDetailsSet() {
//		return educationDetailsSet;
//	}
//	public void setEducationDetailsSet(Set<EmpEducationalDetails> educationDetailsSet) {
//		this.educationDetailsSet = educationDetailsSet;
//	}
//	public Set<EmpPreviousOrg> getPreviousOrgSet() {
//		return previousOrgSet;
//	}
//	public void setPreviousOrgSet(Set<EmpPreviousOrg> previousOrgSet) {
//		this.previousOrgSet = previousOrgSet;
//	}
//	public EmpEducationalDetails getEmpEducationDetails() {
//		return empEducationDetails;
//	}
//	public void setEmpEducationDetails(EmpEducationalDetails empEducationDetails) {
//		this.empEducationDetails = empEducationDetails;
//	}
	public String getCurrentStateOther() {
		return currentStateOther;
	}
	public String getPermanentStateOther() {
		return permanentStateOther;
	}
	public void setCurrentStateOther(String currentStateOther) {
		this.currentStateOther = currentStateOther;
	}
	public void setPermanentStateOther(String permanentStateOther) {
		this.permanentStateOther = permanentStateOther;
	}
	public String getWorkPhNo1() {
		return workPhNo1;
	}
	public void setWorkPhNo1(String workPhNo1) {
		this.workPhNo1 = workPhNo1;
	}
	public String getWorkPhNo2() {
		return workPhNo2;
	}
	public void setWorkPhNo2(String workPhNo2) {
		this.workPhNo2 = workPhNo2;
	}
	public String getWorkPhNo3() {
		return workPhNo3;
	}
	public void setWorkPhNo3(String workPhNo3) {
		this.workPhNo3 = workPhNo3;
	}
	public String getPostAppliedDesig() {
		return postAppliedDesig;
	}
	public void setPostAppliedDesig(String postAppliedDesig) {
		this.postAppliedDesig = postAppliedDesig;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Religion getReligion() {
		return religion;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	public String getEligibilityTestOther() {
		return eligibilityTestOther;
	}
	public void setEligibilityTestOther(String eligibilityTestOther) {
		this.eligibilityTestOther = eligibilityTestOther;
	}
	public String getIndustryFunctionalArea() {
		return industryFunctionalArea;
	}
	public void setIndustryFunctionalArea(String industryFunctionalArea) {
		this.industryFunctionalArea = industryFunctionalArea;
	}
	public String getHandicappedDescription() {
		return handicappedDescription;
	}
	public void setHandicappedDescription(String handicappedDescription) {
		this.handicappedDescription = handicappedDescription;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public Integer getResearchPapersRefereed() {
		return researchPapersRefereed;
	}
	public void setResearchPapersRefereed(Integer researchPapersRefereed) {
		this.researchPapersRefereed = researchPapersRefereed;
	}
	public Integer getResearchPapersNonRefereed() {
		return researchPapersNonRefereed;
	}
	public void setResearchPapersNonRefereed(Integer researchPapersNonRefereed) {
		this.researchPapersNonRefereed = researchPapersNonRefereed;
	}
	public Integer getResearchPapersProceedings() {
		return researchPapersProceedings;
	}
	public void setResearchPapersProceedings(Integer researchPapersProceedings) {
		this.researchPapersProceedings = researchPapersProceedings;
	}
	public Integer getInternationalBookPublications() {
		return internationalBookPublications;
	}
	public void setInternationalBookPublications(
			Integer internationalBookPublications) {
		this.internationalBookPublications = internationalBookPublications;
	}
	public Integer getNationalBookPublications() {
		return nationalBookPublications;
	}
	public void setNationalBookPublications(Integer nationalBookPublications) {
		this.nationalBookPublications = nationalBookPublications;
	}
	public Integer getLocalBookPublications() {
		return localBookPublications;
	}
	public void setLocalBookPublications(Integer localBookPublications) {
		this.localBookPublications = localBookPublications;
	}
	public Integer getChaptersEditedBooksInternational() {
		return chaptersEditedBooksInternational;
	}
	public void setChaptersEditedBooksInternational(
			Integer chaptersEditedBooksInternational) {
		this.chaptersEditedBooksInternational = chaptersEditedBooksInternational;
	}
	public Integer getChaptersEditedBooksNational() {
		return chaptersEditedBooksNational;
	}
	public void setChaptersEditedBooksNational(Integer chaptersEditedBooksNational) {
		this.chaptersEditedBooksNational = chaptersEditedBooksNational;
	}
	public Integer getMajorSponseredProjects() {
		return majorSponseredProjects;
	}
	public void setMajorSponseredProjects(Integer majorSponseredProjects) {
		this.majorSponseredProjects = majorSponseredProjects;
	}
	public Integer getMinorSponseredProjects() {
		return minorSponseredProjects;
	}
	public void setMinorSponseredProjects(Integer minorSponseredProjects) {
		this.minorSponseredProjects = minorSponseredProjects;
	}
	public Integer getConsultancy1SponseredProjects() {
		return consultancy1SponseredProjects;
	}
	public void setConsultancy1SponseredProjects(
			Integer consultancy1SponseredProjects) {
		this.consultancy1SponseredProjects = consultancy1SponseredProjects;
	}
	public Integer getConsultancy2SponseredProjects() {
		return consultancy2SponseredProjects;
	}
	public void setConsultancy2SponseredProjects(
			Integer consultancy2SponseredProjects) {
		this.consultancy2SponseredProjects = consultancy2SponseredProjects;
	}
	public Integer getPhdResearchGuidance() {
		return phdResearchGuidance;
	}
	public void setPhdResearchGuidance(Integer phdResearchGuidance) {
		this.phdResearchGuidance = phdResearchGuidance;
	}
	public Integer getMphilResearchGuidance() {
		return mphilResearchGuidance;
	}
	public void setMphilResearchGuidance(Integer mphilResearchGuidance) {
		this.mphilResearchGuidance = mphilResearchGuidance;
	}
	public Integer getTrainingAttendedFdp2Weeks() {
		return trainingAttendedFdp2Weeks;
	}
	public void setTrainingAttendedFdp2Weeks(Integer trainingAttendedFdp2Weeks) {
		this.trainingAttendedFdp2Weeks = trainingAttendedFdp2Weeks;
	}
	public Integer getTrainingAttendedFdp1Weeks() {
		return trainingAttendedFdp1Weeks;
	}
	public void setTrainingAttendedFdp1Weeks(Integer trainingAttendedFdp1Weeks) {
		this.trainingAttendedFdp1Weeks = trainingAttendedFdp1Weeks;
	}
	public Integer getInternationalConferencePresentaion() {
		return internationalConferencePresentaion;
	}
	public void setInternationalConferencePresentaion(
			Integer internationalConferencePresentaion) {
		this.internationalConferencePresentaion = internationalConferencePresentaion;
	}
	public Integer getNationalConferencePresentaion() {
		return nationalConferencePresentaion;
	}
	public void setNationalConferencePresentaion(
			Integer nationalConferencePresentaion) {
		this.nationalConferencePresentaion = nationalConferencePresentaion;
	}
	public Integer getRegionalConferencePresentaion() {
		return regionalConferencePresentaion;
	}
	public void setRegionalConferencePresentaion(
			Integer regionalConferencePresentaion) {
		this.regionalConferencePresentaion = regionalConferencePresentaion;
	}
	public Integer getLocalConferencePresentaion() {
		return localConferencePresentaion;
	}
	public void setLocalConferencePresentaion(Integer localConferencePresentaion) {
		this.localConferencePresentaion = localConferencePresentaion;
	}
	public Boolean getCurrentlyWorking() {
		return currentlyWorking;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public EmployeeSubject getEmpSubject() {
		return empSubject;
	}
	public void setEmpSubject(EmployeeSubject empSubject) {
		this.empSubject = empSubject;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getAadhaar() {
		return aadhaar;
	}


}
