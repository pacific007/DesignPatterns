package com.pacific.structural.flyweight;

public class ThickPen implements Pen {

	final PenSize penSize = PenSize.THICK; //intrinsic
	private String color; // extrinsic

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing THICK content in color : " + color);

	}

}
