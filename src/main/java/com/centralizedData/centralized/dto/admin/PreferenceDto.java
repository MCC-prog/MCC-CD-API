package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreferenceDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5178121268039965596L;
	
	private Integer id;
	private String programTypeId;
	private String programId;
	private String courseId;
	private String firstprefCourseName;
	private String firstprefCourseCode;
	private String firstprefPgmName;
	private String firstprefPgmTypeName;
	private String secondprefCourseName;
	private String secondprefCourseCode;
	private String secondprefPgmName;
	private String secondprefPgmTypeName;
	private String thirdprefCourseName;
	private String thirdprefCourseCode;
	private String thirdprefPgmName;
	private String thirdprefPgmTypeName;
	private String firstPrefCourseId;
	private String secondPrefCourseId;
	private String thirdPrefCourseId;
	private String firstPrefProgramId;
	private String secondPrefProgramId;
	private String thirdPrefProgramId;
	private String firstPrefProgramTypeId;
	private String secondPrefProgramTypeId;
	private String thirdPrefProgramTypeId;
	private List<CourseNewDto> prefcourses;
	private List<ProgramTypeNewDto> prefProgramtypes;
	private List<ProgramNewDto> prefprograms;
	private String selectedPrefId;
	
	private Integer firstPerfId;
	private Integer secondPerfId;
	private Integer thirdPerfId;

}
