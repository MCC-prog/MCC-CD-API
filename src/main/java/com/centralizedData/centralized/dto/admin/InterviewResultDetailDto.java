package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewResultDetailDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 947487987765564632L;
	
	private int id;
	private int interviewResultId;
	private int gradeObtainedId;
	private String comments;
}
