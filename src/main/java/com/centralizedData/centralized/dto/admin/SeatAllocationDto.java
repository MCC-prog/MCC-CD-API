package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatAllocationDto {

	
	private Long id;
	
	private Long admittedThroughId;
	
	private Long courseId;
	
	private Integer noOfSeats;
	
	private AdmittedThroughDto admittedThroughDto;
}
