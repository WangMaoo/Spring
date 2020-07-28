package com.wmq.spring.controller;

import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:41:00
 * @Description: TODO
 */
@Controller("clientController")
public class ClientController {

    @Autowired
    private AccountService accountService;

    public List<Account> findAll() {
        return accountService.findAll();
    }

    public int updateAccountById(Account account) {
        return accountService.updateAccountById(account);
    }

}
