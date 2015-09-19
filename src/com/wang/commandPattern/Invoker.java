package com.wang.commandPattern;

/**
 * ִ���������
 * 
 * @author HeJW
 * 
 */
public class Invoker {

	private Command command;

	/**
	 * ��������
	 * 
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * ִ������
	 */
	public void action() {
		this.command.execute();
	}
}
