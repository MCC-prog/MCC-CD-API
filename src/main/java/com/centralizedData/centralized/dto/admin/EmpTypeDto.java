package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpTypeDto {
	
	private String id;
	private String emptypeName;
	private String timeIn;
	private String timeInEnds;
	private String timeOut;
	private String saturdayTimeOut;
	private String halfDayStartTime;
	private String halfDatyEndTime;
	private String leaveInitializeMonth;
	private String timeInMin;
	private String timeInEndMIn;
	private String timeOutMin;
	private String saturdayTimeOutMin;
	private String halfDayStartTimeMin;
	private String halfDayEndTimeMin;
	private String halfDayEndTime;

}
