package com.wmq.spring.dao.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.pojo.Account;

/**
 * @Description：
 */
public class AccountDaoImpl implements AccountDao {

    private static  Account account;

    static {
        account = new Account();
        account.setId("010101");
        account.setAccountName("张三");
        account.setMoney(2000F);
    }

    public AccountDaoImpl() {
        System.out.println("实例创建");
    }

    @Override
    public void saveAccount() {
        System.out.println("保存:"+account.toString());
    }

    @Override
    public void delAccount() {
        System.out.println("删除:"+account.toString());
    }

    @Override
    public void updateAccout() {
        System.out.println("修改:"+account.toString());
    }

    @Override
    public void findAccount() {
        System.out.println("查询:"+account.toString());
    }
}


