package com.pacific.behavioral.command;

class StartCommand implements Command {

	Fan fan;

	public StartCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.start();

	}

}
