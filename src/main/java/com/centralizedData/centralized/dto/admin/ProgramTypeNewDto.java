package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramTypeNewDto {

	private Long programTypeId;
	private String programTypeName;
	private List<ProgramNewDto> programs;
	private String ageFrom;
	private String ageTo;
}
