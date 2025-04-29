package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectGroupEntryDto {

	private List<ProgramTypeDto> programTypeList;
	private String method;
	private List<SubjectGroupNewDto> subjectGroupList;
	private List<SubjectDto> subjectList;
	private int subjectGroupEntryId;
	private String subjectGroupName;
	private Set<SubjectGroupSubjectsDto> subjectGroupSubjectSet;
	private Map<Integer,String> subjectsMap;
	private Map<Integer,String> tempMap;
	private String[] selectedSubjects;
	private String[] oldselectedSubjects;
	private String[] groupid;
	private SubjectGroupNewDto subjectGroupTO;
	private int selectedSubjectGroupEntryId;
	private int subjectGroupSubjectsId;
	private String[] movedSubjectsTORight;
	private Map<Integer,String> selectedSubjectsMap;
	private String selectedIndex;
	private int selectedSubjectGroupId;
	private Map<Integer, String> mapIds;
	private String searchSubLeft;
	private Integer secondLanguageId;
	private String commonSubjectGroup;
	private String religionSubjectId;
	
//	private List<KeyValueTO> listSecondLanguage ;
	private Map<Integer,Integer> groupMapId;
	private Boolean displayList;
	private String programTypeId;
	private String programId;
}
