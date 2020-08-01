package com.wmq.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月29日 21:58:00
 * @Description: TODO
 */
public class UserController {

    @Autowired
    UserService userService;
}
