package vn.cache.services.redistemplate;

public interface IRedisTemplateService {

    public void save(String valueCache);

    public Object get(String key);

    public void delete(String key);
}
