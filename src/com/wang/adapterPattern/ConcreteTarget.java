package com.wang.adapterPattern;

/**
 * Ŀ���ɫʵ����
 * 
 * @author wang
 * 
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {

		System.out.println("ConcreteTarget");
	}

}
