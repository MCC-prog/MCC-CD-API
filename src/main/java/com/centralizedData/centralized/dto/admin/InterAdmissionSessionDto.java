package com.centralizedData.centralized.dto.admin;

import java.util.Date;

import com.centralizedData.centralized.utils.CommonUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterAdmissionSessionDto {
	
	private long id;
	private String isInterdisciplinary;
	private String isApplicationOpen;
	private String courseId;
	private String semesterNameId;
	private String deleted;
	private String registrationFrom;
	private String registrationTill;

}
