package com.pacific.behavioral.command;

class TurnOnCommand implements Command {

	Television televison;

	
	public TurnOnCommand(Television televison) {
		super();
		this.televison = televison;
	}


	@Override
	public void execute() {
		televison.turnOn();

	}

}
