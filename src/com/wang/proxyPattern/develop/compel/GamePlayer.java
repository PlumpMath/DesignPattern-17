package com.wang.proxyPattern.develop.compel;

/**
 * ǿ�ƴ�������ǽ�ɫ
 * @author HeJW
 *
 */
public class GamePlayer implements IGamePlayer {

	private String name = null;
	
	//������
	private IGamePlayer proxy = null;
	
	public GamePlayer(String name) {
		this.name = name;
	}
	
	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return proxy;
	}
	
	@Override
	public void login(String user, String password) {
		
		if (this.isProxy()) {
			System.out.println( "�û���Ϊ"+user + "���û���"+ this.name + "��½�ɹ�");
		} else {
			System.out.println("��ʹ��ָ���Ĵ�����");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "�ڴ��");
		} else {
			System.out.println("��ʹ��ָ���Ĵ�����");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "����һ��");
		} else {
			System.out.println("��ʹ��ָ���Ĵ�����");
		}
	}
	
	private boolean isProxy(){
		
		if( this.proxy == null ){
			return false;
		} else {
			return true;
		} 
	}

	

}
