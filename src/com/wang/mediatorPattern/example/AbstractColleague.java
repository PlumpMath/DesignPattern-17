package com.wang.mediatorPattern.example;

/**
 * ����ͬ����
 * 
 * @author HeJW
 * 
 */
public abstract class AbstractColleague {

	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}
