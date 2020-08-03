package com.wmq.ssm.web;

import com.wmq.ssm.pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 23:06:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "customer")
public class LoginController {

    @RequestMapping(value = "to-login")
    public String toLogin() {
        return "to-login";
    }

    @RequestMapping(value = "login")
    public String login(Customer customer, HttpSession httpSession) {
        if (!"".equals(customer.getLoginName()) && !"".equals(customer.getPassword())) {
            httpSession.setAttribute("customer",customer.getLoginName());
        }
        return "redirect:/customer/list";
    }
}
