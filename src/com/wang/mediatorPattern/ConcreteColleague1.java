package com.wang.mediatorPattern;

/**
 * ����ͬ����1
 * @author HeJW
 *
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	/*
	 * �Լ��ܹ�����������
	 */
	public void selfMethod1(){
		System.out.println("�����Լ���ҵ���߼�");
	}
	
	/**
	 * �Լ��첻�����£���Ҫ������ͬ����Э����ɣ�ί�и��н���
	 */
	public void depMethod1(){
		System.out.println("�Լ����ܶ�����ɵ�ҵ���߼�");
		super.mediator.doSomthing1();
	}

}
