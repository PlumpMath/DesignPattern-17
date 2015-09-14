package com.wang.singletonPattern;

/**
 * ����ʽ����
 * @author HeJW
 *
 */
public class Singleton2 {

	private static Singleton2 singleton2 = null;
	
	private Singleton2(){
		System.out.println("����Singleton2ʵ��");
	}
	
	//�������synchronized�ؼ��֣��̲߳���ȫ
	public static synchronized Singleton2 getSingleton2(){
		
		if( singleton2 == null ){
			singleton2 = new Singleton2();
		}
		
		return singleton2;
	}
	
}
