package com.wmq.spring.controller;


import com.wmq.spring.lifecycle.LifeService;
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
         * 单例测试
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("容器初始化完成");
        LifeService lifeService = (LifeService) ac.getBean("lifeService");
        lifeService.doJob();
        System.out.println("容器关闭");
        ((ClassPathXmlApplicationContext) ac).close();


        /**
         * 多例测试
         */
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("初始化完成");
        LifeService lifeService = (LifeService) ac.getBean("lifeService");
        lifeService.doJob();
        System.out.println("容器关闭");
        ((ClassPathXmlApplicationContext) ac).close();
*/

    }
}
