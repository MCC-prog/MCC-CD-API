package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrintPasswordDto {
	
	private String regNoFrom;
	private String regNoTo;
	List<String> messageList;	
	private String isRollNo;
	private String isStudent;
	private Integer academicYear;
	private Long programm;
	private Integer semester;
	private Long classes;
	private List<ProgramDto> programToList;
	private String rollNo;
	

}
