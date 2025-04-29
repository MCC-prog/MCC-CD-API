package com.centralizedData.centralized.dto.admin;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamCenterDto {
	
	private Long id;
	
	private Long programId;
	
	private String programName;
	
	private String centerName;
	
	private Integer seatNoFrom;
	
	private Integer seatNoTo;
	
	private Integer currentSeatNo;
	
	private String seatNoPrefix;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private String address4;

}
