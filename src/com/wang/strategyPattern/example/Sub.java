package com.wang.strategyPattern.example;

/**
 * ��������ģʽ
 * 
 * @author HeJW
 * 
 */
public class Sub implements Calculator {

	@Override
	public int exec(int a, int b) {
		return a - b;
	}

}
