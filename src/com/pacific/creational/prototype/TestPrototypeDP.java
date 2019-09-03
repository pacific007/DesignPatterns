/**
 * 
 */
package com.pacific.creational.prototype;

/**
 * @author pragangw1
 *
 */
public class TestPrototypeDP {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		String devils = PrototypeFactory.getInstance("devil").toString();
		System.out.println(devils);

	}

}
