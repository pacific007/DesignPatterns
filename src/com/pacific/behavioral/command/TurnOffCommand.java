package com.pacific.behavioral.command;

class TurnOffCommand implements Command {

	Television televison;

	public TurnOffCommand(Television televison) {
		super();
		this.televison = televison;
	}

	@Override
	public void execute() {
		televison.turnOff();

	}

}
