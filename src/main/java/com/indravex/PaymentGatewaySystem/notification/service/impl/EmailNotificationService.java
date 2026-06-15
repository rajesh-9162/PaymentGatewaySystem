package com.indravex.PaymentGatewaySystem.notification.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.indravex.PaymentGatewaySystem.notification.service.NotificationService;

@Service
@Primary
public class EmailNotificationService implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println("EMAIL: "+message);
	}

}
