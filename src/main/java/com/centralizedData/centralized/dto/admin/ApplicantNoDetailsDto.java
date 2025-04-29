package com.centralizedData.centralized.dto.admin;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantNoDetailsDto {

	private Integer applicationNo;
	
	private Integer appliedYear;
}
