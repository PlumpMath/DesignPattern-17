	package com.wang.builderPattern;
	
	/**
	 * ��������
	 * @author HeJW
	 *
	 */
	public abstract class Builder {
	
		//���ò�Ʒ�Ĳ�ͬ���֣��Ի�ò�ͬ��Ʒ
		public abstract void setPart();
		
		//�����Ʒ
		public abstract Product builderProduct();
		
	}
