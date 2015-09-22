package com.cigna.hra.controller.common;

public class ResponseMessagePage extends BaseMessage{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3747404995654830094L;
	/**
	 * 返回的数据
	 */
	private Object data;
	
	private int totalPage;
	
	private int currentPage;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

}
