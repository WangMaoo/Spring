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
    public List<Account> findAll();
}
