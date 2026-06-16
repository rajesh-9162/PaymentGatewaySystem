package com.indravex.PaymentGatewaySystem.gateway.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.gateway.service.PaymentGateway;

@Component
public class StripeGateway implements PaymentGateway{

	@Override
	public void connect() {
		System.out.println("Connected Stripe");
	}

}
