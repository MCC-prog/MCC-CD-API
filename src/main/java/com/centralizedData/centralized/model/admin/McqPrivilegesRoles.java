package com.centralizedData.centralized.model.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.centralizedData.centralized.model.user.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mcq_privileges_roles")
public class McqPrivilegesRoles implements Serializable {

	private static final long serialVersionUID = 1391023147326096760L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long mcqPrivilegesRolesId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roles_id")
	private Role role;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mcq_privilege_id")
	private McqPrivileges mcqPrivilege;

	public Long getMcqPrivilegesRolesId() {
		return mcqPrivilegesRolesId;
	}

	public void setMcqPrivilegesRolesId(Long mcqPrivilegesRolesId) {
		this.mcqPrivilegesRolesId = mcqPrivilegesRolesId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public McqPrivileges getMcqPrivilege() {
		return mcqPrivilege;
	}

	public void setMcqPrivilege(McqPrivileges mcqPrivilege) {
		this.mcqPrivilege = mcqPrivilege;
	}

}

