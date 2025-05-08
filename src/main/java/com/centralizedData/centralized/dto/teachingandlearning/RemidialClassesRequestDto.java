package com.centralizedData.centralized.dto.teachingandlearning;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemidialClassesRequestDto implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -8578258043711557611L;
	
	
	private Long remidialClassId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private Long streamId;
	private Long departmentId;
	private Long programTypeId;
	private Long programId;
	private List<Long> courseIds;
	private String courseTitle;
	private MultipartFile attendanceEntry;
	private MultipartFile remidialEntry;

}
