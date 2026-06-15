package com.indravex.PaymentGatewaySystem.gateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.indravex.PaymentGatewaySystem.gateway.service.PaymentGateway;

public class GatewayTester {

	@Autowired
	private PaymentGateway razorpayGateway;

	public void test() {
		razorpayGateway.connect();
	}
}
