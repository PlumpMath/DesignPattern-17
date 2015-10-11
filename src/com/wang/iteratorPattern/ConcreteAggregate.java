package com.wang.iteratorPattern;

import java.util.Vector;

/**
 * ��������
 * 
 * @author wang
 * 
 */
public class ConcreteAggregate implements Aggregete {

	private Vector vector = new Vector(); // ���ɶ��������
	
	@Override
	public void add(Object object) {
		this.vector.add(object);
	}

	@Override
	public void remove(Object object) {
		this.remove(object);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(vector);
	}

}
