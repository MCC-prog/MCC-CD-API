package com.centralizedData.centralized.security.jwt.resource;

import java.io.Serializable;

public class JwtSuccessResponse implements Serializable{
	private static final long serialVersionUID = 6384044039106911058L;

	private Integer status;
	
	private String  message;

	public JwtSuccessResponse(Integer status, String message) {
		this.status = status;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
