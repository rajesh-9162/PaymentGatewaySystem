package com.indravex.PaymentGatewaySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.indravex.PaymentGatewaySystem.PaymentService.PaymentService;


@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	public void execute() {
		paymentService.makePayment("upi",5000);
		System.out.println();
		paymentService.makePayment("credit", 5000);
		System.out.println();
		paymentService.makePayment("wallet", 1500);
	}
}
