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
        //① AccountDao accountDao = (AccountDao) ac.getBean("accountDao");

        //② AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);

        //③ 根据bean的类型获得对象（必须是拥有唯一实现类）
        AccountDao accountDao = ac.getBean(AccountDao.class);

        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.setAccountDao(accountDao);
        accountService.saveAccount();

        // 判断是否有这个
        System.out.println(ac.containsBean("accountDao"));

        // 判断这个bean是不是单例的isSingleton|多例的isPrototype
        System.out.println(ac.isSingleton("accountDao"));
        System.out.println(ac.isPrototype("accountDao"));

        //得到实例的class类型
        Class<?> accountDao1 = ac.getType("accountDao");
        System.out.println("accountDao1 = " + accountDao1);

        //得到别名
        String[] accountDaos = ac.getAliases("accountDao");
        System.out.println("accountDaos = " + Arrays.toString(accountDaos));
    }
}
