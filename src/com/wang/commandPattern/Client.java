package com.wang.commandPattern;

public class Client {

	public static void main(String[] args) {
		
		//���ȶ���һ��ִ���������
		Invoker invoker = new Invoker();
		
		//��������ߣ�Ҳ���Ǹ�ʲô��
		Receiver receiver = new ConcreteReceiver1();
		
		//��������
		Command command = new ConcreteCommand1(receiver);
		
		//�����������ִ���ߣ���ִ��
		invoker.setCommand(command);
		invoker.action();
	}

}
