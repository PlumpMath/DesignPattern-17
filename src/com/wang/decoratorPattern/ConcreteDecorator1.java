package com.wang.decoratorPattern;

/**
 * �����װ����
 * 
 * @author HeJW
 * 
 */
public class ConcreteDecorator1 extends Decorator {

	/**
	 * ���屻������
	 * 
	 * @param component
	 */
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	/**
	 * �����Լ��ķ�������������
	 */
	private void method1() {
		System.out.println("method1 ����");
	}

	/**
	 * ��ִ�й�������ǰ����������
	 */
	@Override
	public void operate() {
		this.method1();
		super.operate();
	}
}
