package com.wang.factoryPattern.singleton;

/**
 * ������
 * @author HeJW
 *
 */
public class Singleton {
	
	private Singleton(){
		//������ͨ��New������һ������
		System.out.println("singleton ����");
	};
	
	public void method(){
		System.out.println("singleton ���");
	}
}
