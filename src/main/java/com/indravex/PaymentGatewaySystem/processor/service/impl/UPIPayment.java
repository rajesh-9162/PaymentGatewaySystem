package com.indravex.PaymentGatewaySystem.processor.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;

@Component("upi")
public class UPIPayment implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing UPI Payment: " + amount);
		
	}

}
