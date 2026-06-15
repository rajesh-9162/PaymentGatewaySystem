package com.indravex.PaymentGatewaySystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.indravex.PaymentGatewaySystem.PaymentService.SMSAlertService;
import com.indravex.PaymentGatewaySystem.abstracts.impl.CreditCardPaymentTemplate;
import com.indravex.PaymentGatewaySystem.abstracts.impl.UPIPaymentTemplate;
import com.indravex.PaymentGatewaySystem.abstracts.impl.WalletPaymentTemplate;
import com.indravex.PaymentGatewaySystem.config.AppConfig;
import com.indravex.PaymentGatewaySystem.controller.PaymentController;
import com.indravex.PaymentGatewaySystem.factory.PaymentProcessorFactory;
import com.indravex.PaymentGatewaySystem.payment.service.PaymentProcessor;

public class App {
	 public static void main(String[] args) {

	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        System.out.println("===== FACTORY PATTERN =====");

	        PaymentProcessorFactory factory = context.getBean(PaymentProcessorFactory.class);

	        PaymentProcessor processor = factory.getPaymentProcessor("upi");

	        processor.processPayment(5000);

	        System.out.println();

	        System.out.println("===== TEMPLATE PATTERN =====");

	        UPIPaymentTemplate upiTemplate = context.getBean(UPIPaymentTemplate.class);

	        upiTemplate.makePayment(1000);

	        System.out.println();

	        CreditCardPaymentTemplate credit = context.getBean(CreditCardPaymentTemplate.class);

	        credit.makePayment(5000);

	        System.out.println();

	        WalletPaymentTemplate wallet = context.getBean(WalletPaymentTemplate.class);

	        wallet.makePayment(1500);

	        System.out.println();

	        System.out.println("===== DEPENDENCY INJECTION =====");

	        PaymentController controller = context.getBean(PaymentController.class);

	        controller.execute();

	        System.out.println();

	        System.out.println("===== QUALIFIER =====");

	        SMSAlertService sms = context.getBean(SMSAlertService.class);

	        sms.sendSMS();
	    }
}
