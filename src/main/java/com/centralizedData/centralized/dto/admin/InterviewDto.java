package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5624629547272125545L;
	
	private int id;
	//private EmployeeTO employeeByCreatedBy;
	//private EmployeeTO employeeByModifiedBy;
	private InterviewProgramCourseNewDto interviewProgramCourse;
	private Date createdDate;
	private Date lastModifiedDate;
	private int year;
	private Integer noOfCandidates;
	private Integer noOfInterviewers;
	private Set<InterviewScheduleDto> interviewSchedules = new HashSet<InterviewScheduleDto>(
			0);
	private Set<InterviewCardDto> interviewCards = new HashSet<InterviewCardDto>(0);

}
