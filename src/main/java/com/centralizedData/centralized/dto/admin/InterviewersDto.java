package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewersDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2252052372118460165L;
	private int id;
	private InterviewScheduleDto interviewSchedule;
	private RoomDto room;
	private String description;
	private Date createdDate;
	private Date lastModifiedDate;

}
