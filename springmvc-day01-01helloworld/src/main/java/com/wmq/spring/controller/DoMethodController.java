package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月31日 21:51:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "method")
public class DoMethodController {

//    @RequestMapping(value = "hello",method = RequestMethod.GET)
    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public ModelAndView hello() {
        return new ModelAndView("hello")
                .addObject("hello", "***Teacher");
    }
}
