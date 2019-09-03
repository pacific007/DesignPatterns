package com.pacific.creational.abstractfactory;

/**
 * Class will act as Abstract Factory getter
 * 
 * @author pragangw1
 *
 */
class FactoryProvider {

	public static ServiceProvider getFactory(String type) {
		if (type == "bank") {
			return new BankFactory();
		} else if (type == "loan") {
			return new LoanFactory();
		}
		return null;
	}
}
