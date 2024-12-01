package vn.cache.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import vn.cache.models.CatModel;

@Service
public class RedisTemplateService implements IRedisTemplateService{

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void save(CatModel catData) {
        String key = "cat::" + catData.getId();
        redisTemplate.opsForValue().set(key, catData);
    }

    @Override
    public CatModel get(String key) {
        return (CatModel) redisTemplate.opsForValue().get(key);
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }
}
