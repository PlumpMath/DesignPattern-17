package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬�����Handler
 * @author HeJW
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	//������Ķ���
	private Object target = null;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.target, args);
	}

}
