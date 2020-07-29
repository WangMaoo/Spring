package com.wmq.spring.dao;

import com.wmq.spring.pojo.Account;

import java.util.List;

/**
 * @Description：账户dao接口
 */
public interface AccountDao {

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

    /**
     * @Description 交易
     * @param id 交易账号Id
     * @param money 交易金额
     * @return
     */
    Integer dealMoney(Integer id, Float money);
}

