package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月31日 20:11:00
 * @Description: TODO
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public ModelAndView hello() {
        return new ModelAndView("hello")
                .addObject("hello", "***Teacher");
    }
}
