package com.centralizedData.centralized.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.centralizedData.centralized.model.admin.SMS_Message;
import com.centralizedData.centralized.model.admin.SendingSmsInfo;

@Service
public class ConverationUtil {

	public List<SMS_Message> convertCandidateBototTo(List<SendingSmsInfo> mobileList) {
		List<SMS_Message> smsList=new ArrayList<SMS_Message>();
		if(mobileList!=null && !mobileList.isEmpty()){

			for(SendingSmsInfo mobileMessaging : mobileList) {
				SMS_Message sms = new SMS_Message();
				sms.setDestination_number(mobileMessaging.getDestinationNumber());
				sms.setMessageEnqueueDate(mobileMessaging.getSendingDate());
				sms.setMessage_body(mobileMessaging.getMessageBody());
				sms.setMessage_id(mobileMessaging.getId());
				if(mobileMessaging.getMessagePriority() != null)
					sms.setMessage_priority(Integer.toString(mobileMessaging.getMessagePriority()));
				if(mobileMessaging.getMessageStatus() != null)
					sms.setMessage_status(Integer.parseInt(mobileMessaging.getMessageStatus()));
				sms.setSender_name(mobileMessaging.getSenderName());
				sms.setSender_number(mobileMessaging.getSenderNumber());
				sms.setSms_gateway_response(mobileMessaging.getGatewayError());
				sms.setSms_guid(mobileMessaging.getGatewayGuid());				
				smsList.add(sms);
			}
		}
		return smsList;
	}

	public List<SendingSmsInfo> convertCandidateTotoBO(List<SMS_Message> mobileList) {
		List<SendingSmsInfo> smsList=new ArrayList<SendingSmsInfo>();
		if(mobileList!=null && !mobileList.isEmpty()){
			
			for(SMS_Message sms : mobileList) {
				SendingSmsInfo mobileMessaging=new SendingSmsInfo();
				mobileMessaging.setDestinationNumber(sms.getDestination_number());
				mobileMessaging.setMessageBody(sms.getMessage_body());
				mobileMessaging.setId(sms.getMessage_id());
				mobileMessaging.setSendingDate(sms.getMessageEnqueueDate());
				if(sms.getMessage_priority()!=null)
					mobileMessaging.setMessagePriority(Integer.parseInt(sms.getMessage_priority()));
				if(sms.getMessage_status()>0)
					mobileMessaging.setMessageStatus(Integer.toString(sms.getMessage_status()));
				mobileMessaging.setSenderName(sms.getSender_name());
				mobileMessaging.setSenderNumber(sms.getSender_number());
				mobileMessaging.setGatewayError(sms.getSms_gateway_response());
				mobileMessaging.setGatewayGuid(sms.getSms_guid());				
				smsList.add(mobileMessaging);
			}
		}
		return smsList;
	}
	
	
	

}
