﻿package com.wang.ResponsibilityChainPattern;

/**
 * 具体处理者2
 * 
 * @author HeJW
 * 
 */
public class ConcreteHandler2 extends Handler {

	@Override
	protected Level getHandlerLevel() {
		// 设置自己的处理级别
		return null;
	}

	@Override
	protected Response echo(Request request) {
		// 完成处理逻辑
		return null;
	}

}
