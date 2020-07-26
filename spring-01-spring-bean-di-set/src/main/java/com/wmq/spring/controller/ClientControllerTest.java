package com.wmq.spring.controller;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author Lenovo
 * @Description：调用端
 */
public class ClientControllerTest {

    /**
     * @Description
     *      ApplicationContext:spring容器接口
     *      ClassPathXmlApplicationContext：加载XML文件的容器接口实现类
     *      getBean：从容器中获得对应的bean
     * @param
     * @return
     */
    @Test
    public void testSave(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.saveAccount();

    }
}
