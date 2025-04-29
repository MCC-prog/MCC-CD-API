package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PayScaleDto {

	private String id;
	private String payScale;
	private String scale;
	private Boolean isTeachingStaf;
}
