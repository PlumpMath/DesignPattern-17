package com.wang.builderPattern;

/**
 * ���彨����
 * @author HeJW
 *
 */
public class ConcerteProduct extends Builder {

	private Product product = new Product();
	
	//���ò�Ʒ���
	@Override
	public void setPart() {
		/**
		 * ��Ʒ���ڵ��߼�����
		 */
	}

	@Override
	public Product builderProduct() {
		return product;
	}

}
