package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月31日 21:55:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "url")
public class DoUrlController {

    @RequestMapping(value = "{a}")
    public ModelAndView hello() {
        return new ModelAndView("hello")
                .addObject("hello", "***Teacher");
    }

    @RequestMapping(value = "{a}/{b}")
    public ModelAndView hello1() {
        return new ModelAndView("hello")
                .addObject("hello", "***Teacher");
    }
}
