package com.pacific.structural.proxy;

public class TestProxyDP {

	public static void main(String[] args) {
		EntityObject object = new EntityObjectImplProxy();
		object.load();

	}

}
