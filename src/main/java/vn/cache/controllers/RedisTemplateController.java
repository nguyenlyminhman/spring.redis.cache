package vn.cache.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.cache.models.CatModel;
import vn.cache.services.IRedisTemplateService;

import java.util.HashMap;

@RestController
@RequestMapping("/api/redis/cache/template")
public class RedisTemplateController {

    @Autowired
    private IRedisTemplateService redisTemplateService;

    @PostMapping("/save")
    public String save(@RequestBody CatModel catCache) {
        redisTemplateService.save(catCache);
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
