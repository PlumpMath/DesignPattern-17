package com.wang.factoryPattern.method;

/**
 * ���������Ľӿ�
 * @author HeJW
 *
 */
public interface Factory {
	
	/*
	 * ����һ����Ʒ����������������Ϳ�����������
	 * ͨ��ΪString��Enum��Class�ȣ���ȻҲ����Ϊ��
	 */
	
	//��������ΪClass
	public <T extends Product> T productFactory1(Class<T> c);
	
	//��������ΪString
	public Product productFactory2(String product);
}
