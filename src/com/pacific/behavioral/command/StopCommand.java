package com.pacific.behavioral.command;

class StopCommand implements Command {

	Fan fan;

	
	public StopCommand(Fan fan) {
		super();
		this.fan = fan;
	}


	@Override
	public void execute() {
		fan.stop();

	}

}
