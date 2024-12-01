package vn.cache.services;

import vn.cache.models.CatModel;

public interface IRedisTemplateService {

    public void save(CatModel valueCache);

    public Object get(String key);

    public void delete(String key);
}
