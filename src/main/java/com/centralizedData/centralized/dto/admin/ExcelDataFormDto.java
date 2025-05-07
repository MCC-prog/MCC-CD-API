package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
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
public class ExcelDataFormDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 118854588283666422L;
	
	private List<ProgramTypeNewDto> programTypeList;
	private MultipartFile  thefile;
	private String method;
	private String applicationYear;
	private String courseId;
	private String termNo;
	private String subId;
	private Map<Integer,String> subList;
	private String semister;

}
