package com.indravex.PaymentGatewaySystem.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import com.indravex.PaymentGatewaySystem.factory.PaymentProcessorFactory;
import com.indravex.PaymentGatewaySystem.gateway.service.PaymentGateway;
import com.indravex.PaymentGatewaySystem.notification.service.NotificationService;
import com.indravex.PaymentGatewaySystem.processor.service.PaymentProcessor;
import com.indravex.PaymentGatewaySystem.repository.TransactionRepository;


@Service
public class PaymentService {

	private TransactionRepository transactionRepository;
	private AuditService auditService;

	@Autowired
	@Qualifier("smsNotificationService")
	private NotificationService notificationService;

	@Autowired
	public PaymentService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Autowired
	public void setAuditService(AuditService auditService) {
		this.auditService = auditService;
	}

	@Autowired
	private PaymentGateway razorpayGateway;

	@Autowired
	private PaymentProcessorFactory factory;

	public void makePayment(String type, double amount) {

		razorpayGateway.connect();

		PaymentProcessor processor = factory.getPaymentProcessor(type);
		processor.processPayment(amount);

		transactionRepository.saveTransaction();

		auditService.log();

		notificationService.sendNotification("Payment Successful");
	}
}
