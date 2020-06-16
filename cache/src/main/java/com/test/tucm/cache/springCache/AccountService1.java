package com.test.tucm.cache.springCache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName AccountService1
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-15 16:38
 * @Version 1.0
 **/
@Service
public class AccountService1 {
    private final Logger logger = LoggerFactory.getLogger(AccountService1.class);


    private CacheContext<Account> accountCacheContext = new CacheContext<>();

    public Account getAccountByName(String accountName) {
        Account result = accountCacheContext.get(accountName);
        if (result != null) {
            logger.info("get from cache... {}", accountName);
            return result;
        }
        Account account = new Account();
        account.setId(1);
        account.setName("叶佳颐");
        accountCacheContext.addOrUpdateCache(accountName, account);
        return account;
    }

    public void reload() {
        accountCacheContext.evictCache();
    }

}
