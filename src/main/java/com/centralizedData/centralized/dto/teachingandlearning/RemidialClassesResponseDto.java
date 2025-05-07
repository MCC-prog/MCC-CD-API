package com.centralizedData.centralized.dto.teachingandlearning;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemidialClassesResponseDto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9195984659152132978L;
	
	
	private Long remidialClassId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private Long streamId;
	private String streamName;
	private Long departmentId;
	private String departmentName;
	private Long programTypeId;
	private String programTypeName;
	private Long programId;
	private String programName;
	private String courseTitle;
	private Map<Long, String> courses;
	private Map<String, String> documents;

}
