package com.cigna.hra.service.activity;

import java.sql.SQLException;

import com.cigna.hra.model.ActivityModel;

public interface ActivityService {
	
	/**
	 * 根据id获得活动的信息
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ActivityModel getActivityById(long id) throws SQLException;
	

}
