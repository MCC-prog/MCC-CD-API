package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewScheduleDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1667448561156176034L;
	
	private int id;
	private EmployeeNewDto employee;
	private InterviewDto interview;
	private String date;
	private String venue;
	private String startTime;
	private String endTime;
	private Integer createdBy;
	private Date createdDate;
	private Date lastModifiedDate;
	private String timeInterval;
	private Set<InterviewBreakTimeDto> interviewBreakTimes = new HashSet<InterviewBreakTimeDto>(
			0);
	private Set<InterviewersDto> interviewerses = new HashSet<InterviewersDto>(0);
	private Set<InterviewCardDto> interviewCards = new HashSet<InterviewCardDto>(0);

}
