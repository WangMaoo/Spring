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
    public List<Account> findAll();
}
