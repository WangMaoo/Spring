package com.wmq.spring.dao;

import com.wmq.spring.pojo.Account;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:13:00
 * @Description: TODO
 */
public interface AccountDao {

    /**
     * 查询所有的账户
     * @return
     */
    List<Account> findAll();

    /**
     *  保存账户
     * @param account
     * @return
     */
    int saveAccount(Account account);

    /**
     * 根据id删除账户
     * @param id
     * @return
     */
    int deleteAccountById(int id);

    /**
     * 根据id更新账户
     * @param account
     * @return
     */
    int updateAccountById(Account account);

    /**
     * 根据id查找账户
     * @param id
     * @return
     */
    Account findAccountById(int id);


    /**
     * 查询所有账户个数
     * @return
     */
    Integer countAccount();
}
