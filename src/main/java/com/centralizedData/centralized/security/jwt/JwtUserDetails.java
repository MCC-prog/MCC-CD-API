package com.centralizedData.centralized.security.jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUserDetails implements UserDetails {

	private static final long serialVersionUID = 5155720064139820502L;

	private final Integer userId;
	private final String username;
	private final String password;
	private final Collection<? extends GrantedAuthority> authorities;
	private final String token;
	private final Set<String> mcqPrivilegeRole;

	public JwtUserDetails(Integer userId, String username, String password, Set<String> roles, String token,
			Set<String> mcqPrivilegeRole) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.mcqPrivilegeRole = mcqPrivilegeRole;

		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		if (roles != null) {
			roles.forEach(role -> {
				authorities.add(new SimpleGrantedAuthority(role));
			});

		}
		this.authorities = authorities;
		this.token = token;
	}

	@JsonIgnore
	public Integer getUserId() {
		return userId;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getToken() {
		return token;
	}

	public Set<String> getMcqPrivilegeRole() {
		return mcqPrivilegeRole;
	}

}
