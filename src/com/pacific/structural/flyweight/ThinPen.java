package com.pacific.structural.flyweight;

public class ThinPen implements Pen {

	final PenSize penSize = PenSize.THIN; //intrinsic
	private String color; // extrinsic

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing THIN content in color : " + color);

	}

}
