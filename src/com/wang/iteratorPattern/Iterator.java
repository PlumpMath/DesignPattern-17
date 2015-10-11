package com.wang.iteratorPattern;

/**
 * ���������
 * 
 * @author wang
 * 
 */
public interface Iterator {

	/**
	 * ������һ��Ԫ��
	 * 
	 * @return
	 */
	public Object next();

	/**
	 * �Ƿ������β��
	 * 
	 * @return
	 */
	public boolean hasNext();

	/**
	 * ɾ����ǰָ����Ԫ��
	 * 
	 * @return
	 */
	public boolean remove();
}
