package com.indravex.PaymentGatewaySystem.processor.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;

@Component("credit")
public class CreditCardPayment implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Credit Card Payment Processed: "+amount);
	}

}
