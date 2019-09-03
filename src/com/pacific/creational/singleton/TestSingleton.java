package com.pacific.creational.singleton;

import java.lang.reflect.Constructor;

public class TestSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonPattern instance = SingletonPattern.getInstance();
		SingletonPattern instance2 = SingletonPattern.getInstance();

		//test of creation of single Object
		System.out.println(instance2.hashCode() == instance.hashCode());
		
		// will throw java.lang.InstantiationError:
		SingletonPattern reflectionInstance = testReflection();

		System.out.println(
				"Object 1 hashcode " + instance.hashCode() + " Object 2 hashcode " + reflectionInstance.hashCode());
		;
		
		// will throw java.lang.CloneNotSupportedException
		SingletonPattern clonedInstance = (SingletonPattern) instance.clone();
		
		System.out.println(clonedInstance.hashCode());
	}

	private static SingletonPattern testReflection() {
		SingletonPattern instance2 = null;
		try {
			@SuppressWarnings("rawtypes")
			Constructor[] constructors = SingletonPattern.class.getDeclaredConstructors();
			for (@SuppressWarnings("rawtypes") Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (SingletonPattern) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return instance2;
	}

}
