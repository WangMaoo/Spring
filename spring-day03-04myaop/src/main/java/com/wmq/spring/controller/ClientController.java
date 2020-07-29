package com.wmq.spring.controller;

import com.wmq.spring.dao.impl.AccountDaoImpl;
import com.wmq.spring.factory.BeanFactory;
import com.wmq.spring.service.AccountService;
import org.junit.Test;

/**
 * @Description：调用端
 */
public class ClientController {

    @Test
    public void testSave(){
        //使用容器获得对象
        AccountDaoImpl accountDao = (AccountDaoImpl) BeanFactory.getBean("accountDao");
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        //注入（赋值）
        accountService.setAccountDao(accountDao);
        accountService.saveAccount();
    }
}
