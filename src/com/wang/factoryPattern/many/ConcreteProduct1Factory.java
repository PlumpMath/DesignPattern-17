package com.wang.factoryPattern.many;

import com.wang.factoryPattern.method.ConcreteProduct1;
import com.wang.factoryPattern.method.Product;

/**
 * ConcreteProduct1������ʵ����
 * @author HeJW
 *
 */
public class ConcreteProduct1Factory implements ProductFacory {

	@Override
	public Product productFactory() {
		return new ConcreteProduct1();
	}

}
