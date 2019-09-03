package com.pacific.creational.singleton;

import java.io.Serializable;

class SingletonPattern implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static volatile SingletonPattern INSTANCE;

	/**
	 * Use this code to prevent creation of Object Using JAVA reflection API
	 * 
	 */
	private SingletonPattern() {
		if(INSTANCE != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static SingletonPattern getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonPattern.class) {
				INSTANCE = new SingletonPattern();
			}
		}
		return INSTANCE;
	}

	/**
	 * Implement readResolve() to prevent Serialization Issue
	 * 
	 * @return INSTANCE
	 */
	protected Object readResolve() {
		return INSTANCE;
	}

	/**
	 * Override clone method to prevent creation of object by cloning.
	 * 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
