package vn.cache.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
public class SpringCacheService {
    @Cacheable(value = "spring-cache", key = "#springCacheId")
    public String getSpringCacheById(String springCacheId) {
        // Giả lập thời gian xử lý lâu để thấy rõ caching hiệu quả
        simulateSlowService();
        return "SpringCache: " + springCacheId;
    }

    @CachePut(value = "spring-cache", key = "#springCacheId")
    public String updateSpringCache(String springCacheId, String updatedName) {
        return updatedName;
    }

    @CacheEvict(value = "spring-cache", key = "#springCacheId")
    public void deleteSpringCache(String springCacheId) {
        System.out.println("SpringCache with ID " + springCacheId + " has been removed from cache.");
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000); // Giả lập độ trễ
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
