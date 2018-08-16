package com.learn.cmd;

public class TVOnCommand implements ICommand {

	private TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		// TODO Auto-generated method stub
		tv.tvOn();
	}

	public void undo() {
		// TODO Auto-generated method stub
		tv.tvOff();
	}

}
