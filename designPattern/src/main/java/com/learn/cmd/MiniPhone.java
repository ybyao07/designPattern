package com.learn.cmd;

import java.util.ArrayList;

/**
 * https://blog.csdn.net/wwh578867817/article/details/51533263
 * @author ybyao07
 *
 */
public class MiniPhone {

	private ArrayList<ICommand> commands;
	public MiniPhone() {
		this.commands = new ArrayList<ICommand>();;
	}
	public ArrayList<ICommand> getCommands() {
		return commands;
	}
	public void setCommand(ICommand command) {
		commands.add(command);
	}
	
	public void whenPushOnButton(int slot) {
		((ICommand)commands.get(slot-1)).execute();
	}
	
	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightCommand = new LightOnCommand(light);
		TV tv = new TV();
		TVOnCommand tvOnCommand = new TVOnCommand(tv);	
		MiniPhone phone = new MiniPhone();
		phone.setCommand(lightCommand);
		phone.setCommand(tvOnCommand);	
		phone.whenPushOnButton(1);
		phone.whenPushOnButton(2);
	}
	
}
