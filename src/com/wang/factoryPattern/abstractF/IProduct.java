package com.wang.factoryPattern.abstractF;

/**
 * ��Ʒ�ӿڶ���
 * @author HeJW
 *
 */
public interface IProduct {
	
	//ÿ����Ʒ���еķ���
	public void shareMethod();
	
	//ÿ����Ʒ��ͬ�ķ�������ͬ��ʵ��
	public abstract void doSomething();
}
