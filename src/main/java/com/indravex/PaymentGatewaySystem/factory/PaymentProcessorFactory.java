package com.indravex.PaymentGatewaySystem.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.payment.service.PaymentProcessor;
import com.indravex.PaymentGatewaySystem.payment.service.impl.CreditCardPayment;
import com.indravex.PaymentGatewaySystem.payment.service.impl.NetBankingPayment;
import com.indravex.PaymentGatewaySystem.payment.service.impl.UPIPayment;
import com.indravex.PaymentGatewaySystem.payment.service.impl.WalletPayment;

@Component
public class PaymentProcessorFactory {
	
	@Autowired
	private Map<String, PaymentProcessor> paymentProcessors;

	 public PaymentProcessor getPaymentProcessor(String paymentType) {

	        PaymentProcessor processor = paymentProcessors.get(paymentType.toLowerCase());
	        
	        if(processor == null) {
	        	throw new RuntimeException("Invalid Payment Type");
	        }

	       return processor;
	    }
}
