package com.test.tucm.cache.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName guavaTest
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-15 18:15
 * @Version 1.0
 **/
public class guavaTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void setUp() throws Exception {
        logger.info("before");
    }

    @Test
    public void test() throws Exception {
        //        AccountService1 accountService1;
        //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("guava-application.xml");
        //        accountService1 = context.getBean("accountService1", AccountService1.class);
        //        Account account1 = accountService1.getAccountByName("accountName");
        //        Account account2 = accountService1.getAccountByName("accountName");
        //        logger.info("account1=[{}]", account1.getName());
        //        logger.info("account2=[{}]", account2.getName());
        this.createGuavaCache();

    }

    private void createGuavaCache() {
        Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(100) // 设置缓存的最大容量
                .expireAfterWrite(1, TimeUnit.MINUTES) // 设置缓存在写入一分钟后失效
                .concurrencyLevel(10) // 设置并发级别为10
                .recordStats() // 开启缓存统计
                .build();
        // 放入缓存
        cache.put("key", "value");
        // 获取缓存
        String value = cache.getIfPresent("key");
        //        cache.stats().hitRate();
        //        cache.stats().averageLoadPenalty();
        //        cache.stats().evictionCount();
        logger.info(value);
        logger.info("rate[{}],averageLoadPenalty[{}],evictionCount[{}]", cache.stats().hitRate(), cache.stats().averageLoadPenalty(), cache.stats().evictionCount());

    }

    @After
    public void tearDown() throws Exception {
        logger.info("down");
    }
}