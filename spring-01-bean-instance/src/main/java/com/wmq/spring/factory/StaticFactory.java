package com.wmq.spring.factory;

import com.wmq.spring.pojo.Account;
import com.wmq.spring.pojo.User;

/**
 * @Description：静态工厂
 */
public class StaticFactory {

    public static Account createdAccount(){
        return new Account();
    }

    public static User createdUser(){
        return new User();
    }
}
