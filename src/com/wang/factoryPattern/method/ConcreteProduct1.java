package com.wang.factoryPattern.method;

/**
 * �����Ʒ��1
 * @author HeJW
 *
 */
public class ConcreteProduct1 implements Product {

	public ConcreteProduct1(){
		System.out.println("ConcreteProduct1 ������");
	}
	
	@Override
	public void method1() {
		System.out.println("xx");
	}

	@Override
	public String method2(String args) {
		return args;
	}

}
