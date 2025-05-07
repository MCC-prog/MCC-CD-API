package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReGeneratePasswordDto {
	
	private boolean studentMailid;
	private boolean studentRollNo;
	private boolean studentRegNo;
	private boolean sameUseridPassword;
	private String sendMail;
	private String registerNoEntry;

}
