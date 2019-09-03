package com.pacific.creational.abstractfactory;

abstract class ServiceProvider {

	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}
