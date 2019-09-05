package com.pacific.structural.flyweight;

public class MediumPen implements Pen {

	final PenSize penSize = PenSize.MEDIUM; //intrinsic
	private String color; // extrinsic

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing MEDIUM content in color : " + color);

	}

}
