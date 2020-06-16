package com.test.tucm.cache.springCache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;

/**
 * @ClassName AccountService2
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-15 16:57
 * @Version 1.0
 **/
//@Service
public class AccountService2 {
    private final Logger logger = LoggerFactory.getLogger(AccountService2.class);

    // 使用了一个缓存名叫 accountCache
    @Cacheable(value = "accountCache")
    public Account getAccountByName(String accountName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        logger.info("real querying account... {}", accountName);
        Account account = new Account();
        account.setId(1);
        account.setName("叶佳颐");
        return account;
    }

}
