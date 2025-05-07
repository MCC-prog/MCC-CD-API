package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckListAssignmentDto {

	private Long id;
	
	private String tempSelect;
	
	private String select;
	
	private String programType;
	
	private Long programTypeId;
	
	private String program;
	
	private Long progarmId;
	
	private String courseName;
	
	private Long courseId;
	
	private Integer academicYear;
	
	private Boolean needToProduce;
	
	private Boolean needToProduceSemwiseMc;
	
	private Boolean isMarksCard;
	
	private Boolean isConsolidatedMarks;
	
	private Boolean isSemesterWise;
	
	private Boolean isIncludeLanguage;
	
	private Boolean isPreviousExam;
	
	private Boolean isExamReq;
	
	private Long docTypeId;
	
	private String docTypeName;
	
	private Boolean isEducationInfo;
}
