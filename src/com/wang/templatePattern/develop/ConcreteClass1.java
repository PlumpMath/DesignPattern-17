package com.wang.templatePattern.develop;

/**
 * ����ģ����1
 * @author HeJW
 *
 */
public class ConcreteClass1 extends AbstractClass {

	private boolean condition = true;
	
	//�ж������ɿͻ��˾���,Ĭ��ִ��
	public void setCondition( boolean condition ){
		this.condition = condition;
	}
	
	@Override
	protected boolean condition() {
		return this.condition;
	}

	@Override
	protected void method1() {
		System.out.println("1 1");
	}

	@Override
	protected void method2() {
		System.out.println("1 2");
	}

	@Override
	protected void method3() {
		System.out.println("1 3");
	}

}
