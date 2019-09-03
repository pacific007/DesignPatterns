package com.pacific.behavioral.command;

class Remote {
	Command command;

	public void setCommand(Command cmd) {
		this.command = cmd;
	}

	public void press() {
		command.execute();
	}
}
