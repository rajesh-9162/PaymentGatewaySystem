package com.indravex.PaymentGatewaySystem.template.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.template.service.AbstractPaymentTemplate;

@Component
public class WalletPaymentTemplate extends AbstractPaymentTemplate{

	@Override
	public void validate() {
		System.out.println("Validating Wallet");	
	}

	@Override
	public void calculateCharges(double amount) {
		System.out.println("Wallet Charge = 5");
	}

	@Override
	public void process(double amount) {
		System.out.println("Processing Wallet Payment: "+amount);
	}

	@Override
	public void sendNotification() {
		System.out.println("Wallet Notification Sent");
	}

}
