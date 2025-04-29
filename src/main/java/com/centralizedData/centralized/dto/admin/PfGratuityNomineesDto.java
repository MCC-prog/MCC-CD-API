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
public class PfGratuityNomineesDto {

	private String id;
	private String nameAdressNominee;
	private String memberRelationship;
	private String dobMember;
	private String share;
	private String nameAdressGuardian;
	private String createdBy;
	private Instant createdDate;
	private String modifiedBy;
	private Instant lastModifiedDate;
	private Boolean isActive;
}
