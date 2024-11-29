package vn.cache.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.cache.services.redistemplate.IRedisTemplateService;

@RestController
@RequestMapping("/api/redis/cache/template")
public class RedisTemplateController {

    @Autowired
    private IRedisTemplateService redisTemplateService;

    @PostMapping("/save")
    public String save(@RequestBody String valueCache) {
        redisTemplateService.save(valueCache);
        return "Data saved successfully!";
    }

    @GetMapping("/get")
    public Object get(@RequestParam String key) {
        return redisTemplateService.get(key);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam String key) {
        redisTemplateService.delete(key);
        return "Data deleted successfully!";
    }
}
