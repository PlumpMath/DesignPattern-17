package com.wang.factoryPattern.abstractF;

/**
 * Bϵ���Ʒ
 * @author HeJW
 *
 */
public abstract class AbstractProductB implements IProduct {
	
	public void shareMethod(){
		System.out.println("ÿ����Ʒ���еķ���B");
	}
	
	public abstract void doSomething();
	
}
