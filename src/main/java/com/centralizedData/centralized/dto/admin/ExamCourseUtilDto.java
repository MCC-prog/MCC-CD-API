package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

public class ExamCourseUtilDto implements Serializable,Comparable<ExamCourseUtilDto> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9143854046998500985L;
	
	private Long id;
	private String display;
	
//	public ExamCourseUtilDto() {
//		super();
//	}
//
//	public ExamCourseUtilDto(Long id, String display) {
//		super();
//		this.id = id;
//		this.display = display;
//	}
			
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}



	@Override
	public int compareTo(ExamCourseUtilDto arg0) {
		if(arg0!=null && this!=null && arg0.getDisplay()!=null
				 && this.getDisplay()!=null){
			return this.getDisplay().compareTo(arg0.getDisplay());
		}		
		else
		return 0;
	}

}
