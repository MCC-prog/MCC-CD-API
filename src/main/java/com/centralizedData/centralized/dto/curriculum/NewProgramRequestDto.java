package com.centralizedData.centralized.dto.curriculum;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NewProgramRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3796984297930265803L;

	private Long newProgramId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private Long streamId;
	private Long departmentId;
	private Long programTypeId;
	private Long programId;
	private String programName;
	private String yearOfIntroduction;
	private MultipartFile mom;
	private MultipartFile syllabus;

}
