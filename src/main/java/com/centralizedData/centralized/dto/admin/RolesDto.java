package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesDto implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -4481871716660650844L;
	private String roleId;
	private String roleName;

}