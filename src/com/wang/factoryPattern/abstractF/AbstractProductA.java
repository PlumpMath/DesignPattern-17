package com.wang.factoryPattern.abstractF;

/**
 * Aϵ���Ʒ
 * @author HeJW
 *
 */
public abstract class AbstractProductA implements IProduct {
	
	public void shareMethod(){
		System.out.println("ÿ����Ʒ���еķ���B");
	}
	
	public abstract void doSomething();
	
}
