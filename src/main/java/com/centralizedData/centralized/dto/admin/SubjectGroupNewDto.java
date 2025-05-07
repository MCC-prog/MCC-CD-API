package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectGroupNewDto {

	private Long id;
	private String name;
	private String subjectNames;
	private CourseNewDto courseTO;
	private Set<SubjectGroupSubjectsDto> subjectGroupSubjectsetTO;
	private SubjectGroupSubjectsDto subjectGroupSubjectsTO;
	
	private String createdBy;;
	private String modifiedBy;
	private Date createdDate;
	private Date lastModifiedDate;
	private String isActive;
	private List<SubjectGroupSubjectsDto> subjectGroupSubjectsTOList;
	private String cDate;
	private String lDate;
	
	
	private Boolean isCommonSubGrp;
	private Integer secondLanguageId;
	private String programTypeName;
	private String programName;
	private String courseName;
	private long programTypeId;
	private long courseId;
	private long programId;
	private String religionSubjectId;
}
