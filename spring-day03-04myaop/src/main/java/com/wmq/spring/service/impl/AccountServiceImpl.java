package com.wmq.spring.service.impl;

import com.wmq.spring.dao.impl.AccountDaoImpl;
import com.wmq.spring.service.AccountService;

/**
 * @Description：用户业务层接口实现
 */
public class AccountServiceImpl implements AccountService {

    private AccountDaoImpl accountDao;

    @Override
    public void saveAccount() {

        accountDao.saveAccount();
    }

    @Override
    public void delAccount() {
        accountDao.delAccount();
    }

    @Override
    public void updateAccout() {
        accountDao.updateAccout();
    }

    @Override
    public void findAccount() {
        accountDao.findAccount();
    }

    @Override
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }
}


