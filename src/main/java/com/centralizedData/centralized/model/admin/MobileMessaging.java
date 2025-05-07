package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="mobile_messaging")
public class MobileMessaging implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5716423821828476727L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
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
	
	@Column(name="gateway_guid")
	private String gatewayGuid;
	
	@Column(name="attendance_date")
	private Date attendanceDate;
	
	@Column(name="is_message_sent")
	private Boolean isMessageSent;
	
	@Column(name="student_id")
	private Integer studentId;
	
	@Column(name="gateway_error_string")
	private String gatewayError;

}
