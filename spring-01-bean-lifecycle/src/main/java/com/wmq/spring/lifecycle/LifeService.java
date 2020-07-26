package com.wmq.spring.lifecycle;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月25日 22:36:00
 * @Description: TODO
 */
public class LifeService {

    public LifeService() {
        System.out.println("LifecycleService构造");
    }

    public void init() {
        System.out.println("LifecycleService初始化");
    }

    public void doJob() {
        System.out.println("LifecycleService工作中");
    }

    public void destroy() {
        System.out.println("LifecycleService销毁");
    }
}
