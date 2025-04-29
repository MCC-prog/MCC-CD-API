package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantMarksDetailsDto implements Serializable,Comparable<ApplicantMarksDetailsDto>{
	
	private Long id;
	private Long ednId;
	//private CourseScheme courseScheme;
	//private EdnQualification ednQualification;
	private Integer semesterNo;
	private String semesterName;
	private Integer maxMarks;
	private Integer marksObtained;
	private BigDecimal percentage;
	private Boolean isLastExam;
	private Integer maxMarksLanguagewise;
	private Integer marksObtainedLanguagewise;
	private BigDecimal percentageLanguagewise;
	
	
	@Override
	public int compareTo(ApplicantMarksDetailsDto arg0) {
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
