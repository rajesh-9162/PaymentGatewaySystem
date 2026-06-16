package com.indravex.PaymentGatewaySystem.template.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.template.service.AbstractPaymentTemplate;

@Component
public class CreditCardPaymentTemplate extends AbstractPaymentTemplate{

	@Override
	public void validate() {
		System.out.println("Validating Card Number");	
	}

	@Override
	public void calculateCharges(double amount) {
		System.out.println("Charge = ₹" + amount * 0.02);		
	}

	@Override
	public void process(double amount) {
		System.out.println("Processing Credit Card Payment: "+amount);
	}

	@Override
	public void sendNotification() {
		System.out.println("SMS Notification Sent");
	}

}
