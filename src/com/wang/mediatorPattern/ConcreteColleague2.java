package com.wang.mediatorPattern;

/**
 * ����ͬ����2
 * @author HeJW
 *
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	/*
	 * �Լ��ܹ�����������
	 */
	public void selfMethod2(){
		System.out.println("�����Լ���ҵ���߼�");
	}
	
	/**
	 * �Լ��첻�����£���Ҫ������ͬ����Э����ɣ�ί�и��н���
	 */
	public void depMethod2(){
		System.out.println("�Լ����ܶ�����ɵ�ҵ���߼�");
		super.mediator.doSomthing2();
	}

}
