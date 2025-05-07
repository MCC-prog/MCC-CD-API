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
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@ToString
@Table(name="personal_data")
public class PersonalData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1857854691224269998L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "religion_id")
	private Religion religion;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "religion_section")
	private ReligionSection religionSection;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "mother_tongue_id")
	private MotherTongue motherTongue;
	
	@Column(name="birth_place")
	private String birthPlace;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="passport_no")
	private String passportNo;

	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "passport_country_id")
	private Country passportCountryId;
	
	@Column(name="passport_validity")
	private LocalDate passportValidity;
	
	@Column(name="mobile_no_1")
	private String mobileNo1;
	
	@Column(name="mobile_no_2")
	private String mobileNo2;
	
	@Column(name="mobile_no_3")
	private String mobileNo3;
	
	@Column(name="email")
	private String email;
	
	@Column(name="ph_no_1")
	private String phNo1;
	
	@Column(name="ph_no_2")
	private String phNo2;
	
	@Column(name="ph_no_3")
	private String phNo3;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "income_id")
	private Income incomeId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	private Region regionId;
	
	@Column(name="nationality_others")
	private String nationalitOthers;
	
	@Column(name="language_others")
	private String languageOthers;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private ResidentCategory categoryId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "caste_id")
	private Caste caste;
	
	@Column(name="rural_urban")
	private String ruralUrban;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "category_id")
//	private ResidentCategory categoryId1;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private State stateId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Country countryId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "nationality_id")
	private Nationality nationalityId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "resident_category_id")
	private ResidentCategory residentCategory;
	
	@Column(name="permanent_address_line_1")
	private String permanentAddressLine1;
	
	@Column(name="permanent_address_line_2")
	private String permanentAddressLine2;
	
	@Column(name="current_address_line_1")
	private String currentAddressLine1;
	
	@Column(name="current_address_line_2")
	private String currentAddressLine2;
	
	@Column(name="parent_address_line_1")
	private String parentAddressLine1;
	
	@Column(name="parent_address_line_2")
	private String parentAddressLine2;
	
	@Column(name="parent_address_line_3")
	private String parentAddressLine3;
	
	@Column(name="permanent_address_city")
	private String permanentAddressCity;
	
	@ManyToOne( cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "permanent_address_state_id")
	private State permanentAddressStateId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "permanent_address_country_id")
	private Country permanentAddressCountryId;
	
	@Column(name="permanent_address_zip_code")
	private String permanentAddressZipCode;
	
	@Column(name="current_address_city")
	private String currentAddressCity;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "current_address_state_id")
	private State currentAddressStateId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "current_address_country_id")
	private Country currentAddressCountryId;

	@Column(name="current_address_zip_code")
	private String currentAddressZipCode;
	
	@Column(name="parent_address_city")
	private String parentAddressCity;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_address_state_id")
	private State parentAddressStateId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_address_country_id")
	private Country parentAddressCountryid;
	
	@Column(name="parent_address_zip_code")
	private String parentAddressZipCode;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="father_education")
	private String fatherEducation;
	
	
	@Column(name="mother_education")
	private String motherEducation;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "father_income_id")
	private Income fatherIncomeId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "mother_income_id")
	private Income motherIncomeId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "father_occupation_id")
	private Occupation fatherOccupationId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "mother_occupation_id")
	private Occupation motherOccupationId;
	
	@Column(name="father_email")
	private String fatherEmail;
	
	@Column(name="mother_email")
	private String motherEmail;
	
	@Column(name="parent_ph_1")
	private String parentPh1;
	
	@Column(name="parent_ph_2")
	private String parentPh2;
	
	@Column(name="parent_ph_3")
	private String parentPh3;
	
	@Column(name="parent_mob_1")
	private String parentMob1;
	
	@Column(name="parent_mob_2")
	private String parentMob2;
	
	@Column(name="parent_mob_3")
	private String parentMob3;
	
	@Column(name="state_others")
	private String stateOthers;
	
	@Column(name="permanent_address_state_others")
	private String permanentAddressStateOthers;
	
	@Column(name="current_address_state_others")
	private String currentAddressStateOthers;
	
	@Column(name="parent_address_state_others")
	private String parentAddressStateOthers;
	
	@Column(name="caste_others")
	private String casteOthers;
	
	@Column(name="religion_others")
	private String religionOthers;
	
	
	@Column(name="religion_section_others")
	private String religionSectionOthers;
	
	@Column(name="country_others")
	private String countryOthers;
	
	@Column(name="permanent_address_country_others")
	private String permanentAddressCountryOthers;
	
	@Column(name="current_address_country_others")
	private String currentAddressCountryOthers;
	
	@Column(name="parent_address_country_others")
	private String parentAddressCountryOthers;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "father_income_currency_id")
	private Currency fatherIncomeCurrencyId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "mother_income_currency_id")
	private Currency motherIncomeCurrencyId;
	
	@Column(name="is_sports_person")
	private Boolean isSportsPerson;
		
	@Column(name="is_handicapped")
	private Boolean isHandicapped;
		
	@Column(name="guardian_address_line_1")
	private String guardianAddressLine1;
		
	@Column(name="guardian_address_line_2")
	private String guardianAddressLine2;
	
	@Column(name="guardian_address_line_3")
	private String guardianAddressLine3;
	
	@Column(name="guardian_address_city")
	private String guardianAddressCity;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "guardian_address_state_id")
	private State guardianAddressStateId;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "guardian_address_country_id")
	private Country guardianAddressCountryId;
	
	@Column(name="guardian_address_zip_code")
	private String guardianAddressZipCode;
	
	@Column(name="guardian_ph_1")
	private String guardianPh1;
	
	@Column(name="guardian_ph_2")
	private String guardianPh2;
	
	@Column(name="guardian_ph_3")
	private String guardianPh3;
	
	@Column(name="guardian_mob_1")
	private String guardianMob1;
	
	@Column(name="guardian_mob_2")
	private String guardianMob2;
	
	@Column(name="guardian_mob_3")
	private String guardianMob3;
	
	@Column(name="guardian_address_state_others")
	private String guardianAddressStateOthers;
	
	@Column(name="guardian_address_country_others")
	private String guardianAddressCountry_others;
	
	@Column(name="sports_person_description")
	private String sportsPersonDescription;
	
	@Column(name="handicapped_description")
	private String handicappedDescription;
	
	@Column(name="resident_permit_no")
	private String residentPermitNo;
	
	@Column(name="resident_permit_date")
	private LocalDate residentPermitDate;
	
	@Column(name="language_read")
	private String languageRead;

	@Column(name="language_write")
	private String languageWrite;
	
	@Column(name="language_speak")
	private String languageSpeak;
		
	@Column(name="height")
	private Integer height;

	@Column(name="weight")
	private Integer weight;
	
	@Column(name="training_prog_name")
	private String trainingProgName;
	
	@Column(name="training_inst_address")
	private String trainingInstAddress;
	
	@Column(name="training_duration")
	private Integer trainingDuration;

	@Column(name="training_purpose")
	private String trainingPurpose;
	
	@Column(name="course_known_by")
	private String courseKnownBy;
	
	@Column(name="course_opt_reason")
	private String courseOptReason;
	
	@Column(name="strength")
	private String strength;
	
	@Column(name="weakness")
	private String weakness;
	
	@Column(name="other_addn_info")
	private String otherAddnInfo;
	
	@Column(name="second_language")
	private String secondLanguage;
	
	@Column(name="brotherName")
	private String brotherName;
	
	@Column(name="brotherEducation")
	private String brotherEducation;
	
	@Column(name="brotherOccupation")
	private String brotherOccupation;
	
	@Column(name="brotherIncome")
	private String brotherIncome;
	
	@Column(name="brotherAge")
	private String brotherAge;
	
	@Column(name="sisterName")
	private String sisterName;
	
	@Column(name="sisterEducation")
	private String sisterEducation;
	
	@Column(name="sisterOccupation")
	private String sisterOccupation;
	
	@Column(name="sisterIncome")
	private String sisterIncome;
	
	@Column(name="sisterAge")
	private String sisterAge;
	
	@Column(name="guardianName")
	private String guardianName;
	
	@Column(name="recommended_by")
	private String recommended_by;
	
//	@Column(name="second_language_id")
//	private Integer secondLanguageId;
	
	@Column(name="sub_caste")
	private String subCaste;
	
	@Column(name="university_email")
	private String universityEmail;
	
	@Column(name="other_occupation_father")
	private String otherOccupationFather;
	
	@Column(name="other_occupation_mother")
	private String otherOccupationMother;
	
	@Column(name="visa_number")
	private String visaNumber;
	
	@Column(name="visa_issue_date")
	private Integer visaIssueDate;
	
	@Column(name="passport_issue_date")
	private Integer passportIssueDate;
	
	@Column(name="visa_valid_till")
	private Integer visaValidTill;
		
	@Column(name="aadhaar_no")
	private String aadhaarNo;
	
	@Column(name="disabilty_percentage")
	private Integer disabiltyPercentage;
	
	@Column(name="permanent_disability_number")
	private String permanentDisabilityNumber;
	
	@Column(name="second_language_studied")
	private String secondLanguageStudied;
	
	@Column(name="permanent_address_district")
	private String permanentAddressDistrict;
	
	@Column(name="current_address_district")
	private String currentAddressDistrict;
	
	@Column(name="permanent_address_taluk")
	private String permanentAddressTaluk;
	
	@Column(name="current_address_taluk")
	private String currentAddressTaluk;
	
	@OneToMany(mappedBy = "personalData", cascade = CascadeType.ALL)
	private Set<EdnQualification> ednQualifications = new HashSet<EdnQualification>();
	
	@OneToMany(mappedBy = "personalData", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<AdmAppln> admApplns = new HashSet<AdmAppln>();
	
	@OneToMany(mappedBy = "personalData", cascade = CascadeType.ALL)
	private Set<StudentExtracurricular> studentExtracurriculars = new HashSet<StudentExtracurricular>();
	
//	@OneToMany(mappedBy = "personalData", cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<Student> students = new HashSet<Student>(0);

}
