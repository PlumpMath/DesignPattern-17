package com.wang.commandPattern.example;

/**
 * ʹ������ģʽ�Ŀͻ���
 * 
 * @author HeJW
 * 
 */
public class AppCommand {

	// public static void main(String[] args) {
	//
	// Invoker invoker = new Invoker();
	// Command command = new AddRequirementCommand();// �����Զ�����϶�����
	// invoker.setCommand(command);
	// invoker.action();
	// }

	public static void main(String[] args) {

		Invoker invoker = new Invoker();
		Command command = new DeletePageCommand();// �����Զ�����϶�����
		invoker.setCommand(command);
		invoker.action();
	}
	//......
	//ֻҪ��������Ȼ����ա�ִ�оͿ�����.
}
