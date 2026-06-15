package com.indravex.PaymentGatewaySystem.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {

	public void saveTransaction() {
		System.out.println("Transaction Saved In Database");
	}
}
