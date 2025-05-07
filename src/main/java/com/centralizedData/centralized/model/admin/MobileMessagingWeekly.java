package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="mobile_messaging_weekly")
public class MobileMessagingWeekly implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="destination_number")
	private String destinationNumber;
	
	@Column(name="message_body")
	private String messageBody;
	
	@Column(name="message_priority")
	private Integer messagePriority;
	
	@Column(name="sender_number")
	private String senderNumber;
	
	@Column(name="sender_name")
	private String senderName;
	
	@Column(name="message_enqueue_date")
	private Date messageEnqueueDate;
	
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
	
	@Column(name="student_id")
	private Integer studentId;
	
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name="to_date")
	private Date toDate;

}

