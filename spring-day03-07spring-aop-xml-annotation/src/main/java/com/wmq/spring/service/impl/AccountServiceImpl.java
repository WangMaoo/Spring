package com.wmq.spring.service.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description：账号业务服务
 */
//声明类交于spring 管理，并且指定对于的唯一标识，如果不写标识，则使用当前类的类名首字母小写
@Component("accountService")
public class AccountServiceImpl implements AccountService {

    //注入dao
    @Autowired
    private AccountDao accountDao;

    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public int deleteAccountById(int id) {
        return accountDao.deleteAccountById(id);
    }

    @Override
    public int updateAccountById(Account account) {
        return accountDao.updateAccountById(account);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account.toString());
        }
//        int i = 1 / 0;
        return list;
    }

    @Override
    public Integer countAccount() {
        return accountDao.countAccount();
    }

}
