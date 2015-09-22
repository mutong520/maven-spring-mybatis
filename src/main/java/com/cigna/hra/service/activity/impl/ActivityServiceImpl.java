package com.cigna.hra.service.activity.impl;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cigna.hra.dao.activity.ActivityMapper;
import com.cigna.hra.model.ActivityModel;
import com.cigna.hra.service.activity.ActivityService;

/**
 * @ClassName: ActivityServiceImpl
 * @Description: 活动Service
 * @author Stephen.tian
 * @date 2015年8月25日 下午11:40
 * 
 */
@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	private ActivityMapper activityMapper;
	
	private Logger logger = Logger.getLogger(ActivityServiceImpl.class);
	
	@Override
	public ActivityModel getActivityById(long id) throws SQLException {
		logger.info("ActivityService method getActivityById param :"+id);
		return activityMapper.getActivityById(id);
	}
	
}
