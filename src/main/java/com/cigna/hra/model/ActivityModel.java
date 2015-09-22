package com.cigna.hra.model;

/**
 * @ClassName: ActivityModel
 * @Description: 活动模型类
 * @author Stephen.tian
 * @date 2015年8月25日 上午9:40:02
 * 
 */
public class ActivityModel {
	
	/**
	 * 主键
	 */
	private long id;
	/**
	 * 标题
	 */
	private String title;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
