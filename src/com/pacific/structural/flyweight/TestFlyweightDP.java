package com.pacific.structural.flyweight;

public class TestFlyweightDP {

	public static void main(String[] args) {
		Pen redPen = PenFactory.getThickPen("RED"); // created new pen
		redPen.draw("Hello World !!");

		Pen redPen2 = PenFactory.getThickPen("RED"); // pen is shared
		redPen2.draw("Hello World !!");

		Pen bluePen = PenFactory.getThickPen("BLUE"); // created new pen
		bluePen.draw("Blue Pen!!");

		System.out.println("Red pens are using same object.");
		System.out.println(redPen.hashCode());
		System.out.println(redPen2.hashCode());

		System.out.println(bluePen.hashCode());

	}

}
