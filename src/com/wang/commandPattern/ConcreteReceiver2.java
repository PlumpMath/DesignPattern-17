package com.wang.commandPattern;

/**
 * ���������</br>ÿ����������߶����봦��һ����ҵ���߼�
 * 
 * @author HeJW
 * 
 */
public class ConcreteReceiver2 extends Receiver {

	@Override
	public void doSomthing1() {
		System.out.println("ConcreteReceiver2------doSomthing1");
	}

	@Override
	public void doSomthing2() {
		System.out.println("ConcreteReceiver2------doSomthing2");
	}

}
