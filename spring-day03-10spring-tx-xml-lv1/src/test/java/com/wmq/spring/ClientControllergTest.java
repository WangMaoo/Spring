package com.wmq.spring;

import com.wmq.spring.controller.ClientController;
import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.DealService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description：测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
//记住需要添加classpath
@ContextConfiguration("classpath:bean.xml")
public class ClientControllergTest {

    @Autowired
    private  ClientController clientController;

    @Autowired
    DealService dealService;

//    @Before
//    public void before(){
//        //创建容器
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("bean.xml");
//        //获得对象
//        clientController = applicationContext.getBean("clientController", ClientController.class);
//    }

    /**
     * 创建用户
     */
    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setAccountName("张三");
        account.setMoney(2000F);
        int flag = clientController.saveAccount(account);
        System.out.println("创建用户受影响行数："+flag);

    }

    /**
     * 删除用户
     */
    @Test
    public void deleteAccountById() {
        int id = 16;
        int flag =clientController.deleteAccountById(id);
        System.out.println("删除用户受影响行数："+flag);
    }

    /**
     * 修改用户
     */
    @Test
    public void updateAccountById() {
        Account account = new Account();
        account.setId(5);
        account.setAccountName("张三");
        account.setMoney(2000F);
        int flag =clientController.updateAccountById(account);
        System.out.println("修改用户受影响行数："+flag);
    }


    /**
     * 按ID查询用户
     */
    @Test
    public void findAccountById() {
        int id = 5;
        Account account =clientController.findAccountById(id);
        System.out.println("按ID查询用户:"+account.toString());
    }

    /**
     * 统计用户个数
     */
    @Test
    public void countAccount() {
        int flag =  clientController.countAccount();
        System.out.println("统计用户个数:"+flag);
    }

    @Test
    public void testFindAll(){

        List<Account> list = clientController.findAll();
        for (Account account : list) {
            System.out.println(account.toString());
        }
    }


    /**
     * 交易
     */
    @Test
    public void doDeal(){
        System.out.println("交易之前：");
        dealService.printAccountInfo(1, 2);
        dealService.doDeal(100F, 1, 2);
        System.out.println("交易之后：");
        dealService.printAccountInfo(1, 2);
    }
    
}
