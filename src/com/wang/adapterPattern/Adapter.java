package com.wang.adapterPattern;

/**
 * ��������ɫ
 * 
 * @author wang
 * 
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}
}
