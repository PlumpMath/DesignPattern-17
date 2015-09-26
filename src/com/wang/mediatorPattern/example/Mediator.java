package com.wang.mediatorPattern.example;

/**
 * �����н���
 * 
 * @author HeJW
 * 
 */
public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... object) {

		if (str.equals("purchase.buy")) {
			this.buyComputer((Integer) object[0]);
		} else if (str.equals("sale.sell")) {
			this.sellComputer((Integer) object[0]);
		} else if (str.equals("sale.offsell")) {
			this.offSell();
		} else if (str.equals("stock.clear")) {
			this.clearStock();
		}
	}

	/**
	 * �ɹ�����
	 * 
	 * @param number
	 */
	private void buyComputer(int number) {

		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) { // ���������
			System.out.println("�ɹ�����" + number + "̨");
			super.stock.increase(number);
		} else { // �����������
			int buyNumber = number / 2;
			System.out.println("�ɹ�����" + number + "̨");
			super.stock.increase(buyNumber);
		}
	}

	/**
	 * ���۵���
	 * 
	 * @param number
	 */
	private void sellComputer(int number) {

		if (stock.getStockNumber() < number) { // ���������������
			super.purchase.buyIBMComputer(number);
		}
		System.out.println("���۵��ԣ�" + number + "̨");
		super.stock.decrease(number);
	}

	/**
	 * �ۼ����۵���
	 */
	private void offSell() {
		System.out.println("�۰����۵���" + super.stock.getStockNumber() + "̨");
	}

	/**
	 * ��ִ���
	 */
	private void clearStock() {

		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

}
