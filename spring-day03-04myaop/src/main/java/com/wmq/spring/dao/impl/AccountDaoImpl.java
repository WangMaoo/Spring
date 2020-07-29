package com.wmq.spring.dao.impl;

import com.wmq.spring.pojo.Account;

/**
 * @Description：
 */
public class AccountDaoImpl {

    private static  Account account;

    static {
        account = new Account();
        account.setId("010101");
        account.setAccountName("张三");
        account.setMoney(2000F);
    }

    public void saveAccount() {
        System.out.println("保存:"+account.toString());
    }


    public void delAccount() {
        System.out.println("删除:"+account.toString());
    }


    public void updateAccout() {
        System.out.println("修改:"+account.toString());
    }


    public void findAccount() {
        System.out.println("查询:"+account.toString());
    }
}


