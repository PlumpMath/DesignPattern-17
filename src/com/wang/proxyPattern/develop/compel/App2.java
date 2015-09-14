package com.wang.proxyPattern.develop.compel;

import java.util.Date;

public class App2 {
	
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("����");
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.out.println("��ʼʱ���ǣ�" + new Date());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date());
	}
}	
