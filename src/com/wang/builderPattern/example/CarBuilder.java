package com.wang.builderPattern.example;

import java.util.ArrayList;

/**
 * ����������װ��
 * @author HeJW
 *
 */
public abstract class CarBuilder {
	
	//��װ˳��
	public abstract void setSequence(ArrayList<String> sequence);
	
	//��װ֮�󣬵õ�����ģ��
	public abstract CarModel getCarModel();
}
