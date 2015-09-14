package com.wang.proxyPattern.develop.common;

import com.wang.proxyPattern.example.IGamePlayer;

/**
 * ��ͨ�������Ϸ�� 
 * @author HeJW
 *
 */
public class GamePlayer implements IGamePlayer {

	private String name="";
	
	public GamePlayer( IGamePlayer _gamePlayer, String name ) throws Exception{
		
		if( _gamePlayer == null ){
			throw new Exception("���ܴ������ǽ�ɫ");
		} else {
			this.name = name;
		}
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
