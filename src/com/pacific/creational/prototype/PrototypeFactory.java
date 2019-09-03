package com.pacific.creational.prototype;

import java.util.HashMap;
import java.util.Map;

class PrototypeFactory {
	public static final String DEVIL = "devil";
	private static Map<String, Prototypeable> prototypes = new HashMap<String, Prototypeable>();

	static {
		prototypes.put(DEVIL, new Devils());

	}

	public static Prototypeable getInstance(final String s) throws CloneNotSupportedException {
		return ((Prototypeable) prototypes.get(s)).clone();
	}
}
