package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssignDepartmentDto {
	
	private Long id;
	
	private Long courseId;
	
	private List<Long> departmentId;
	
	private Long departmentId1;
	
	private String departmentName;
	
	private String courseName;
	
	

}	
