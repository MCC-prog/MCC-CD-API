package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdmissionNoEntryDto {

	private Long  id;

	private Long  programTypeId;

	private String programTypeName;

	private Integer startNo;

	private String prefix;

	private Integer year;

	private Integer currentNo;

}
