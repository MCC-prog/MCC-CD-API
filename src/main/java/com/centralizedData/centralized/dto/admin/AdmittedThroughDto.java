package com.centralizedData.centralized.dto.admin;

import java.time.Instant;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdmittedThroughDto {

	private Long id;

	private String name;

	private String admittedThroughCode;

	private Instant createdDate;

	private Instant lastModifiedDate;

}
