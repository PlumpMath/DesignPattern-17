package com.wang.mediatorPattern.before;

public class App {

	public static void main(String[] args) {

		System.out.println("-------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase();
		purchase.buyIBMComputer(100);

		System.out.println("-------������Ա���۵���--------");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);

		System.out.println("-------��������Ա�������--------");
		Stock stock = new Stock();
		stock.clearStock();
	}
}
