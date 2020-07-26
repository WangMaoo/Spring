package com.wmq.spring.controller;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.service.AccountService;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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

        System.out.println("ApplicationContext容器创建了");
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("ApplicationContext容器创建完成");
        AccountDao accountDao = (AccountDao) ac.getBean("accountDao");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.setAccountDao(accountDao);
        accountService.saveAccount();

        System.out.println("=========================");
        System.out.println("BeanFactory容器开始创建了");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        System.out.println("BeanFactory容器创建完成");
        AccountDao accountDao1 = (AccountDao) xmlBeanFactory.getBean("accountDao");
        System.out.println("accountDao1 = " + ToStringBuilder.reflectionToString(accountDao1.hashCode()));


    }
}
