package com.wang.singletonPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * ����ģʽ��չ������ָ��������ʵ��
 * @author HeJW
 *
 */
public class SingletonDevelop {

	//�����������������ʵ��
	private static int maxNum = 2;
	
	//����һ���б����ɶ��е�ʵ��
	private static ArrayList<SingletonDevelop> singletonDeveloplist = new ArrayList<SingletonDevelop>();
	
	//����ָ��������ʵ������
	static{
		for( int i=0; i<maxNum; i++ ){
			singletonDeveloplist.add(new SingletonDevelop());
		}
	}
	
	private SingletonDevelop(){
		System.out.println("����SingletonDevelopʵ��");
	}
	
	//�õ������SingletonDevelopʵ��
	public static SingletonDevelop getSingletonDevelop(){
		Random randrom = new Random();
		int singletonDevelopNum = randrom.nextInt(maxNum);
		return singletonDeveloplist.get(singletonDevelopNum);
	}
	
}
