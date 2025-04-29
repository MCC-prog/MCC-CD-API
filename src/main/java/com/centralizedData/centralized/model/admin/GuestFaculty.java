package com.centralizedData.centralized.model.admin;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.centralizedData.centralized.model.employee.Department;

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
@Table(name="guest_faculty")
public class GuestFaculty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8512871411377114233L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="department_id")
	private Department department;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="designation_id")
	private Designation designation;
	
	@Column(name="permanent_address_line_1")
	private String permanentAddressLine1;
	
	@Column(name="permanent_address_line_2")
	private String permanentAddressLine2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="permanent_address_country_id")
	private Country permanentAddressCountryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="permanent_address_state_id")
	private State permanentAddressStateId;
	
	@Column(name="permanent_address_city")
	private String permanentAddressCity;
	
	@Column(name="permanent_address_zip")
	private String permanentAddressZip;
	
	@Column(name="communication_address_line_1")
	private String communicationAddressLine1;
	
	@Column(name="communication_address_line_2")
	private String communicationAddressLine2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="communication_address_country_id")
	private Country communicationAddressCountryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="communication_address_state_id")
	private State communicationAddressStateId;
	
	@Column(name="communication_address_city")
	private String communicationAddressCity;
	
	@Column(name="communication_address_zip")
	private String communicationAddressZip;
	
	@Column(name="email")
	private String email;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="communication_address_state_others")
	private String communicationAddressStateOthers;
	
	@Column(name="permanent_address_state_others")
	private String permanentAddressStateOthers;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="nationality_id")
	private Nationality nationality;
	
	@Column(name="code")
	private String code;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="emergency_cont_name")
	private String emergencyContName;
	
	@Column(name="emergency_cont_relationship")
	private String emergencyContRelationship;
	
	@Column(name="emergency_address")
	private String emergencyAddress;
	
	@Column(name="emergency_mobile")
	private String emergencyMobile;
	
	@Column(name="emergency_home_telephone")
	private String emergencyHomeTelephone;
	
	@Column(name="emergency_work_telephone")
	private String emergencyWorkTelephone;
	
	@Column(name="work_email")
	private String workEmail;
	
	@Column(name="uid")
	private String uid;
		
	@Column(name="pan_no")
	private String panNo;
	
	@Column(name="home_telephone1")
	private String homeTelephone1;
	
	@Column(name="home_telephone2")
	private String homeTelephone2;


	@Column(name="home_telephone3")
	private String homeTelephone3;
	
	@Column(name="work_telephone1")
	private String workTelephone1;
	
	@Column(name="work_telephone2")
	private String workTelephone2;
	
	@Column(name="work_telephone3")
	private String workTelephone3;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="active")
	private Integer active;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="emp_Work_Location_id")
	private EmpWorkLocation empWorkLocation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="emp_stream_id")
	private EmpStream empStreamId;
		
	@Column(name="bank_account_no")
	private String bankAccountNo;
	
	@Column(name="pf_number")
	private String pfNumber;
	
	@Column(name="two_wheeler_no")
	private String twoWheelerNo;
	
	@Column(name="four_wheeler_no")
	private String fourWheelerNo;
	
	@Column(name="emp_qualification_level")
	private Integer empQualificationLevel;
	
	@Column(name="subject_area_id")
	private Integer subjectAreaId;
	
	@Column(name="emp_teaching_staff")
	private boolean empTeachingStaff;
	
	@Column(name="highest_qualification")
	private String highestQualification;
	
	@Column(name="total_experience_month")
	private String totalExperienceMonth;
	
	@Column(name="total_experience_year")
	private String totalExperienceYear;
	
	@Column(name="relevant_experience_month")
	private String relevantExperienceMonth;
	
	@Column(name="relevant_experience_year")
	private String relevantExperienceYear;
	
	@Column(name="publications_refered")
	private String publicationRefered;
	
	@Column(name="publications_not_refered")
	private String publicationsNotRefered;
	
	@Column(name="books")
	private String books;
	
	@Column(name="other_info")
	private String otherInfo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="religion")
	private Religion religion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="designation")
	private Designation designationId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="job_title_id")
	private EmpJobTitle empJobTittle;
	
	@Column(name="reservation_category")
	private String reservationCategory;
	
	
	@Column(name="previously_working")
	private boolean previouslyWorking;
	
	@Column(name="current_organisation")
	private String currentOrganisation;
	
	@Column(name="is_same_address")
	private boolean isSameAddress;
	
	@Column(name="eligibility_test")
	private String eligibilityTest;
	
	@Column(name="eligibility_test_other")
	private String eligibilityTestOther;
	
	@Column(name="industry_functional_area")
	private String industryFunctionalArea;
	
	@Column(name="handicap_description")
	private String handicapDescription;
	
	@Column(name="subject_specilization")
	private String subjectSpecilization;
	
	@Column(name="working_hours_per_week")
	private String workingHoursPerWeek;
	
	@Column(name="Honorarium_per_hours")
	private String HonorariumPerHours;
	
	@Column(name="referred_by")
	private String referredBy;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "highest_qualification_forwebsite")
	private String highestQualificationForwebsite;
	
	@Column(name = "staff_id")
	private String staffId;
	
	@Column(name = "display_in_website")
	private boolean displayInWebsite;
	
	@Column(name = "bank_branch")
	private String bankBranch;
	
	@Column(name = "bank_ifsc_code")
	private String bankIfscCode;
}
