package com.wang.decoratorPattern;

/**
 * �����װ����
 * 
 * @author HeJW
 * 
 */
public class ConcreteDecorator2 extends Decorator {

	/**
	 * ���屻������
	 * 
	 * @param component
	 */
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	/**
	 * �����Լ��ķ�������������
	 */
	private void method2() {
		System.out.println("method2 ����");
	}

	/**
	 * ��ִ�й��������󣬽�������
	 */
	@Override
	public void operate() {
		super.operate();
		this.method2();
	}
}
