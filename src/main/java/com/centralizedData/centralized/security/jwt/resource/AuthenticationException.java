package com.centralizedData.centralized.security.jwt.resource;

public class AuthenticationException extends RuntimeException{

	private static final long serialVersionUID = 2156157690010343032L;

	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

