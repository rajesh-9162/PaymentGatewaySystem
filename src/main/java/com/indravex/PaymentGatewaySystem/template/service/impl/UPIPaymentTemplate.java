package com.indravex.PaymentGatewaySystem.template.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.template.service.AbstractPaymentTemplate;

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
		System.out.println("Processing UPI Payment "+amount);
	}

	@Override
	public void sendNotification() {
		System.out.println("Instant Notification Sent");
	}

}
