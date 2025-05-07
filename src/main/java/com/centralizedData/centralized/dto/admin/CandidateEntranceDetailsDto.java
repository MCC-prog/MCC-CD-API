package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandidateEntranceDetailsDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5773577996064500845L;

	private Long id;
	private Long entranceId;
	private Long admApplnId;
	private String yearPassing;
	private String monthPassing;
	private String marksObtained;
	private String totalMarks;
	private String entranceRollNo;
	private String entranceName;
	private String appeared;
    private MultipartFile document;
    private Boolean documentPresent;
    private Integer studentOnlineApplicationId;
}
