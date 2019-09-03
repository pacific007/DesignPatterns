/**
 * 
 */
package com.pacific.creational.abstractfactory;

/**
 * @author pragangw1
 *
 */
class BankFactory extends ServiceProvider {

	public Loan getLoan(String loanType) {
		return null;
	}

	@Override
	public Bank getBank(String type) {
		Bank bank = null;
		switch (type) {
		case "hdfc":
			bank = new HDFCBank();
			break;

		default:
			break;
		}
		return bank;
	}

}
