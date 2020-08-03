package com.wmq.springmvc.controller;

import com.wmq.springmvc.pojo.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 20:44:00
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "json-type")
public class JsonTypeController {

    @RequestMapping
    public Customer method() {
        Customer customer = new Customer();
        customer.setCustId(1001);
        customer.setCustName("小王");
        customer.setCustLevel("普通客户");
        customer.setCustPhone("15156400000");
        customer.setCustAddress("上海");
        customer.setCreaterTime(new Date());
        customer.setCustIndustry("IT");
        customer.setCustSource("黑马");
        return customer;
    }
}
