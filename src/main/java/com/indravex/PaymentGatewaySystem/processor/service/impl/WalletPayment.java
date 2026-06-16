package com.indravex.PaymentGatewaySystem.processor.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;

@Component("wallet")
public class WalletPayment implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Wallet Payment Processed: "+amount);	
	}

}
