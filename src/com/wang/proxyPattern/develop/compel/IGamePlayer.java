package com.wang.proxyPattern.develop.compel;

/**
 * ǿ�ƴ���Ľӿ���
 * @author HeJW
 *
 */
public interface IGamePlayer {

	public void login(String user, String password);
	public void killBoss();
	public void upgrade();	

	//ÿ���˶������ҵ��Լ��Ĵ�����
	public IGamePlayer getProxy();
}
