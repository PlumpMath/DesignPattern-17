package com.wang.proxyPattern.develop.compel;

import java.util.Date;

public class App3 {
	
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("����");
		IGamePlayer proxy = player.getProxy();
		System.out.println("��ʼʱ���ǣ�" + new Date());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date());
	}
}	
