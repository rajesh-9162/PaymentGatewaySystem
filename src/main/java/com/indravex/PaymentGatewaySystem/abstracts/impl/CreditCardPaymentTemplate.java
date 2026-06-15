package com.indravex.PaymentGatewaySystem.abstracts.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.abstracts.AbstractPaymentTemplate;

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
		System.out.println("Credit Card Transaction Success");
	}

	@Override
	public void sendNotification() {
		System.out.println("SMS Notification Sent");
	}

}
