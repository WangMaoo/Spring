package com.wmq.spring.service.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.AccountService;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:20:00
 * @Description: TODO
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
