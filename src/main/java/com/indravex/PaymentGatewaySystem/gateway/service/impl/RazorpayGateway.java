package com.indravex.PaymentGatewaySystem.gateway.service.impl;

import com.indravex.PaymentGatewaySystem.gateway.service.PaymentGateway;

public class RazorpayGateway implements PaymentGateway{

	@Override
	public void connect() {
		System.out.println("Connected To Razorpay");
	}

}
