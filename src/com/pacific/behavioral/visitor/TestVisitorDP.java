package com.pacific.behavioral.visitor;

import java.util.Arrays;

public class TestVisitorDP {

	public static void main(String[] args) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		CartElement[] items = new CartElement[] { new Book(20, "ISTN789"), new Book(100, "ISTN7895678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };
		int totalPrice = Arrays.asList(items).stream().mapToInt(item -> item.accept(visitor)).sum();
		System.out.println("Total Cost = " + totalPrice);
	}

}
