package com.centralizedData.centralized.model.admin;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="generate_mail")
public class GenerateMail implements java.io.Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 18085124392864531L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="from_name")
	private String fromName;
	
	@Column(name="from_address")
	private String fromAddress;
	
	@Column(name="to_address")
	private String toAddress;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="message")
	private String message;
	
	@Column(name="attachment")
	private String attachment;
	
	@Column(name="file_path")
	private String filePath;
	
	
	
	public GenerateMail() {
		super();
	}
	
	public GenerateMail(String fromName, String fromAddress, String toAddress,
			String subject, String message, String attachment) {
		super();
		this.fromName = fromName;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.subject = subject;
		this.message = message;
		this.attachment = attachment;
	}

	public GenerateMail(long id, String fromName, String fromAddress,
			String toAddress, String subject, String message,String attachment) {
		this.id = id;
		this.fromName = fromName;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.subject = subject;
		this.message = message;
		this.attachment=attachment;
	}
	public GenerateMail(String fromName, String fromAddress, String toAddress,
			String subject, String message, String attachment,String filePath) {
		super();
		this.fromName = fromName;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.subject = subject;
		this.message = message;
		this.attachment = attachment;
		this.filePath = filePath;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}

