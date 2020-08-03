package com.wmq.spring.controller;

import com.wmq.spring.pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 20:56:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "customer")
public class CustomerController {

    @RequestMapping(value = "to-login")
    public String toLogin() {
        return "to-login";
    }

    @RequestMapping(value = "login")
    public String login(Customer customer, HttpSession httpSession) {
        if (!"".equals(customer.getLoginName()) && !"".equals(customer.getPassword())) {
            httpSession.setAttribute("customer",customer.getLoginName());
        }
        return "redirect:/up-load/to-add";
    }
}
