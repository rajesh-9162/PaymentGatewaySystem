package com.indravex.PaymentGatewaySystem.abstracts.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.abstracts.AbstractPaymentTemplate;

@Component
public class UPIPaymentTemplate extends AbstractPaymentTemplate{

	@Override
	public void validate() {
		System.out.println("Validating UPI ID");
		
	}

	@Override
	public void calculateCharges(double amount) {
		System.out.println("UPI charge = 0");
		
	}

	@Override
	public void process(double amount) {
		System.out.println("UPI Transaction Success");
	}

	@Override
	public void sendNotification() {
		System.out.println("Instant Push Notification Sent");
	}

}
