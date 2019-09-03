/**
 * 
 */
package com.pacific.creational.prototype;

/**
 * @author pragangw1
 *
 */
class Devils implements Prototypeable {
	private String devilName = null;

	public String getName() {
		return devilName;
	}

	public void setName(String name) {
		this.devilName = name;
	}

	@Override
	public Devils clone() throws CloneNotSupportedException {
		System.out.println("Cloning Devils object..");
		return (Devils) super.clone();
	}

	@Override
	public String toString() {
		return "Devils";
	}
}
