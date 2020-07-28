package com.wmq.spring;

import com.wmq.spring.config.DbConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月27日 07:49:00
 * @Description: TODO
 */
public class DbConfigTest {

    private DbConfig dbConfig;

    @Before
    public void before() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        dbConfig = (DbConfig) ac.getBean("dbConfig");
    }

    @Test
    public void test() {
        System.out.println("配置内容为"+dbConfig.toString());
    }
}
