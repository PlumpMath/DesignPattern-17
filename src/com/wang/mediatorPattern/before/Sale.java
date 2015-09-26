package com.wang.mediatorPattern.before;

import java.util.Random;

/**
 * ���۹���
 * 
 * @author HeJW
 * 
 */
public class Sale {

	/**
	 * ���۵���
	 * 
	 * @param number
	 */
	public void sellIBMComputer(int number) {

		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < number) { // ���������������
			purchase.buyIBMComputer(number);
		}
		System.out.println("���۵��ԣ�" + number + "̨");
		stock.decrease(number);
	}

	/**
	 * �����������
	 * 
	 * @return
	 */
	public int getSaleStatus() {

		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("�����������Ϊ��" + saleStatus);
		return saleStatus;
	}

	/**
	 * �ۼ۴���
	 */
	public void offSale() {

		Stock stock = new Stock();
		System.out.println("�۰����۵���" + stock.getStockNumber() + "̨");
	}
}
