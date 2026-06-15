package com.indravex.PaymentGatewaySystem.abstracts;

public abstract class AbstractPaymentTemplate {


	public final void makePayment(double amount) { 
		validate(); 
		calculateCharges(amount); 
		process(amount); 
		generateReceipt();
		sendNotification(); 
	}
	public abstract void validate();
	public abstract void calculateCharges(double amount);
	public abstract void process(double amount);
	public abstract void sendNotification();

	public void generateReceipt() {
		System.out.println("Receipt Generated");
	}

}
