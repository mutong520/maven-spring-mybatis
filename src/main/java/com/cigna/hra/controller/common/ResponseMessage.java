package com.cigna.hra.controller.common;


public class ResponseMessage extends BaseMessage{
	
	private static final long serialVersionUID = 5415855114347149195L;
	
	/**
	 * 返回的数据
	 */
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public ResponseMessage(){}
	
	public ResponseMessage(String statusCode, String msg, Object data ){
		this.setStatusCode(statusCode);
		this.setMsg(msg);
		this.setData(data);
	}

}
