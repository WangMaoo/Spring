package com.wmq.spring.service;

import com.wmq.spring.pojo.Account;

import java.util.List;

/**
 * @Description：张辉service接口
 */
public interface AccountService {

    /**
     * 保存账户
     * @param account
     */
    int saveAccount(Account account);

    /**
     * 根据id删除账户
     * @param id
     */
    int deleteAccountById(int id);

    /**
     * 根据id更新账户信息
     * @param account
     */
    int updateAccountById(Account account);

    /**
     * 根据id查询账户信息
     * @param id
     */
    Account findAccountById(int id);

    /**
     * 查询所有账户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 查询所有账户个数
     * @return
     */
    Integer countAccount();
}

