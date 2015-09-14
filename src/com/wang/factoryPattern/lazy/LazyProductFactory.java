package com.wang.factoryPattern.lazy;

import java.util.HashMap;
import java.util.Map;

import com.wang.factoryPattern.method.ConcreteProduct1;
import com.wang.factoryPattern.method.ConcreteProduct2;
import com.wang.factoryPattern.method.Product;

/**
 * ��ʱ��ʼ���Ĺ�����
 * @author HeJW
 *
 */
public class LazyProductFactory {
	
	private static final Map<String, Product> prMap = new HashMap<String, Product>();
	
	public static synchronized Product ProductFactory(String type){
		Product product = null;
		
		//���Map���Ѿ����������
		if ( prMap.containsKey(type) ) {
			product = prMap.get(type);
		} else {
		
			if( type.equals("ConcreteProduct1") ){
				product = new ConcreteProduct1();
			} else if (type.equals("ConcreteProduct2")) {
				product = new ConcreteProduct2();
			}
			
			//ͬʱ�Ѷ���ŵ�����������
			prMap.put(type, product);
			
		}
		
		return product;
	}
	
}
