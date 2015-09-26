package com.wang.mediatorPattern.example;

/**
 * �����н���
 * 
 * @author HeJW
 * 
 */
public abstract class AbstractMediator {

	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	public AbstractMediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}

	/**
	 * �н���ģʽ�е��¼�����</br> ����������֮��Ĺ�ϵ
	 * 
	 * @param str
	 * @param object
	 */
	public abstract void execute(String str, Object... object);
}
