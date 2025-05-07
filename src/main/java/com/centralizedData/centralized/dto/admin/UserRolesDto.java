package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRolesDto  implements Serializable{
	private static final long serialVersionUID = 2616210971421028155L;
	private String roleId;
	private String roleName;
}
