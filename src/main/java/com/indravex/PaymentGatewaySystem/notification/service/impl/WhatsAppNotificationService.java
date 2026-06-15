package com.indravex.PaymentGatewaySystem.notification.service.impl;

import org.springframework.stereotype.Service;

import com.indravex.PaymentGatewaySystem.notification.service.NotificationService;

@Service
public class WhatsAppNotificationService implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println("WhatsApp : "+message);
	}

}
