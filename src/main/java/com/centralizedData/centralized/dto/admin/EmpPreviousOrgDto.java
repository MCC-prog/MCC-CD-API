package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpPreviousOrgDto implements Serializable{
	
	
	
	private int id;
	private String teachingExpMonths;
	private String teachingExpYears;
	private String industryExpMonths;
	private String industryExpYears;
	
	private String currentDesignation;
	private String currentOrganisation;
	private String currentTeachnigDesignation;
	private String currentTeachingOrganisation;
	private String experienceLength;
	private String teachExpLength;
	private String ifEmpty;
	private String industryFromDate;
	private String industryToDate;
	private String teachingToDate;
	private String teachingFromDate;
	private String industryGrossSalary;
	private String teachingGrossSalary;
	private String tempTeachingExpMonths;
	private String tempTeachingExpYears;
	private String tempIndustryExpMonths;
	private String tempIndustryExpYears;
	private String tNameOfInstitution;
	private String tNameOfUniversity;
	private String tSubject;
	private String tYearsOfExpe;
	private String rNameOfInstitution;
	private String rNameOfTheUniversity;
	private String rSubject;
	private String rYearOfExper;
	private String pNameOfTitles;
	private String pJournalPubli;
	private String pyear;

}
