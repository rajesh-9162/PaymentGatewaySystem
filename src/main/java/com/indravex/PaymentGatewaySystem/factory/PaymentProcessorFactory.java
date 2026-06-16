package com.indravex.PaymentGatewaySystem.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;
import com.indravex.PaymentGatewaySystem.processor.service.impl.CreditCardPayment;
import com.indravex.PaymentGatewaySystem.processor.service.impl.NetBankingPayment;
import com.indravex.PaymentGatewaySystem.processor.service.impl.UPIPayment;
import com.indravex.PaymentGatewaySystem.processor.service.impl.WalletPayment;

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
