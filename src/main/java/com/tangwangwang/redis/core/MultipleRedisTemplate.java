package com.tangwangwang.redis.core;

import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.data.redis.core.ZSetOperations;

public class MultipleRedisTemplate extends RedisAccessor implements MultipleRedisOperations {

    private int db;


    @Override
    public <K, V> ZSetOperations<K, V> opsForZSet(Class<K> keyType, Class<V> valueType) {
        return opsForZSet(db, keyType, valueType);
    }

    @Override
    public <K, V> ZSetOperations<K, V> opsForZSet(int db, Class<K> keyType, Class<V> valueType) {
        return null;
    }
}
