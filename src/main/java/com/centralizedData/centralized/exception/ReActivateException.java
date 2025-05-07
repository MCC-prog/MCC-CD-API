package com.centralizedData.centralized.exception;

public class ReActivateException extends Exception {
	
	Long id = 0l;
	
	public ReActivateException() {
	}

	public ReActivateException(Long id) {
		this.id = id;
	}

	public ReActivateException(String msg) {
		super(msg);
	}
	
	public Long getID(){
		return id;
	}
	

	public ReActivateException(Exception e) {
		super(e);
	}

}
