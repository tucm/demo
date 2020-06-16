package com.test.tucm.cache.springCache;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CacheContext
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-15 16:28
 * @Version 1.0
 **/
public class CacheContext<T> {

    private Map<String, T> cache = new HashMap<String, T>();

    public T get(String key) {
        return cache.get(key);
    }

    public void addOrUpdateCache(String key, T value) {
        cache.put(key, value);
    }

    // 依据 key 来删除缓存中的一条记录
    public void evictCache(String key) {
        if (cache.containsKey(key)) {
            cache.remove(key);
        }
    }

    // 清空缓存中的全部记录
    public void evictCache() {
        cache.clear();
    }
}
