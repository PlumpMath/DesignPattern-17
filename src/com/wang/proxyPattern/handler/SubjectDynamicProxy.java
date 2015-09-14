package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;

/**
 * ����ҵ��Ķ�̬����
 * @author HeJW
 *
 */
@SuppressWarnings("rawtypes")
public class SubjectDynamicProxy extends DynamicProxy {
	
	public static <T> T newProxyInstance( Subject subject ){
		
		//���ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		
		//��ýӿ�����
		Class<?>[] classes = subject.getClass().getInterfaces();
		
		//���handler 
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		return newProxyInstance(loader, classes, handler);
	}
}
