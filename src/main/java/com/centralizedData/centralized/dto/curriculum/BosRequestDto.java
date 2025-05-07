package com.centralizedData.centralized.dto.curriculum;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BosRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

    private Long BosId;
    private Integer academicYear;
    private String semType;
    private Integer semesterNo;
    private Long streamId;
    private Long departmentId;
    private Long programTypeId;
    private Long programId;
    private List<Long> courseIds;
    private String yearOfIntroduction;
    private String percentage;
    private MultipartFile mom;
//    private MultipartFile syllabus;

}
