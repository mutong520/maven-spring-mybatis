package com.cigna.hra.redis;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ShardedJedis;

@Component
public class RedisDataSourceImpl implements RedisDataSource {

    private static final Logger log = Logger.getLogger(RedisDataSourceImpl.class);

    @Autowired
    private JedisPool    jedisPool;

    public Jedis getRedisClient() {
        try {
            Jedis shardJedis = jedisPool.getResource();
            return shardJedis;
        } catch (Exception e) {
            log.error("getRedisClent error", e);
        }
        return null;
    }

    public void returnResource(Jedis jedis) {
    	jedisPool.returnResource(jedis);
    }

    public void returnResource(Jedis jedis, boolean broken) {
        if (broken) {
        	jedisPool.returnBrokenResource(jedis);
        } else {
        	jedisPool.returnResource(jedis);
        }
    }
}