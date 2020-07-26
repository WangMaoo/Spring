package com.wmq.spring.service;

import com.wmq.spring.dao.AccountDao;

/**
 * @Description：用户业务层接口
 */
public interface AccountService {

    /**
     * @Description 新增
     */
    void saveAccount();

    /**
     * @Description 删除
     */
    void delAccount();

    /**
     * @Description 修改
     */
    void updateAccout();

    /**
     * @Description 查询
     */
    void findAccount();

    void setAccountDao(AccountDao accountDao);
}


