package com.pacific.behavioral.command;

public class TestCommandDP {

	public static void main(String[] args) {
		Fan fan = new Fan();
		
		Remote remote = new Remote();
		remote.setCommand(new StartCommand(fan));
		remote.press();
		
		remote.setCommand(new StopCommand(fan));
		remote.press();

	}

}
