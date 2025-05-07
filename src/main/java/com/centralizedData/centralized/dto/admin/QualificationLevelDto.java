package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QualificationLevelDto {

	
	private Long qualificationId;
	private String qualificationName;
	
//	private int id;
//	private String name;
	private Integer displayOrder;
	private Boolean fixedDisplay;
	private Boolean phdQualification;
}
