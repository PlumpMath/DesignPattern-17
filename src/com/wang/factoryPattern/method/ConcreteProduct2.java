package com.wang.factoryPattern.method;

/**
 * �����Ʒ��2
 * @author HeJW
 *
 */
public class ConcreteProduct2 implements Product {

	public ConcreteProduct2(){
		System.out.println("ConcreteProduct2 ������");
	}
	
	@Override
	public void method1() {
		System.out.println("yy");
	}

	@Override
	public String method2(String args) {
		return args;
	}

}
