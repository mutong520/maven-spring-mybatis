package com.cigna.hra.redis.app.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

import com.cigna.hra.common.util.PropertiesUtil;
import com.cigna.hra.redis.RedisConstant;
import com.cigna.hra.redis.RedisDataSource;
import com.cigna.hra.redis.app.TeamRedis;

@Component
public class TeamRedisImpl implements TeamRedis{

	@Autowired
	private RedisDataSource redisDataSource;

	private static final Logger logger = Logger.getLogger(TeamRedisImpl.class);

	@Override
	public int getTeamTotalCount(){

		String allTeamIdKey = RedisConstant.TEAM_ALL_Id;//把id放入sortSet
		Jedis jedis = redisDataSource.getRedisClient();
		if (jedis == null) {
			return 0;
		}
		
		String redisDB = PropertiesUtil.getProperty("redis.db");
		jedis.select(redisDB == null ? 9 : Integer.parseInt(redisDB));

		boolean broken = false;
		try {
			Long totalCount = jedis.zcard(allTeamIdKey);
			return totalCount ==  null ? 0 : totalCount.intValue();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			broken = true;
		} finally {
			redisDataSource.returnResource(jedis, broken);
		}
		return 0;
	}

}
