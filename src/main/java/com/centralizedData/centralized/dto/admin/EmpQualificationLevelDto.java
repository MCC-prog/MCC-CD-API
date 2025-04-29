package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpQualificationLevelDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3282800797057039560L;
	private int id;
	private String educationId;
	private String course;
	private String specialization;
	private String yearOfComp;
	private String grade;
	private String institute;
	//private Map<String,String> fixedMap;
	private String qualificationName;
	private Map<String,String> levelMap;
	private String qualification;
	private String year;
	private int educationDetailsID; 
	private String focus;
	private String degree;
	private String nameOfUniversity;
	private String qstate;
	private String percentage;
	private String attempts;
	private String fixedDisplay;

}
