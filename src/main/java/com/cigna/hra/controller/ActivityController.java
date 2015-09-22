package com.cigna.hra.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cigna.hra.controller.common.BaseMessage;
import com.cigna.hra.controller.common.ResponseMessage;
import com.cigna.hra.controller.common.ResponseUtil;
import com.cigna.hra.model.ActivityModel;
import com.cigna.hra.service.activity.ActivityService;

/**
 * @ClassName: ActivityServiceImpl
 * @Description: 活动controller
 * @author Stephen.tian
 * @date 2015年8月25日 下午11:40
 * 
 */
@Controller
public class ActivityController {
	
	private Logger logger = Logger.getLogger(ActivityController.class);
	
	@Autowired
	private ActivityService activityService;
	
	/**
	 * 根据活动id获取活动时间
	 * @param atcivityId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/activity/getActivityById" ,method=RequestMethod.POST)
	public BaseMessage getActivityById(String activityId){
		
		logger.info("ActivityController method getActivityById start ---------------");
		
		ResponseMessage responseMsg = new ResponseMessage();
		responseMsg.setStatusCode(ResponseUtil.SUCCESS_CODE);
		responseMsg.setMsg(ResponseUtil.SUCCESS_MSG);
		
		try {
			ActivityModel model = activityService.getActivityById(Long.parseLong(activityId));
			responseMsg.setData(model);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return responseMsg;
	}
	
}
