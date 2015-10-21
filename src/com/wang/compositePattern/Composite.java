package com.wang.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ��֦����
 * 
 * @author wang
 * 
 */
public class Composite extends Component {

	/**
	 * ��������
	 */
	private List<Component> componentList = new ArrayList<Component>();

	/**
	 * ���һ��Ҷ�ӹ���������֦����
	 * 
	 * @param component
	 */
	public void add(Component component) {
		this.componentList.add(component);
	}

	/**
	 * ɾ��һ��Ҷ�ӹ���������֦����
	 * 
	 * @param component
	 */
	public void remove(Component component) {
		this.componentList.remove(component);
	}
	
	/**
	 * ��÷�֧�µ�����Ҷ�ӹ���������֦����
	 * @return
	 */
	public List<Component> getChildren(){
		return this.componentList;
	}

}
