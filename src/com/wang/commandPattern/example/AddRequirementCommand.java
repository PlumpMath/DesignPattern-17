package com.wang.commandPattern.example;

/**
 * ������������
 * 
 * @author HeJW
 * 
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		super.rg.find();
		super.rg.add();
		super.rg.plan();
	}

}
