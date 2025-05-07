package com.centralizedData.centralized.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationNoEntryDto {
	
	private Long id;

	private String onlineApplnNoFrom; 
	
	private String onlineApplnNoTo;
	
	private String offlineApplnNoFrom;
	
	private String offlineApplnNoTo;
	
	private String currentOnlineApplnNo;
	
	private String currentOfflineApplnNo;
	
	private List<Long> programId;
	
	private List<String> programName;
	
	private Long programTypeId;
	
	private String programTypeName;
	
	private Integer year;
	
	private List<String> courseName;
	
	private List<Long> courseId;
}
