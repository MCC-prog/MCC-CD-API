package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

public class KeyValueDto extends ExamCourseUtilDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2764891539611965922L;

	public KeyValueDto(Long id, String display) {
		super();
		this.setId(id);
	    this.setDisplay(display);
	}

//	public KeyValueDto(Integer id, String display) {
//		super(id, display);
//	}
	
}
