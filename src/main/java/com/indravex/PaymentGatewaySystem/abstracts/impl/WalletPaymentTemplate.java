package com.indravex.PaymentGatewaySystem.abstracts.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.abstracts.AbstractPaymentTemplate;

@Component
public class WalletPaymentTemplate extends AbstractPaymentTemplate{

	@Override
	public void validate() {
		System.out.println("Wallet Balance Verified");	
	}

	@Override
	public void calculateCharges(double amount) {
		System.out.println("Wallet Charge = ₹1");
	}

	@Override
	public void process(double amount) {
		System.out.println("Wallet Payment Success");
	}

	@Override
	public void sendNotification() {
		System.out.println("Wallet Notification Sent");
	}

}
