package com.learn.cmd;

public class LightOnCommand implements ICommand {

	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.light.lightOn();
	}

	public void undo() {
		// TODO Auto-generated method stub
		this.light.lightOff();
	}	
	
}
