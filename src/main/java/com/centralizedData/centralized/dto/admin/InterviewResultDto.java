package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewResultDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2222379000874261401L;

	private int id;
//	private int interviewResultDetailId;
//	private Set<InterviewResultDetail> interviewResultDetails;
	private List<InterviewResultDetailDto> interviewResultDetail;
	private int interviewTypeId;
	private String interviewType;
	private String interviewStatus;
	private String marksObtained;
	private String comments;
	private String referredBy;
	private String selectedPrefId;
	private String applicationId;
	private String applicationNo;
	private String applicantName;
	private String appliedYear;
	private String interviewStatusId;
//	private List<String> gradeObtainedList;
	private InterviewProgramCourseNewDto interviewProgramCourseTO;
	private String courseId;
	private String interviewProgramCourseId;
	private InterviewStatusDto interviewStatusTO;
	private GradeDto gradeTO;
	private AdmApplnNewDto admApplnTO;
	private String interviewDate;
	private String startTimeHours;
	private String startTimeMins;
	private String endTimeHours;
	private String endTimeMins;
	private int interviewSubroundId;
	private String subroundName;
	private List<GradeDto> gradeList;
	private String percentage;
	private List<InterviewResultDto> selectedCandidates;
	private int interviewPerPanel;
}
