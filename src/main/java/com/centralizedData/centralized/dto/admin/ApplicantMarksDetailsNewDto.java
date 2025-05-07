package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantMarksDetailsNewDto implements Serializable,Comparable<ApplicantMarksDetailsNewDto>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6083824950224301284L;

	private Long id;
	private Long ednQualificationId;
	private int semesterNo;
	private String semesterName;
	private String maxMarks;
	private String marksObtained;
	private int percentage;
	private boolean lastExam;
	private int totalMark;
	private int obtainedMark;
	private boolean populated;
	private String maxMarks_languagewise;
	private String marksObtained_languagewise;
	private String totalMark_languagewise;
	private String totalObtainedMark_languagewise_;


	@Override
	public int compareTo(ApplicantMarksDetailsNewDto arg0) {
		if(arg0!=null && this!=null){
			if(this.getSemesterNo() > arg0.getSemesterNo())
				return 1;
			else if(this.getSemesterNo() < arg0.getSemesterNo())
				return -1;
			else
				return 0;
		}
		return 0;
	}

}
