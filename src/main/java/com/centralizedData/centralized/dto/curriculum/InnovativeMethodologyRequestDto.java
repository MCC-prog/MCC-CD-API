package com.centralizedData.centralized.dto.curriculum;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InnovativeMethodologyRequestDto implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 7921667772898437366L;

	private Long innovativeMethodologyId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private List<Long> courseIds;
	private String courseTitle;
	private MultipartFile innovativePedagogy;

}
