package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramTypeDto {
	
	private Long Id;
	
	private String name;
	
	private List<ProgramDto> programs;
	private String ageFrom;
	private String ageTo;

}
