package com.wang.ResponsibilityChainPattern.example;

public class Husband extends Handler {

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {

		System.out.println("�������ɷ���ʾ");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�ͬ����");
	}

}
