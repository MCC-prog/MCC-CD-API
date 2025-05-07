package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantLateralDetailsDto implements Serializable,Comparable<ApplicantLateralDetailsDto> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2049002846618173802L;
	
	private long id;
	private long admApplnId;
	private String semesterName;
	private String maxMarks;
	private String minMarks;
	private String marksObtained;
	private String yearPass;
	private String monthPass;
	private int semesterNo;
	private String universityName;
	private String stateName;
	private String instituteAddress;

	@Override
	public int compareTo(ApplicantLateralDetailsDto arg0) {
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
