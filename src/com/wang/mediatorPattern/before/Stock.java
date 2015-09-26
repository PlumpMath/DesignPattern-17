package com.wang.mediatorPattern.before;

/**
 * ������
 * 
 * @author HeJW
 * 
 */
public class Stock {

	private static int COMPUTER_NUMBER = 100;

	/**
	 * �������
	 * 
	 * @param number
	 *            �����
	 */
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("�������Ϊ" + COMPUTER_NUMBER);
	}

	/**
	 * ��潵��
	 * 
	 * @param number
	 *            �����
	 */
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("�������Ϊ" + COMPUTER_NUMBER);
	}

	/**
	 * ��ÿ������
	 * 
	 * @return �������
	 */
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	/**
	 * ���ѹ����֪ͨ�ɹ���Ա��Ҫ�ɹ���������Ա��������
	 */
	public void clearStock() {

		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("����������Ϊ��" + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBuyIBM();
	}
}
