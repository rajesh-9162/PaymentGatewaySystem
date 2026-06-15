package com.indravex.PaymentGatewaySystem.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.indravex.PaymentGatewaySystem.notification.service.NotificationService;

@Service
public class SMSAlertService {

	@Autowired
	@Qualifier("smsNotificationService")
	private NotificationService notificationService;

	public void sendSMS() {
		notificationService.sendNotification("Payment Completed");
	}
}
