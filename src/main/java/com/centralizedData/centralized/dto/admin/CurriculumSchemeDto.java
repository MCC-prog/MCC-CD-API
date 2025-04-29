package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurriculumSchemeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8455777351661682489L;
	
	private String subjectname;
	private int subjectid;
	private String courseName;
	private String programTypeName;
	private String programName;
	private CourseNewDto courseTO;
	private String startDate;
	private String endDate;
	private int year;
	private int semister; 
	private long id;
	
	private int oldCourseId;
	private int oldYear;
	private int oldNoOfScheme;
	
	private Long courseId;
	private Long programId;
	private Long programTypeId;
	private Long courseSchemeId;
	private int noOfScheme;
	private String courseSchemeName; 
	private String subjectGroup[];
	private List<CurriculumSchemeDurationDto> curriculumDurationList;

	private List<Long> curriculumDurationIdList;
	
	private Set<CurriculumSchemeDurationDto>curriculumSchemeDurationTO = new HashSet<CurriculumSchemeDurationDto>();	

}
