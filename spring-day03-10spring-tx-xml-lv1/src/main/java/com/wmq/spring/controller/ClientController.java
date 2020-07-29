package com.wmq.spring.controller;

import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description：客户端
 */
//声明类交于spring 管理，并且指定对于的唯一标识
@Component("clientController")
public class ClientController {

    //注入service
    @Autowired
    private AccountService accountService;

    /**
     * 创建用户
     */
    public int saveAccount(Account account) {
        return accountService.saveAccount(account);
    }

    /**
     * 删除用户
     */
    public int deleteAccountById(int id) {
        return accountService.deleteAccountById(id);
    }

    /**
     * 修改用户
     */
    public int updateAccountById(Account account) {
        return accountService.updateAccountById(account);
    }


    /**
     * 按ID查询用户
     */
    public Account findAccountById(int id) {
        return accountService.findAccountById(id);
    }

    /**
     * 统计用户个数
     */
    public Integer countAccount() {
        return accountService.countAccount();
    }

    /**
     * 查询所有用户
     */
    public List<Account> findAll() {
        return accountService.findAll();
    }


}
