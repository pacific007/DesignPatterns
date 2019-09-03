package com.pacific.creational.prototype;

interface Prototypeable extends Cloneable {
	public Prototypeable clone() throws CloneNotSupportedException;
}
