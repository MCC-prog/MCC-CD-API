package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InterviewSelectionScheduleDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1281730879916622054L;

	private int id;
	private int programId;
	private String selectionProcessDate;
	private String cutOffDate;
	private int maxNoSeatsOnline;
	private int maxNoSeatsOffline;
	private Boolean isActive;
	private Integer createdBy;
	private Date createdDate;
	private Integer modifiedBy;
	private Date lastModifiedDate;
	private String programName;
	private String academicYear;
	private String allottedSeats;
	private String selectionProcessVenue;
	private String examCenterId;
	private String examCentreName;
	private String venueName;
	private int totalAppliedStudents;
}
