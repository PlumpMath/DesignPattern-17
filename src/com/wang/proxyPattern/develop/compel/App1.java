package com.wang.proxyPattern.develop.compel;

import java.util.Date;

public class App1 {
	
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("����");
		System.out.println("��ʼʱ���ǣ�" + new Date());
		player.login("zhangSan", "password");
		player.killBoss();
		player.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date());
	}
}	
