package com.wang.factoryPattern.abstractF;

/**
 * ���󹤳�����
 * @author HeJW
 *
 */
public interface IProductFactory {
	
	//Aϵ���Ʒ����
	public AbstractProductA productAFactory();
	
	//Bϵ���Ʒ����
	public AbstractProductB productBFactory();
}
