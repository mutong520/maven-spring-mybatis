package com.cigna.hra.dao.activity;

import com.cigna.hra.model.ActivityModel;

/**
 * @ClassName: ActivityMapper
 * @Description: 活动Mapper
 * @author Stephen.tian
 * @date 2015年8月25日 上午9:40:02
 * 
 */
public interface ActivityMapper {
	/**
	 * 根据活动Id,查询活动
	 * @param id
	 * @return
	 */
	public ActivityModel getActivityById(long id);
	
}
