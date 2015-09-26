package com.wang.mediatorPattern.example;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	
	public void buyIBMComputer(int number) {
		//�Լ����ܶ�����ɵ����񽻸��н������
		super.mediator.execute("purchase.buy", number);
	}
	
	public void refuseBuyIBM() {
		
		System.out.println("���ٲɹ�����");
	}
}
