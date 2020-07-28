package com.wmq.spring.service;

import com.wmq.spring.pojo.Account;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:19:00
 * @Description: TODO
 */
public interface AccountService {

    /**
     * 查询所有账户
     * @return
     */
     List<Account> findAll();

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteAccountById(int id);

    /**
     * 更新用户
     * @param account
     * @return
     */
    int updateAccountById(Account account);

    /**
     * 查询所有的账户个数
     * @return
     */
    Integer countAccount();

    /**
     * 根据id查询账户
     * @param id
     * @return
     */
    Account findAccountById(int id);

    /**
     * 保存账户信息
     * @param account
     * @return
     */
    int saveAccount(Account account);


}
