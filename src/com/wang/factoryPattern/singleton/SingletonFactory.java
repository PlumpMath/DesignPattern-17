package com.wang.factoryPattern.singleton;

import java.lang.reflect.Constructor;

/**
 * �������ģʽ�Ĺ�����
 * @author HeJW
 *
 */
public class SingletonFactory {
	
	private static Singleton singleton;
	
	static{
		
		try{
			
			Class c1 = Class.forName(Singleton.class.getName());
			//����޲ι��캯��
			Constructor constructor = c1.getDeclaredConstructor();
			//�����޲ι��캯���ǿɷ��ʵ�
			constructor.setAccessible(true);
			//����һ��ʵ������
			singleton = (Singleton) constructor.newInstance();
		} catch( Exception e ){
			//�쳣����
		}
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
	
	
}
