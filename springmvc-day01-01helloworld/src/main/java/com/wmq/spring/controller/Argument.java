package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月31日 23:16:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "customer")
public class Argument {

    @RequestMapping(value = "findCustomerById")
    public ModelAndView findCustomerById(String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("content",id);
        modelAndView.setViewName("/succeed");
        return modelAndView;
    }

    @RequestMapping(value = "findId/{id}")
    public ModelAndView findId(@PathVariable("id") String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("content",id);
        modelAndView.setViewName("/succeed");
        return modelAndView;
    }

}
