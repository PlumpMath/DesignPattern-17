package com.wang.strategyPattern.example;

/**
 * �ӷ�����ģʽ
 * 
 * @author HeJW
 * 
 */
public class Add implements Calculator {

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}
