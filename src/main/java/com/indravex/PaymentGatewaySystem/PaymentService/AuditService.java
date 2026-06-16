package com.indravex.PaymentGatewaySystem.PaymentService;

import org.springframework.stereotype.Service;

@Service
public class AuditService {

	public void log() {
		System.out.println("Audit Completed");
	}
}
