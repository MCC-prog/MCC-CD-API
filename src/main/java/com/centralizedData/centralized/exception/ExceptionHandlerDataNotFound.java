package com.centralizedData.centralized.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerDataNotFound {
	
	@ExceptionHandler(value=DataNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNoDataException(DataNotFoundException dnfe){
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		exceptionInfo.setMsg(dnfe.getMessage());
		return new ResponseEntity<ExceptionInfo>(exceptionInfo, HttpStatus.NOT_FOUND);
		
	}

}