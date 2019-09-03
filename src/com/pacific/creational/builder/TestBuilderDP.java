/**
 * 
 */
package com.pacific.creational.builder;

/**
 * @author pragangw1
 *
 */
public class TestBuilderDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player player = new Player.PlayerBuilder("John", "DC", 3000).music("ROCK").build();

		System.out.println(player);

	}

}
