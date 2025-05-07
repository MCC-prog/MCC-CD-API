package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExcelDataDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -2242839574104285357L;
	
	private int applicationId;
	private String registrationNumber;
	private String section;
	private CourseNewDto courseTO;
	private String rollNumber;
	private int semester;
	private Date appliedYear;
	private String userId;
	private long classSchemeWiseId;
	private int studentId;
	private long classId;
	private int courseId;
	private int subjectId;
	private int certificateId;
	private String certificateName;
	private String admissionNo;	

}
