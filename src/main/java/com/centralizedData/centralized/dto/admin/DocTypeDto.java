package com.centralizedData.centralized.dto.admin;

import java.time.Instant;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocTypeDto {

	private Long id;

	private String name;

	private String description;

	private String docShortName;

	private String printName;

	private boolean educationaInfo;

	private Integer displayOrder;

	private Boolean isDisplay;

	private Boolean noMarksDisplay;
}
