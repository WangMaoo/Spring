package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 17:59:00
 * @Description: TODO
 */
@Controller
@RequestMapping("find")
public class CustomerById {

    @RequestMapping(value = "findById", params = ("customerId"))
    public ModelAndView findCustomerById(Customer customer) {
        return new ModelAndView("succeed");
    }

}
