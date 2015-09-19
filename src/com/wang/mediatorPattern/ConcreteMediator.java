package com.wang.mediatorPattern;

/**
 * �����н���
 * @author HeJW
 *
 */
public class ConcreteMediator extends Mediator {

	@Override
	public void doSomthing1() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	@Override
	public void doSomthing2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

}
