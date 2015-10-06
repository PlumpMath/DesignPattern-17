package com.wang.strategyPattern;

/**
 * ��װ��ɫ
 * 
 * @author HeJW
 * 
 */
public class Context {

	private Strategy strategy = null;

	/**
	 * ͨ�����캯�����þ������
	 * 
	 * @param strategy
	 *            �������
	 */
	public Context(Strategy strategy) {

		this.strategy = strategy;
	}

	/**
	 * ��װ��Ĳ��Է���
	 */
	public void doAnything() {
		this.strategy.doSomething();
	}
}
