/**
 * 
 */
package com.pacific.behavioral.strategy;

/**
 * @author pragangw1
 *
 */
class CheckoutOrder {
	
	private PaymentStrategy strategy;

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void payAndAcknowledge() {
		boolean success = strategy.pay();
		System.out.println("Payment " + (success ? "success" : "failed"));
	}
	

}
