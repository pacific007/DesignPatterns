/**
 * 
 */
package com.pacific.behavioral.strategy;

/**
 * @author pragangw1
 *
 */
class NetBankingStrategy implements PaymentStrategy {
	@Override
	public boolean pay() {
		System.out.println("paying through internet banking...");
		return false;
	}
}
