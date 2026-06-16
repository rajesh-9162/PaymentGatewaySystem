package com.indravex.PaymentGatewaySystem.gateway.service.impl;

import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.gateway.service.PaymentGateway;

@Component
public class RazorpayGateway implements PaymentGateway{

	@Override
	public void connect() {
		System.out.println("Connected Razorpay");
	}

}
