package com.wang.templatePattern.develop;

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
		
		//���������ж��������ִ�в�ִ��
		if ( this.condition() ) {
			this.method2();
		}
		
		this.method3();
	}
	
	//���Ӻ���
	protected boolean condition() {
		return true;
	}
	
}
