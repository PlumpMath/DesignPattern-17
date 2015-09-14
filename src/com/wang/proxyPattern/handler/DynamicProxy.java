package com.wang.proxyPattern.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ��̬������
 * @author HeJW
 *
 * @param <T>
 */
public class DynamicProxy<T> {
	
	public static <T> T newProxyInstance( ClassLoader loader, Class<?>[] interfaces,
			InvocationHandler h){
		
		if(true){
			//ִ��һ��ǰ��֪ͨ
			(new BeforAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
		
	}
}
