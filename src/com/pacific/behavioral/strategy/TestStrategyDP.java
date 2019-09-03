/**
 * 
 */
package com.pacific.behavioral.strategy;

/**
 * @author pragangw1
 *
 */
public class TestStrategyDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CheckoutOrder order = new CheckoutOrder();
		order.setStrategy(new PaypalStrategy());
		order.payAndAcknowledge();

	}

}
