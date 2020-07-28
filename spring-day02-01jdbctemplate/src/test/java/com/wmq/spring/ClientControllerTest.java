package com.wmq.spring;

import com.wmq.spring.controller.ClientController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:44:00
 * @Description: TODO
 */
public class ClientControllerTest {

    private ClientController clientController;

    @Before
    public void before() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        clientController = (ClientController) ac.getBean("clientController");
    }

    @Test
    public void findAllTest() {
        System.out.println(clientController.findAll());
    }
}
