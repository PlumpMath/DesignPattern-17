package com.wang.adapterPattern;

public class APP {

	public static void main(String[] args) {

		Target target = new ConcreteTarget();
		target.request();

		/**
		 * ���������Ľ�ɫ
		 */
		Target targetAdapter = new Adapter();
		targetAdapter.request();
	}
}
