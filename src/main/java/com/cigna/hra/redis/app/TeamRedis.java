package com.cigna.hra.redis.app;

/**
 * 操作团队中redis信息
 * @author s4tian
 *
 */
public interface TeamRedis {
	
	/**
	 * 获得所有团队总个数
	 * @return
	 */
	public int getTeamTotalCount();

}
