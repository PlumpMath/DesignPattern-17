package com.wang.commandPattern;

/**
 * ���������</br>ÿ����������߶����봦��һ����ҵ���߼�
 * 
 * @author HeJW
 * 
 */
public class ConcreteReceiver1 extends Receiver {

	@Override
	public void doSomthing1() {
		System.out.println("ConcreteReceiver1------doSomthing1");
	}

	@Override
	public void doSomthing2() {
		System.out.println("ConcreteReceiver1------doSomthing2");
	}

}
