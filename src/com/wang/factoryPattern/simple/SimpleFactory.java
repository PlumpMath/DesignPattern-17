package com.wang.factoryPattern.simple;

import com.wang.factoryPattern.method.Product;

/**
 * �򵥹�����
 * ���Ǽ��˸�static
 * @author HeJW
 *
 */
public class SimpleFactory {
	
	public static <T extends Product> T productFactory( Class<T> c ){
		Product product = null;
		try {
			product = (Product)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return (T)product;
	} 
	
}
