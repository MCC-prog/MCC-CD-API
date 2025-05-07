package com.centralizedData.centralized.dto.admin;

import com.centralizedData.centralized.model.admin.Student;
import com.centralizedData.centralized.model.admin.StudentLogin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentLoginDto {

	private int studentLoginId;
	private String originalPassword;
	private StudentLogin originalBO;
	private Student originalStudent;
	private String studentUsername;
	private String parentUsername;
	private String parentPassword;
	private String studentName;
	
	private String studentMail;
	private String parentMail;
}
