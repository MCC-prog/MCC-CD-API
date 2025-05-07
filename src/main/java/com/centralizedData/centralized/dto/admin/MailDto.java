package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailDto implements Serializable {
	
	
	private String fromName;
	private String fromAddress;
	private String toAddress;
	private String subject;
	private String message;
	private String attachedFile;
	private Map<String,String> messages;
	private String mailBody;
	private String passWord;
}