package com.wang.ResponsibilityChainPattern;

/**
 * ��������
 * 
 * @author HeJW
 * 
 */
public abstract class Handler {

	private Handler nextHandler;

	/**
	 * ÿ�������߶������������������
	 * 
	 * @param request
	 *            ����
	 * @return ������
	 */
	public final Response handleMessage(Request request) {

		Response response = null;
		if (this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {
			if (this.nextHandler != null) {
				response = this.nextHandler.handleMessage(request);
			} else {
				// û�д�����,ҵ�����д���...
			}
		}
		return response;
	}

	/**
	 * ������һ����������˭
	 * 
	 * @param nextHandler
	 *            ��һ��������
	 */
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * ÿ�������ߵĴ�����
	 * 
	 * @return ������
	 */
	protected abstract Level getHandlerLevel();

	/**
	 * ÿ�����������ܹ����������
	 * 
	 * @param request
	 * @return
	 */
	protected abstract Response echo(Request request);

}
