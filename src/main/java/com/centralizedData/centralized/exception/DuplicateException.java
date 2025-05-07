package com.centralizedData.centralized.exception;

public class DuplicateException extends Exception{

	private static final long serialVersionUID = 1L;

	public DuplicateException() {
	}

	public DuplicateException(String msg) {
		super(msg);
	}

	public DuplicateException(Exception e) {
		super(e);
	}
}
