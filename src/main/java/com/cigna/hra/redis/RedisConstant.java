package com.cigna.hra.redis;

public class RedisConstant {
	//redis团队key前缀(历史信息)
	public static final String TEAM_HIS = "team_his_";
	
	//redis Map结构用户步数Key前缀
	public static final String USER_STEP_HIS = "userstep_his_";
	
	//redis Map结构用户更新时间key前缀
	public static final String USER_STEP_UPDATE_HIS = "userupdatetime_his_";
	
	//redis Map结构用户姓名key前缀
	public static final String USER_NAME_HIS = "username_his_";
	
	//存放所有team set集合的key
	public static final String TEAM_ALL_Id = "teamallid";
	
	//存储团队详情的key
	public static final String TEAM_DETAIL = "teamdetail_";
	
	//活动结束后冠亚季军名字key
	public static final String TEAM_END_RANK = "teamEndRank";
	
	public static final String TEAM_USER_ICON = "teamUserIcon_";
}
