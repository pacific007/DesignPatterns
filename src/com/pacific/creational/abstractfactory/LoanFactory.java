/**
 * 
 */
package com.pacific.creational.abstractfactory;

/**
 * @author pragangw1
 *
 */
class LoanFactory extends ServiceProvider {

	public Loan getLoan(String loanType) {
		Loan loan = null;
		switch (loanType) {
		case "homeloan":
			loan = new HomeLoan();
			break;

		default:
			break;
		}
		return loan;
	}

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

}
