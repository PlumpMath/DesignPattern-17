package com.wang.iteratorPattern;

/**
 * ��������
 * 
 * @author wang
 * 
 */
public interface Aggregete {

	/**
	 * ���Ԫ��
	 * 
	 * @param object
	 */
	public void add(Object object);

	/**
	 * �Ƴ�Ԫ��
	 * 
	 * @param object
	 */
	public void remove(Object object);

	/**
	 * �ɵ�������������Ԫ��
	 * 
	 * @return
	 */
	public Iterator iterator();
}
