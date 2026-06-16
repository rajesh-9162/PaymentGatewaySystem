package com.indravex.PaymentGatewaySystem.processor.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;

@Component("netbanking")
public class NetBankingPayment implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Net Banking Payment Processed: "+amount);	
	}

}
