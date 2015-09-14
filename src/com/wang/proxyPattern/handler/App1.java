package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;

public class App1 {
	
	public static void main(String[] args) {
		
		//����һ������
		Subject subject = new  RealSubject();
		
		//����һ��Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		//��������Ĵ���
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(), handler);
		proxy.doSomething(" hello handler ");
		
	}
}
