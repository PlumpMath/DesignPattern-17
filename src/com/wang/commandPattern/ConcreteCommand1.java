package com.wang.commandPattern;

public class ConcreteCommand1 extends Command {

	// ��˭�ɻ�
	private Receiver receiver;

	/**
	 * ͨ�����캯�������ݸɻ�ġ��ˡ�
	 * 
	 * @param receiver
	 */
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * �������Ҫ��ʲô��
	 */
	@Override
	public void execute() {
	
		receiver.doSomthing1();
		receiver.doSomthing2();
	}

}
