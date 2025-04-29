package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentEntryDto {

    private Long id;
	
	private String name;
	
	private String code;
	
	private Long streamId;
	
	private String streamName;
	
	private Integer webId;
	
	private Boolean isAcademic;
	
	private String hodmail;
}
