package com.wang.proxyPattern.develop.common;

import java.util.Date;

import com.wang.proxyPattern.example.IGamePlayer;

public class App {
	
	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("����");
		System.out.println("��ʼʱ���ǣ�" + new Date());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date());

//		//ͨ��Լ������ֹ��ô��
//		try {
//			GamePlayer player = new GamePlayer(proxy, "����");
//			System.out.println("��ʼʱ���ǣ�" + new Date());
//			player.login("zhangSan", "password");
//			player.killBoss();
//			player.upgrade();
//			System.out.println("����ʱ���ǣ�" + new Date());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
