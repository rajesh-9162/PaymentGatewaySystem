package com.indravex.PaymentGatewaySystem.gateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.gateway.service.PaymentGateway;

@Component
public class GatewayTester {

	@Autowired
	private PaymentGateway razorpayGateway;

	public void test() {
		razorpayGateway.connect();
	}
}
