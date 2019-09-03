/**
 * 
 */
package com.pacific.behavioral.strategy;

/**
 * @author pragangw1
 *
 */
class PaypalStrategy implements PaymentStrategy {

	@Override
	public boolean pay() {
		System.out.println("paying through paypal...");
		return true;
	}

}
