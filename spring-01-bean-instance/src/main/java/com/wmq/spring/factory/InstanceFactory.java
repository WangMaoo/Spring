package com.wmq.spring.factory;

import com.wmq.spring.pojo.Account;

/**
 * @Description：实例化工厂
 */
public class InstanceFactory {


    public Account createdAccount(){
        return new Account();
    }
}
