package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubjectGroupDto {

	private Long  id;
	
	private Long courseId;
	
	private String courseName;
	
	private String subjectGroupName;
	
	private Long subjectGroupId;
	
	private List<Long> subjectEntryId;
	
	private List<String> subjectEntryName;
	
	private Boolean commonSubjectGroup;
	
	private Long secondLanguageId;
	
	private String secondLanguageName;
	
	private Integer IsRc;

	private Long programId;
	
	private Long programTypeId;
	
	private String programName;
	
	private String programTypeName;
	
	private String year;
	
	private String classSchemeId;
	
	private String[] subjectGroupIds;
	
	private List<SubjectGroupNewDto> subjectGroupNewDto;
	
	private List<SubjectGroupNewDto> subjGroupHistId;
	
	private String studentId;
	
	//private Map<Long,ExamStudentSubGrpHistoryDto> subjHistMap;
	
//	private List<ExamStudentSubGrpHistory> studentSubHistoryList;
	
	private String classHistId;
	
	private String className;
	
	private String previousClassId;
	
	
}
