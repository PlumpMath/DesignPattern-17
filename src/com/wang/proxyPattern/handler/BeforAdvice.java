package com.wang.proxyPattern.handler;

/**
 * ֪ͨ��ʵ����
 * @author HeJW
 *
 */
public class BeforAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("ǰ��֪ͨ");
	}

}
