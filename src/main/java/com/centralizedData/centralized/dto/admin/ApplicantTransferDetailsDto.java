package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantTransferDetailsDto implements Serializable,Comparable<ApplicantTransferDetailsDto>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1993011027837969800L;

	private long id;
	private long admApplnId;
	private String semesterName;
	private String maxMarks;
	private String minMarks;
	private String marksObtained;
	private String yearPass;
	private String monthPass;
	private String universityAppNo;
	private String registationNo;
	private String arrearDetail;
	private String instituteAddr;
	private int semesterNo;
	
	
	@Override
	public int compareTo(ApplicantTransferDetailsDto arg0) {
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
