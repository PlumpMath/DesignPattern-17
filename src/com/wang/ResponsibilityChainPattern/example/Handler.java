package com.wang.ResponsibilityChainPattern.example;

public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	// �ܴ���ļ���
	private int level = 0;

	// ���δ��ݣ���һ����������˭
	private Handler nextHandler;

	// ÿ���඼Ҫ˵���Լ��ܹ�����ļ���
	public Handler(int level) {
		this.level = level;
	}

	// ����һ��Ů�ԣ�Ů�������ӣ�ĸ�ף������ֵ�����
	public final void HandleMessage(IWomen women) {

		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.HandleMessage(women);
			} else {
				// û���ܹ�������������ˣ����д���
				System.out.println("û�ط���ʾ�ˣ���ͬ�⴦��");
			}
		}
	}

	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	protected abstract void response(IWomen women);
}
