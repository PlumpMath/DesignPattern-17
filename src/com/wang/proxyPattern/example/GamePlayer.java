package com.wang.proxyPattern.example;

/**
 * ��Ϸ��
 * @author HeJW
 *
 */
public class GamePlayer implements IGamePlayer {

	private String name="";
	
	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		System.out.println( "�û���Ϊ"+user + "���û���"+ this.name + "��½�ɹ�");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "�ڴ��");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "����һ��");
	}

}
