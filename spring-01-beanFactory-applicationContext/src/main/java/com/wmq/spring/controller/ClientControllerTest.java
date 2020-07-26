package com.wmq.spring.controller;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 * @Description：调用端
 */
public class ClientControllerTest {

    /**
     * @param
     * @return
     * @Description ApplicationContext:spring容器接口
     * ClassPathXmlApplicationContext：加载XML文件的容器接口实现类
     * getBean：从容器中获得对应的bean
     */
    @Test
    public void testSave() {

        /**
         * 单例测试
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        AccountDao accountDao1 = (AccountDao) applicationContext.getBean("accountDao");
        System.out.println("accountDao1 = " + accountDao1.hashCode());
        System.out.println("accountDao = " + accountDao.hashCode());

        /**
         * 多例测试
         */
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountDao = (AccountService) applicationContext.getBean("accountService");
        System.out.println("accountDao = " + accountDao.hashCode());
        AccountService accountDao1 = (AccountService) applicationContext.getBean("accountService");
        System.out.println("accountDao1 = " + accountDao1.hashCode());*/


    }
}
