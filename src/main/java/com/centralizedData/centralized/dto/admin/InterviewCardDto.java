package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewCardDto {

	
	private Long courseId;
	
	private String courseName;

	private int appliedYear;
	private String academicYear;
	private String interviewTypeId;
	private String interviewTypeName;
	private String interviewDate;
	private String time;
	private String endtime;
	private Integer candidateCount;
	private Integer admApplnId;
	private Long interviewPrgCrsId;
	
	private String courseCode;
	
	private String templateDescription;
	
	private String dateOfInterview;
	
	private String interviewStartTime;
	
	private String venue;
	
	private String contactDetails;
	
	private String remarks;
	
	private String amOrPm;
	
	private List<Long> candidatesAdmApplnIdList;
	private String interviewtime;
	private String startHours;
	private String startMins;
	private String endHours;
	private String endMins;
	private String intervalHours;
	private String intervalMins;
	private String breakFromHours;
	private String breakFromMins;
	private String breakToHours;
	private String breakToMins;
	private List<StudentDto> applicantList;
	
	private String interviewMailTemplate;
	private String interviewSmsTemplate;
	
	private InterviewScheduleDto interview;
	private AdmApplnNewDto admApplnTO;
	
	
	
	
	
	
	
	
	
}
