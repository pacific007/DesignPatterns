package com.pacific.creational.abstractfactory;

public class TestAbstractFactoryDP {

	public static void main(String[] args) {
		ServiceProvider providerFactory = FactoryProvider.getFactory("bank");
		if (providerFactory == null) {
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }
		
		Bank bank = providerFactory.getBank("hdfc");
		if (bank != null) {
			bank.getBankName();
        } else {
            System.out.println("Bank with given name doesn't exist.");
        }
		

	}

}
