package com.wang.decoratorPattern;

/**
 * ����װ����
 * 
 * @author HeJW
 * 
 */
public abstract class Decorator extends Component {

	private Component component = null;

	/**
	 * ͨ�����캯�����ݱ�������
	 * 
	 * @param component
	 *            �����εĹ���
	 */
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {

		this.component.operate();
	}

}
