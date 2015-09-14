package com.wang.proxyPattern;

public class Proxy implements Subject {

	public Subject subject = null;
	
	//Ĭ�ϱ�������
	public Proxy(){
		this.subject = new Proxy();
	}
	
	//ͨ�����캯�����ݴ�����
	public Proxy( Object...objects ){
		
	}
	
	@Override
	public void request() {

		// AOP
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before(){
		//�ڴ���ҵ���߼�֮ǰ��һЩ����
	}
	
	private void after(){
		//�ڴ���ҵ���߼�֮����һЩ����
	}

}
