package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewProgramCourseNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4985116479022715563L;
	
	private int id;
	private String createdBy;;
	private String modifiedBy;
	private ProgramNewDto program;
	private CourseNewDto course;
	private String totalMarks;
	private String passingMarks;
	private String sequence;
	private Date createdDate;
	private Date lastModifiedDate;
	private String name;
	private String content;
	private Set<InterviewDto> interviews = new HashSet<InterviewDto>(0);
	private Set<InterviewSelectedDto> interviewSelecteds = new HashSet<InterviewSelectedDto>(
			0);
	private int year;
	private String programTypeName;
	private String programName;
	private String courseName;
	private int programTypeId;
	private int programId;
	private int courseId;
	private String isActive;
	private String academicYear;
	private String cDate;
	private String lDate;
	private String interviewsPerPanel;
	private String combinedYear;
	private boolean intDefinitionSel;

}
