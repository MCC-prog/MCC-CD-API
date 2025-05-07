package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DownloadEmployeeResumeDto implements Serializable{
	
	private int id;
	private String empCode;
	private String fingerPrintId;
	private String startDate;
	private String endDate;
	private String employeeName;
	private String designationName;
	private String departmentName;
	private String employeeId;
	private String qualificationId;
	private String applicationNO;
	private String checked1;
	private String mailId;
	private String tempChecked;
	
	// resume print  fields
	private String statusDate;
	private String postAppliedFor;
	private String department;
	private String gender;
	private String jobCode;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String nationality;
	private String currentLocation;
	private String marital;
	private String dateOfBirth;
	private String email;
	private String reservationCategory;
	private String contactNumber;
	private String mobileNumber;
	private String workStatus;
	private String designation;
	private String currentAddress1;
	private String currentAddress2;
	private String currentAddress3;
	private String totalExpYears;
	private String totalExpMonths;
	private Integer noOfPublicationsRefered;
	private Integer noOfPublicationsNotRefered;
	private Integer books;
	private String checked;
	private String totalTeachingExperience;
	private String industryExperience;
	private String totalExp;
	private String qualificationLevel;
	private String subjectArea;
	private String jobType;
	private String empStatus;
	private String expectedSalary;
	private String eligibilityTest;
	private String otherInfo;
	private String submitedDate;
	private String highQualification;
	private String courseNames;
	private String dateOfApplication;
	// new additions by Smitha
	private String industryFunctionalArea;
	private String bloodGroup;
	private String religion;
	private String age;
	private int count;
	private String currentStatus;
	private String currentDate;
	//added by sudhir
	private byte[] photo;
	private String forwardedUsers;
	private String researchPapersRefereed;
	private String researchPapersNonRefereed;
	private String researchPapersProceedings;
	private String internationalBookPublications;
	private String nationalBookPublications;
	private String localBookPublications;
	private String chaptersEditedBooksInternational;
	private String chaptersEditedBooksNational;
	private String majorSponseredProjects;
	private String minorSponseredProjects;
	private String consultancy1SponseredProjects;
	private String consultancy2SponseredProjects;
	private String phdResearchGuidance;
	private String mphilResearchGuidance;
	private String trainingAttendedFdp2Weeks;
	private String trainingAttendedFdp1Weeks;
	private String internationalConferencePresentaion;
	private String nationalConferencePresentaion;
	private String regionalConferencePresentaion;
	private String localConferencePresentaion;
	private String fatherName;
	private String motherName;
	private String alternateMobile;
	private String empSubject;
	private String empSubjectName;

}
