package com.wmq.spring.controller;


import com.wmq.spring.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        /**
         * 缺省的方式创建工厂
         */
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Account account = (Account) ac.getBean("account");
        System.out.println("缺省方法创建工厂 = " + account);*/

        /**
         * 静态工厂创建对象
         */
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Account account = (Account) ac.getBean("account");
        System.out.println("静态工厂创建对象" + account);*/

        /**
         * 实例化工厂创建对象
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Account account = (Account) ac.getBean("account");
        System.out.println("实例化工厂创建对象" + account);
    }
}
