package com.pacific.structural.proxy;

public class EntityObjectImplProxy extends EntityObjectImpl {

	@Override
	public void load() {
		System.out.println("doing some work on proxy objects");
		super.load();

	}

}
