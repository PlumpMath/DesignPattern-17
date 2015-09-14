package com.wang.prototypePattern;

/**
 * ԭ��ģʽ
 * @author HeJW
 *
 */
public class PrototypeClass implements Cloneable {

	public PrototypeClass(){
		System.out.println("����");
	}
	
	@Override
	protected PrototypeClass clone() {
		
		PrototypeClass prototypeClass = null;
	
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return prototypeClass;
		
	}
	
	
}
