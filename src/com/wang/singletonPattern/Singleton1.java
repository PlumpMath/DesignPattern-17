package com.wang.singletonPattern;

/**
 * ��ʽ����
 * @author HeJW
 *
 */
public class Singleton1 {
	
	private static final Singleton1 singleton1 = new Singleton1();
	
	private Singleton1(){
		System.out.println("����Singleton1ʵ��");
	}
	
	/*
	 * ��������Ҫʹ�ø����ǣ�ͨ�����ø÷������õ������ʵ�������ҵõ�����Զ������һ��
	 */
	public static Singleton1 getSingleton1(){
		return singleton1;
	}
	
}
