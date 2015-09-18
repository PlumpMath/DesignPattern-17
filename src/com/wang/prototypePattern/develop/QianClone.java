package com.wang.prototypePattern.develop;

import java.util.ArrayList;

/**
 * ǳ����
 * 
 * @author HeJW
 * 
 */
public class QianClone implements Cloneable {

	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	protected QianClone clone() {

		QianClone qian = null;
		try {
			qian = (QianClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return qian;
	}
	
	public void setValue( String value ){
		this.arrayList.add(value);
	}
	
	public ArrayList<String> getValue(){
		return this.arrayList;
	}
	
	public static void main(String[] args) {
		
		QianClone qian = new QianClone();
		qian.setValue("����");
		
		QianClone qianClone = qian.clone();
		qianClone.setValue("����");
		
		System.out.println(qian.getValue());
	}

}