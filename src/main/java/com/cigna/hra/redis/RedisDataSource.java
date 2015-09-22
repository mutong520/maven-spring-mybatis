package com.cigna.hra.redis;

import redis.clients.jedis.Jedis;

public interface RedisDataSource {
	
    public abstract Jedis getRedisClient();
    public void returnResource(Jedis jedis);
    public void returnResource(Jedis jedis,boolean broken);
	

}
