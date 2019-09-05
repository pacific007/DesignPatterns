package com.pacific.behavioral.visitor;

interface CartElement {
	int accept(ShoppingCartVisitor visitor);
}
