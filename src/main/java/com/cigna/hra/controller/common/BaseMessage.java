package com.cigna.hra.controller.common;

import java.io.Serializable;

public class BaseMessage implements Serializable{
	
	private static final long serialVersionUID = -2721931396460371959L;
	
	/**
	 * 返回代码
	 */
	private String statusCode;
	/**
	 * 返回信息
	 */
	private String msg;
	
	public BaseMessage() {
		super();
	}

	public BaseMessage(String statusCode, String msg) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
