package com.indravex.PaymentGatewaySystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.indravex.PaymentGatewaySystem.config.AppConfig;
import com.indravex.PaymentGatewaySystem.controller.PaymentController;
import com.indravex.PaymentGatewaySystem.factory.PaymentProcessorFactory;
import com.indravex.PaymentGatewaySystem.gateway.service.impl.GatewayTester;
import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;
import com.indravex.PaymentGatewaySystem.template.service.impl.CreditCardPaymentTemplate;
import com.indravex.PaymentGatewaySystem.template.service.impl.UPIPaymentTemplate;
import com.indravex.PaymentGatewaySystem.template.service.impl.WalletPaymentTemplate;

public class App {
	 public static void main(String[] args) {

	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        PaymentController controller = context.getBean(PaymentController.class);

	        controller.execute();
	        
	    }
}
