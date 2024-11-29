package vn.cache.services.redistemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisTemplateService implements IRedisTemplateService{

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void save(String valueCache) {
        String key = "your::key::here";
        redisTemplate.opsForValue().set(key, valueCache);
    }

    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }
}
