package com.indravex.PaymentGatewaySystem.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indravex.PaymentGatewaySystem.notification.service.NotificationService;
import com.indravex.PaymentGatewaySystem.repository.TransactionRepository;


@Service
public class PaymentService {
	
	private TransactionRepository transactionRepository;
	private AuditService auditService;
	
	@Autowired
    private NotificationService notificationService;
	
	@Autowired
	public PaymentService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}
	
	@Autowired
	public void setAuditService(AuditService auditService) {
		this.auditService = auditService;
	}

	 public void makePayment() {

	        transactionRepository.saveTransaction();

	        auditService.log();

	        notificationService.sendNotification(
	                "Payment Successful");
	    }
}
