package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="student_sms_details")
public class SendingSmsInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -601990470614856076L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@Column(name="student_id")
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student studentId;
	@Column(name="appln_no")
	private Integer applnNo;
	@Column(name="message_body")
	private String messageBody;
	@Column(name="sending_date")
	private Date sendingDate;
	@Column(name="destination_number")
	private String destinationNumber;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	@Column(name="message_priority")
	private Integer messagePriority;
	@Column(name="sender_number")
	private String senderNumber;
	@Column(name="sender_name")
	private String senderName;
	@Column(name="message_status")
	private String messageStatus;
	@Column(name="retry_count")
	private Integer retryCount;
	@Column(name="gateway_error_string")
	private String gatewayError;
	@Column(name="gateway_guid")
	private String gatewayGuid;
	@Column(name="is_message_sent")
	private Boolean isMessageSent;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	public Integer getMessagePriority() {
		return messagePriority;
	}

	public void setMessagePriority(Integer messagePriority) {
		this.messagePriority = messagePriority;
	}

	public String getSenderNumber() {
		return senderNumber;
	}

	public void setSenderNumber(String senderNumber) {
		this.senderNumber = senderNumber;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public Integer getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
	}

	public String getGatewayError() {
		return gatewayError;
	}

	public void setGatewayError(String gatewayError) {
		this.gatewayError = gatewayError;
	}

	public String getGatewayGuid() {
		return gatewayGuid;
	}

	public void setGatewayGuid(String gatewayGuid) {
		this.gatewayGuid = gatewayGuid;
	}

	public Boolean getIsMessageSent() {
		return isMessageSent;
	}

	public void setIsMessageSent(Boolean isMessageSent) {
		this.isMessageSent = isMessageSent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getApplnNo() {
		return applnNo;
	}

	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getDestinationNumber() {
		return destinationNumber;
	}

	public void setDestinationNumber(String destinationNumber) {
		this.destinationNumber = destinationNumber;
	}

	public Date getSendingDate() {
		return sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		this.sendingDate = sendingDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}


	public void setApplnNo(Integer applnNo) {
		this.applnNo = applnNo;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
