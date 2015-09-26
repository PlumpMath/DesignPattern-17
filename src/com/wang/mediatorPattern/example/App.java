package com.wang.mediatorPattern.example;

public class App {

	public static void main(String[] args) {

		AbstractMediator mediator = new Mediator();

		System.out.println("-------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMComputer(100);

		System.out.println("-------������Ա���۵���--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);

		System.out.println("-------��������Ա�������--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
