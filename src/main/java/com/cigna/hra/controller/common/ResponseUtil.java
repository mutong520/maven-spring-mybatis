package com.cigna.hra.controller.common;

public class ResponseUtil {
	
	public static final String SUCCESS_CODE = "200";
	
	public static final String SUCCESS_MSG = "操作成功";
	
	public static final String FAILURE_CODE = "500";
	
	public static final String FAILURE_MSG = "操作失败";
	
	public static final String PARAM_FAILURE_CODE = "0001";
	
	public static final String PARAM_FAILURE_MSG = "参数验证失败";
	public static final String PARAM_TO_LONG_MSG = "参数长度过长";
	
	public static final String USER_BLACK_CODE = "0002"; 
	
	public static final String USER_BLACK_MSG = "用户是黑名单用户";
	
	public static final String USER_TODAY_CODE = "300"; 
	
	public static final String USER_TODAY_MSG = "你没有刮奖资格了";
	
	public static final String USER_HAS_TODAY_MSG = "你有刮奖资格";
	
	public static final String USER_YEAR_CODE = "0004"; 
	
	public static final String USER_TEAR_MSG = "用户一年内已经中过奖品";
	
	public static final String ACTIVITY_CLOSE_CODE="0005";
	
	public static final String ACTIVITY_CLOSE_MSG="活动已经下架或者过期";
	
	public static final String ACTIVITY_NOOPEN_CODE="0006";
	
	public static final String ACTIVITY_NOOPEN_MSG="活动未开始";
	
	public static final String ACTIVITY_NO_REAWRD_MSG = "";
	
	public static final String USER_TOKEN_FAILURE_CODE = "0007";
	
	public static final String USER_TOKEN_FAILURE_MESSAGE = "用户token验证失败";
	
	public static final String TEAM_USERS_FULL_CODE = "0008";
	
	public static final String TEAM_USERS_FULL_MSG = "团队人数已经到达5人";
	
	public static final String TEAM_USERS_HAS_TEAM_CODE = "0009";
	
	public static final String TEAM_USERS_HAS_TEAM_MSG = "你已经加入过其他团了";
	/**
	 * 用户已经加入团队
	 */
	public static final String USER_HAS_ADDED_TEAM_CODE = "201";
	public static final String USER_HAS_ADDED_TEAM_MSG = "操作成功，用户已加入团队";
	/**
	 * 用户未加入团队
	 */
	public static final String USER_HAS_NO_ADDED_TEAM_CODE = "202";
	public static final String USER_HAS_NO_ADDED_TEAM_MSG = "操作成功，用户未加入团队";
}
