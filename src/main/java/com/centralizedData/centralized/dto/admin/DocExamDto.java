package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocExamDto {
	
	private Long id;
	
	private String name;
	
	private Long doctypeId;
	
	private String docName;

}
