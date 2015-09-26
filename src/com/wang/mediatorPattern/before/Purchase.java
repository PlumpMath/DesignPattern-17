package com.wang.mediatorPattern.before;

/**
 * �ɹ�����
 * 
 * @author HeJW
 * 
 */
public class Purchase {

	/**
	 * �ɹ�����
	 * 
	 * @param number
	 *            ��������
	 */
	public void buyIBMComputer(int number) {

		Stock stock = new Stock();
		Sale sale = new Sale();
		int saleStatus = sale.getSaleStatus();
		if (saleStatus > 80) { // ���������
			System.out.println("�ɹ�����" + number + "̨");
			stock.increase(number);
		} else { // �����������
			int buyNumber = number / 2;
			System.out.println("�ɹ�����" + number + "̨");
			stock.increase(buyNumber);
		}
	}

	/**
	 * ���ٲɹ�����
	 */
	public void refuseBuyIBM() {
	
		System.out.println("���ٲɹ�����");
	}
}
