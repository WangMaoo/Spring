package com.wmq.spring.controller;

import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.AccountService;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:41:00
 * @Description: TODO
 */
public class ClientController {

    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> findAll() {
        return accountService.findAll();
    }

    public int updateAccountById(Account account) {
        return accountService.updateAccountById(account);
    }

}
