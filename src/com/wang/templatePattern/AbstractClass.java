package com.wang.templatePattern;

/**
 * ����ģ����
 * @author HeJW
 *
 */
public abstract class AbstractClass {
	
	//��������
	protected abstract void  method1();
	protected abstract void  method2();
	protected abstract void  method3();
	
	//ģ�巽��
	final public void templateMethod(){
		//���û������������ҵ���߼�
		this.method1();
		this.method2();
		this.method3();
	}
	
	
}
