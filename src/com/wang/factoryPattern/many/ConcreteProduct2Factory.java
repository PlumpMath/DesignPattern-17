package com.wang.factoryPattern.many;

import com.wang.factoryPattern.method.ConcreteProduct2;
import com.wang.factoryPattern.method.Product;

/**
 * ConcreteProduct2������ʵ����
 * @author HeJW
 *
 */
public class ConcreteProduct2Factory implements ProductFacory {

	@Override
	public Product productFactory() {
		return new ConcreteProduct2();
	}

}
