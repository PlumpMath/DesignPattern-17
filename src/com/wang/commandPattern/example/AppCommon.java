package com.wang.commandPattern.example;

/**
 * ������ģʽ�Ŀͻ���
 * 
 * @author HeJW
 * 
 */
public class AppCommon {

//	public static void main(String[] args) {
//		System.out.println("------------����һ������");
//		Group rg = new RequirementGroup();
//		rg.find();// �����ҵ������
//		rg.add();// ����һ������
//		rg.plan();// �������ƻ�
//	}
	
	public static void main(String[] args) {
		System.out.println("------------ɾ��һ��һ������");
		Group rg = new RequirementGroup();
		rg.find();// �����ҵ������
		rg.delete();// ɾ��һ������
		rg.plan();// �������ƻ�
	}
	//...........
	//�ȵȡ��������кܶ���������ÿ�α仯������
}
