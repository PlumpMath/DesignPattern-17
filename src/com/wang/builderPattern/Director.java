package com.wang.builderPattern;

/**
 * ������
 * @author HeJW
 *
 */
public class Director {

	private Builder builder = new ConcerteProduct();
	
	//���첻ͬ�Ĳ�Ʒ
	public Product getProduct(){
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 */
		builder.setPart();
		return builder.builderProduct();
	}
	
}
