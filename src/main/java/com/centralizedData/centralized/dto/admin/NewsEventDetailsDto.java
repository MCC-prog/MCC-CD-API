package com.centralizedData.centralized.dto.admin;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsEventDetailsDto {
	
	private Long id;
	
	private String eventTitle;
	
	private String eventDescription;
	
	private Date dateTo;
	
	private Date dateFrom;

}
