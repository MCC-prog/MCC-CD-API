package com.centralizedData.centralized.dto.admin;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import com.centralizedData.centralized.model.admin.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneratePasswordDto {
	
	private List<ProgramTypeDto> programTypeList;
	private String method;
	private List<Student> rejectedList;
	private List<StudentLoginDto> successList;
	private boolean studentMailid;
	private boolean studentRollNo;
	private boolean studentRegNo;
	private boolean sameUseridPassword;
	private String sendMail;
	private String userName;
	private String resetPwd;
	private String message;
	private String registerNoEntry;
	private boolean rollNumber;
	private String isSup;
	private Long programId;
	private Integer academicYear;

}
