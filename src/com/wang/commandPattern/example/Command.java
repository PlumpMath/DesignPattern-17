package com.wang.commandPattern.example;

/**
 * ����������
 * 
 * @author HeJW
 * 
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	
	/**
	 * Ҫ��ʲô��
	 */
	public abstract void execute();

}
