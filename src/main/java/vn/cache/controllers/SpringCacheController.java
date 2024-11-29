package vn.cache.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.cache.services.SpringCacheService;

@RestController
@RequestMapping("/api/spring-cache")
public class SpringCacheController {

    @Autowired
    private SpringCacheService userService;

    @GetMapping("/{id}")
    public String getSpringCache(@PathVariable String id) {
        return userService.getSpringCacheById(id);
    }

    @PutMapping("/{id}")
    public String updateSpringCache(@PathVariable String id, @RequestParam String name) {
        return userService.updateSpringCache(id, name);
    }

    @DeleteMapping("/{id}")
    public String deleteSpringCache(@PathVariable String id) {
        userService.deleteSpringCache(id);
        return "User removed from cache.";
    }
}
