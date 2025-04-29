package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpOnlineEducationalDetailsDto implements Serializable {
	
	
	private String course;
	private String specialization;
	private String grade;
	private int yearOfCompletion;
	private String institute;

}
