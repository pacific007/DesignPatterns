package com.pacific.behavioral.visitor;

interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);

}
